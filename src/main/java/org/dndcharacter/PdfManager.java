package org.dndcharacter;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class PdfManager {

    private final File TEMPLATE_PATH = new File("src/main/resources/DnD_5E_CharacterSheet.pdf");
    private final File OUTPUT_PATH;
    private PDDocument charSheet;
    private PDAcroForm acro;

    public PdfManager(String name) {
        OUTPUT_PATH = new File("created characters/" + name + ".pdf");
        open();
    }

    public void open() {
        try {
            charSheet = Loader.loadPDF(TEMPLATE_PATH);
            PDDocumentCatalog catalog = charSheet.getDocumentCatalog();
            acro = catalog.getAcroForm();
        } catch (IOException e) {
            System.out.println("Unable to load template character sheet --" + e.getMessage());
        }
    }

    public void write(String field, String content) {
        try {
            acro.getField(field).setValue(content);
        } catch (IOException e) {
            System.out.println("Error writing data to '" + field + "' field --" + e.getMessage());
        }
    }

    public void write(Map<String, String> contents) {
        for (Iterator<PDField> it = acro.getFieldIterator(); it.hasNext(); ) {
            PDField field = it.next();
            if (contents.containsKey(field.getFullyQualifiedName())) {
                if (field.getFieldType().equals("PDCheckBox")) {
                    PDCheckBox checkBox = new PDCheckBox(field.getAcroForm());
                    try {
                        checkBox.check();
                    } catch (IOException e) {
                        System.out.println("Bad check box");
                    }
                }
                try {
                    acro.getField(field.getFullyQualifiedName()).setValue(contents.get(field.getFullyQualifiedName()));
                } catch (IOException e) {
                    System.out.println("Broken");
                }
            }
        }
    }

    public void close() {
        try {
            charSheet.save(OUTPUT_PATH);
            charSheet.close();
        } catch (IOException e) {
            System.out.println("There was an error saving the new character sheet --" + e.getMessage());
        }
    }
}

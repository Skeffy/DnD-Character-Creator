package org.dndcharacter;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdfwriter.ContentStreamWriter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDTextField;

import java.io.File;
import java.io.IOException;
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
            //PDTextField pdTextField = new PDTextField(acro);
            //pdTextField.getDefaultAppearance();
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
        try {
            for (String key : contents.keySet()) {
                acro.getField(key).setValue(contents.get(key));
            }
        } catch (IOException e) {
            System.out.println("Error writing data to PDF --" + e.getMessage());
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

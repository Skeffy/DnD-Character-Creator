package org.dndcharacter;

import org.dndcharacter.model.Character;
import org.dndcharacter.model.CharacterSheet;
import org.dndcharacter.model.backgrounds.Acolyte;
import org.dndcharacter.model.backgrounds.Background;
import org.dndcharacter.model.classes.Barbarian;
import org.dndcharacter.model.classes.BaseClass;
import org.dndcharacter.model.races.Dwarf;
import org.dndcharacter.model.races.Race;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<String> statNames = List.of("Strength", "Constitution", "Charisma", "Wisdom", "Intelligence", "Dexterity");
        Race dwarf = new Dwarf(null);
        BaseClass barbarian = new Barbarian();
        Background acolyte = new Acolyte("Elvish", "Draconic");
        Character character = new Character("Gregulon Stunmkas", barbarian, dwarf, acolyte, "Chaotic Neutral", statNames);
        CharacterSheet characterSheet = new CharacterSheet(character);
        PdfManager pdfManager = new PdfManager(character.getName());
        pdfManager.write(characterSheet.getTextFields());
        pdfManager.close();
    }
}
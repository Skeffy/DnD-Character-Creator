package org.dndcharacter.model;

import java.util.HashMap;
import java.util.Map;

public class CharacterSheet {

    Map<String, String> textFields = new HashMap<>();

    public CharacterSheet(Character character) {
        //general info
        textFields.put("CharacterName", character.getName());
        textFields.put("ClassLevel", character.getClassLevel());
        textFields.put("Background", character.getBackgroundName());
        textFields.put("Race", character.getRaceName());
        textFields.put("Alignment", character.getAlignment());

        textFields.put("ProfBonus", character.getProfBonus());
        //textFields.put("AC", );
        textFields.put("Initiative", character.getStatModifiers().get("Dexterity").toString());
        textFields.put("Speed", character.getSpeed());
        textFields.put("HPMax", character.getHp());
        textFields.put("HPCurrent", character.getHp());

        //base stats and modifiers
        textFields.put("STR", character.getStats().get("Strength").toString());
        textFields.put("DEX", character.getStats().get("Dexterity").toString());
        textFields.put("CON", character.getStats().get("Constitution").toString());
        textFields.put("INT", character.getStats().get("Intelligence").toString());
        textFields.put("WIS", character.getStats().get("Wisdom").toString());
        textFields.put("CHA", character.getStats().get("Charisma").toString());
        textFields.put("STRmod", character.getStatModifiers().get("Strength").toString());
        textFields.put("DEXmod", character.getStatModifiers().get("Dexterity").toString());
        textFields.put("CONmod", character.getStatModifiers().get("Constitution").toString());
        textFields.put("INTmod", character.getStatModifiers().get("Intelligence").toString());
        textFields.put("WISmod", character.getStatModifiers().get("Wisdom").toString());
        textFields.put("CHAmod", character.getStatModifiers().get("Charisma").toString());

        //saving throws and skills
        for (String field : character.getSkillAndSaveProficiencies()) {
            textFields.put(field + "CheckBox", "Yes");
        }

        //features and traits
        String featuresAndTraits = "";
        for (String feature : character.getFeaturesAndTraits()) {
            featuresAndTraits += feature + " \n\n";
        }
        textFields.put("Features and Traits", featuresAndTraits);

        //languages and proficiencies
        String proficiencies = "";
        for (String proficiency : character.getProficienciesAndLanguages()) {
            proficiencies += proficiency + " \n";
        }
        textFields.put("ProficienciesLang", proficiencies);
    }

    public Map<String, String> getTextFields() {
        return textFields;
    }
}

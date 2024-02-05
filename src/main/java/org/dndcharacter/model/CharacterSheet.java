package org.dndcharacter.model;

import java.util.HashMap;
import java.util.Map;

public class CharacterSheet {

    Map<String, String> characterData = new HashMap<>();

    public CharacterSheet(Character character) {
        //general info
        characterData.put("CharacterName", character.getName());
        characterData.put("ClassLevel", character.getClassLevel());
        characterData.put("Background", character.getBackgroundName());
        characterData.put("Race", character.getRaceName());
        characterData.put("Alignment", character.getAlignment());

        characterData.put("ProfBonus", "+" + character.getProfBonus().toString());
        //textFields.put("AC", );
        characterData.put("Initiative", character.getStatModifiers().get("Dexterity").toString());
        characterData.put("Speed", character.getSpeed());
        characterData.put("HPMax", character.getHp());
        characterData.put("HPCurrent", character.getHp());

        //base stats and modifiers
        characterData.put("STR", character.getStats().get("Strength").toString());
        characterData.put("DEX", character.getStats().get("Dexterity").toString());
        characterData.put("CON", character.getStats().get("Constitution").toString());
        characterData.put("INT", character.getStats().get("Intelligence").toString());
        characterData.put("WIS", character.getStats().get("Wisdom").toString());
        characterData.put("CHA", character.getStats().get("Charisma").toString());
        characterData.put("STRmod", character.getStatModifiers().get("Strength").toString());
        characterData.put("DEXmod", character.getStatModifiers().get("Dexterity").toString());
        characterData.put("CONmod", character.getStatModifiers().get("Constitution").toString());
        characterData.put("INTmod", character.getStatModifiers().get("Intelligence").toString());
        characterData.put("WISmod", character.getStatModifiers().get("Wisdom").toString());
        characterData.put("CHAmod", character.getStatModifiers().get("Charisma").toString());

        //saving throws and skills
        for (String field : character.getSkillAndSaveProficiencies()) {
            characterData.put(field + "CheckBox", "Yes");
        }

        //features and traits
        String featuresAndTraits = "";
        for (String feature : character.getFeaturesAndTraits()) {
            featuresAndTraits += feature + " \n\n";
        }
        characterData.put("Features and Traits", featuresAndTraits);

        //languages and proficiencies
        String proficiencies = "";
        for (String proficiency : character.getProficienciesAndLanguages()) {
            proficiencies += proficiency + " \n";
        }
        characterData.put("ProficienciesLang", proficiencies);

        //saving throw and skill modifiers
        for (String skill : character.getSkillAndSaveModifiers().keySet()) {
            characterData.put(skill, character.getSkillAndSaveModifiers().get(skill).toString());
        }
    }

    public Map<String, String> getTextFields() {
        return characterData;
    }
}

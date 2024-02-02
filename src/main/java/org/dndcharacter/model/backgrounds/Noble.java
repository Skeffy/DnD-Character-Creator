package org.dndcharacter.model.backgrounds;

public class Noble extends Background{

    public Noble(String tool, String language) {
        skills.add("History");
        skills.add("Persuasion");
        proficiencies.add(tool);
        languages.add(language);
        equipment.add("Fine clothes");
        equipment.add("Signet ring");
        equipment.add("Scroll of pedigree");
        equipment.add("gold-25");
    }
}

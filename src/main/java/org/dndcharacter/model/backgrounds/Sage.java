package org.dndcharacter.model.backgrounds;

public class Sage extends Background{

    public Sage(String lang1, String lang2) {
        skills.add("Arcana");
        skills.add("History");
        languages.add(lang1);
        languages.add(lang2);
        equipment.add("Bottle of black ink");
        equipment.add("Quill");
        equipment.add("Small knife");
        equipment.add("Letter from a dead colleague posing a question you have not yet been able to answer");
        equipment.add("Common clothes");
        equipment.add("gold-10");
    }
}

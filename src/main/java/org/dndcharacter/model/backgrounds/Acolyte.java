package org.dndcharacter.model.backgrounds;

public class Acolyte extends Background{

    public Acolyte(String lang1, String lang2) {
        name = "Acolyte";
        skills.add("Insight");
        skills.add("Religion");
        languages.add(lang1);
        languages.add(lang2);
        equipment.add("A holy symbol");
        equipment.add("Prayer book");
        equipment.add("5 sticks of incense");
        equipment.add("Vestments");
        equipment.add("Set of common clothes");
        equipment.add("gold-15");
    }
}

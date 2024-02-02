package org.dndcharacter.model.backgrounds;

public class Entertainer extends Background{

    public Entertainer(String instrument, String favor) {
        skills.add("Acrobatics");
        skills.add("Performance");
        proficiencies.add("Disguise Kit");
        proficiencies.add(instrument);
        equipment.add(instrument);
        equipment.add(favor);
        equipment.add("Costume");
        equipment.add("gold-15");
    }
}

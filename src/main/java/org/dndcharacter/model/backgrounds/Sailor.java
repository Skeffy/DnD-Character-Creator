package org.dndcharacter.model.backgrounds;

public class Sailor extends Background{

    public Sailor(String vehicle) {
        skills.add("Athletics");
        skills.add("Perception");
        proficiencies.add("Navigator's tools");
        proficiencies.add(vehicle);
        equipment.add("Belaying pin (club)");
        equipment.add("50 feet of silk rope");
        equipment.add("Lucky charm");
        equipment.add("Common clothes");
        equipment.add("gold-10");
    }
}

package org.dndcharacter.model.backgrounds;

public class Soldier extends Background{

    public Soldier(String tool, String vehicle) {
        skills.add("Athletics");
        skills.add("Intimidation");
        proficiencies.add(tool);
        proficiencies.add(vehicle);
        equipment.add("Insignia of rank");
        equipment.add("Trophy from a fallen enemy");
        equipment.add("Set of bone dice");
        equipment.add("gold-10");
    }
}

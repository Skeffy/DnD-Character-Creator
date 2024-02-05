package org.dndcharacter.model.backgrounds;

public class Charlatan extends Background{

    public Charlatan(String tool) {
        skills.add("Deception");
        skills.add("SleightOfHand");
        proficiencies.add("Disguise kit");
        proficiencies.add("Forgery kit");
        equipment.add("Set of fine clothes");
        equipment.add("Disguise kit");
        equipment.add(tool);
        equipment.add("gold-15");
    }
}

package org.dndcharacter.model.races;

public class Tiefling extends Race{

    public Tiefling() {
        name = "Tiefling";
        speed = "30";
        size = "Medium";
        abilityScoreRacialModifier.put("Intelligence", 1);
        abilityScoreRacialModifier.put("Charisma", 2);
        languages.add("Common");
        languages.add("Infernal");
        featuresAndTraits.add("Darkvision - You can see in dim light within 60 feet of you as if it were bright light, " +
                "and in darkness as if it were dim light. You can't discern color in darkness, only shades of grey.");
        featuresAndTraits.add("Hellish Resistance - You have resistance to fire damage.");
        featuresAndTraits.add("Infernal Legacy - YOu know the Thaumaturgy cantrip. When you reach 3rd level, you can " +
                "cast the Hellish Rebuke spell as a 2nd level once per long rest. At 5th level, you can cast the " +
                "Darkness spell once per long rest. Charisma is your spellcasting ability for these spells.");
    }
}

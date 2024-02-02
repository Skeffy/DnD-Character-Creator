package org.dndcharacter.model.races;

public class Halfling extends Race{

    public Halfling(String subrace) {
        this.subrace = subrace;
        speed = "25";
        size = "Small";
        abilityScoreRacialModifier.put("Dexterity", 2);
        languages.add("Common");
        languages.add("Halfling");
        featuresAndTraits.add("Lucky - When you roll a 1 on the d20 for an attack roll, ability check, or saving throw, " +
                "you can reroll the die and must use the new roll.");
        featuresAndTraits.add("Brave - You have advantage on saving throws against being frightened.");
        featuresAndTraits.add("Halfling Nimbleness - You can move through the space of any creature that is of a size " +
                "larger than yours.");

        if (subrace.equalsIgnoreCase("Lightfoot")) {
            name = subrace;
            abilityScoreRacialModifier.put("Charisma", 1);
            featuresAndTraits.add("Naturally Stealthy - YOu can attempt to hide even when you are obscured only by a " +
                    "creature that is at least one size larger than you.");
        } else if (subrace.equalsIgnoreCase("Stout")) {
            name = subrace;
            abilityScoreRacialModifier.put("Constitution", 1);
            featuresAndTraits.add("Stout Resilience - YOu have advantage on saving throws against poison, and you have " +
                    "resistance against poison damage.");
        } else {
            name = "Halfling";
        }
    }
}

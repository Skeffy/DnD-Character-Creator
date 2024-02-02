package org.dndcharacter.model.races;

public class HalfOrc extends Race{

    public HalfOrc() {
        name = "Half-Orc";
        speed = "30";
        size = "Medium";
        abilityScoreRacialModifier.put("Strength", 2);
        abilityScoreRacialModifier.put("Constitution", 1);
        languages.add("Common");
        languages.add("Orc");
        skills.add("Intimidation");
        featuresAndTraits.add("Darkvision - You can see in dim light within 60 feet of you as if it were bright light, " +
                "and in darkness as if it were dim light. You can't discern color in darkness, only shades of grey.");
        featuresAndTraits.add("Relentless Endurance - Once per long rest, when you are reduced to 0 hit points but not " +
                "killed outright, you can drop to 1 hit point instead.");
        featuresAndTraits.add("Savage Attacks - When you score a critical hit with a melee weapon attack, you can roll " +
                "one of the weapon's damage dice one additional time and add it to the extra damage of the critical hit.");
    }
}

package org.dndcharacter.model.races;

public class Dragonborn extends Race{

    public Dragonborn() {
        name = "Dragonborn";
        speed = "30";
        size = "Medium";
        abilityScoreRacialModifier.put("Strength", 2);
        abilityScoreRacialModifier.put("Charisma", 1);
        languages.add("Common");
        languages.add("Draconic");
        featuresAndTraits.add("Damage Resistance - YOu have resistance to the damage type associated with your draconic " +
                "ancestry.");
        featuresAndTraits.add("Breath Weapon - You can use your action to exhale destructive energy. When you use your " +
                "breath weapon, each affected creature must make a saving throw, the type of which is determined by " +
                "your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your " +
                "proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful " +
                "one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level.");
        //TODO Draconic Ancestry
    }
}

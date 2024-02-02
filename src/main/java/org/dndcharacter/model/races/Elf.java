package org.dndcharacter.model.races;

public class Elf extends Race{

    public Elf(String subrace) {
        this.subrace = subrace;
        speed = "30";
        size = "Medium";
        languages.add("Common");
        languages.add("Elvish");
        abilityScoreRacialModifier.put("Dexterity", 2);
        skills.add("Perception");
        featuresAndTraits.add("Darkvision - You can see in dim light within 60 feet of you as if it were bright light, " +
                "and in darkness as if it were dim light. You can't discern color in darkness, only shades of grey.");
        featuresAndTraits.add("Fey Ancestry - You have advantage on saving throws against being charmed, and magic " +
                "can't put you to sleep.");
        featuresAndTraits.add("Trance - Elves don't need to sleep. Instead, they meditate deeply, remaining semiconscious, " +
                "for 4 hours a day. After resting in this way, you gain the same benefit that a human does from 8 hours " +
                "of sleep.");

        if (subrace.equalsIgnoreCase("High Elf")) {
            abilityScoreRacialModifier.put("Intelligence", 1);
            proficiencies.add("Longsword");
            proficiencies.add("Shortsword");
            proficiencies.add("Shortbow");
            proficiencies.add("Longbow");
            //TODO Cantrip: You know one cantrip from the wizard spell list. Int is your casting ability.
            //TODO extra language of your choice.
        } else if (subrace.equalsIgnoreCase("Wood Elf")) {
            abilityScoreRacialModifier.put("Wisdom", 1);
            proficiencies.add("Longsword");
            proficiencies.add("Shortsword");
            proficiencies.add("Shortbow");
            proficiencies.add("Longbow");
            speed = "35";
            featuresAndTraits.add("Mask of the Wild - You can attempt to hide even when you are only lightly obscured " +
                    "by foliage, heavy rain, falling snow, mist, and other natural phenomena.");
        } else if (subrace.equalsIgnoreCase("Dark Elf (Drow)")) {
            abilityScoreRacialModifier.put("Charisma", 1);
            featuresAndTraits.add("Superior Darkvision - YOur darkvision has a radius of 120 feet.");
            featuresAndTraits.add("Sunlught Sensitivity - YOu have disadvantage on attack rolls and on Wisdom (Perception) " +
                    "checks that rely on sight when you, the target of your attack, or whatever you are trying to perceive " +
                    "is in direct sunlight");
            featuresAndTraits.add("Drow Magic - You know the Dancing Lights cantrip. When you reach 3rd level, you can " +
                    "cast the Faerie Fire spell once per long rest. When you reach 5th level, you can cast the Darkness " +
                    "spell once per long rest. Charisma is your spellcasting ability for these spells.");
            proficiencies.add("Rapier");
            proficiencies.add("Shortsword");
            proficiencies.add("Hand Crossbow");
        } else {
            name = "Elf";
        }
    }
}

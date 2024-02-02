package org.dndcharacter.model.races;

public class Dwarf extends Race {
//TODO: figure out Tool Proficiency
    public Dwarf(String subrace) {
        //Base stats, buffs, languages, and proficiencies that apply to ALL dwarves regardless of subclass
        this.subrace = subrace;
        speed = "25";
        size = "Medium";
        languages.add("Common");
        languages.add("Dwarvish");
        abilityScoreRacialModifier.put("Constitution", 2);
        proficiencies.add("Battleaxe");
        proficiencies.add("Handaxe");
        proficiencies.add("Light hammer");
        proficiencies.add("Warhammer");
        featuresAndTraits.add("Stonecunning - Whenever you make an Intelligence (History) check related to the origin " +
                "of stonework, you are considered proficient in the History skill and add double your proficiency " +
                "bonus to the check.");
        featuresAndTraits.add("Darkvision - You can see in dim light within 60 feet of you as if it were bright light, " +
                "and in darkness as if it were dim light. You can't discern color in darkness, only shades of grey.");
        featuresAndTraits.add("Dwarven Resilience - You have advantage on saving throws against poison, and you have " +
                "resistance against poison damage.");

        if (subrace == null) {
            name = "Dwarf";
        } else if (subrace.equalsIgnoreCase("hill dwarf")) {
            name = "Hill Dwarf";
            abilityScoreRacialModifier.put("Wisdom", 1);
            featuresAndTraits.add("Dwarven Toughness - Your hit point maximum increases by 1, and it increases by 1 " +
                    "every time you gain a level.");
        } else if (subrace.equalsIgnoreCase("mountain dwarf")) {
            name = "Mountain Dwarf";
            abilityScoreRacialModifier.put("Strength", 2);
            featuresAndTraits.add("Dwarven armor training");
            proficiencies.add("Light armor");
            proficiencies.add("Medium armor");
        } else {
            name = "Dwarf";
        }
    }
}

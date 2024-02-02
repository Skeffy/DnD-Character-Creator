package org.dndcharacter.model.races;

public class Gnome extends Race{

    public Gnome(String subrace) {
        this.subrace = subrace;
        speed = "25";
        size = "Small";
        abilityScoreRacialModifier.put("Intelligence", 2);
        languages.add("Common");
        languages.add("Gnomish");
        featuresAndTraits.add("Darkvision - You can see in dim light within 60 feet of you as if it were bright light, " +
                "and in darkness as if it were dim light. You can't discern color in darkness, only shades of grey.");
        featuresAndTraits.add("Gnome Cunning - You have advantage on all Intelligence, Wisdom, and Charisma saving " +
                "throws against magic.");

        if (subrace.equalsIgnoreCase("Forest Gnome")) {
            name = subrace;
            abilityScoreRacialModifier.put("Dexterity", 1);
            featuresAndTraits.add("Natural Illusionist - You know the Minor Illusion cantrip. Intelligence is your " +
                    "spellcasting ability for it.");
            featuresAndTraits.add("Speak with Small Beasts - Through sounds and gestures, you are able to communicate " +
                    "simple ideas with small or smaller beasts. Forest Gnomes often keep squirrels, badgers, rabbits, " +
                    "moles, woodpeckers, and other creatures at beloved pets.");
        } else if (subrace.equalsIgnoreCase("Rock Gnome")) {
            name = subrace;
            abilityScoreRacialModifier.put("Constitution", 1);
            featuresAndTraits.add("Artificer's Lore - Whenever you make an Intelligence (History) check related to magic " +
                    "items, alchemical objects, or technological devices, you can add twice your proficiency bonus.");
            //TODO Tinker/clockwork devices
        } else {
            name = "Gnome";
        }
    }
}

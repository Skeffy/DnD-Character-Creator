package org.dndcharacter.model.races;

public class HalfElf extends Race{

    public HalfElf() {
        name = "Half-Elf";
        speed = "30";
        size = "Medium";
        abilityScoreRacialModifier.put("Charisma", 2);
        //TODO +1 to two additional stats of choice
        languages.add("Common");
        languages.add("Elvish");
        //TODO +1 additional language of choice
        featuresAndTraits.add("Darkvision - You can see in dim light within 60 feet of you as if it were bright light, " +
                "and in darkness as if it were dim light. You can't discern color in darkness, only shades of grey.");
        featuresAndTraits.add("Fey Ancestry - You have advantage on saving throws against being charmed, and magic " +
                "can't put you to sleep.");
        //TODO +2 additional skill proficiencies of choice
    }
}

package org.dndcharacter.model.races;

public class Human extends Race{

    public Human() {
        name = "Human";
        speed = "30";
        size = "Medium";
        abilityScoreRacialModifier.put("Strength", 1);
        abilityScoreRacialModifier.put("Dexterity", 1);
        abilityScoreRacialModifier.put("Constitution", 1);
        abilityScoreRacialModifier.put("Intelligence", 1);
        abilityScoreRacialModifier.put("Wisdom", 1);
        abilityScoreRacialModifier.put("Charisma", 1);
        languages.add("Common");
        //TODO one additional language of choice
    }
}

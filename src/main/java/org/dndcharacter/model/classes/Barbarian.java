package org.dndcharacter.model.classes;

public class Barbarian extends BaseClass{

    public Barbarian() {
        name = "Barbarian";
        hitDie = 12;
        skillsAndSaveProficiencies.add("Strength");
        skillsAndSaveProficiencies.add("Constitution");
        skillsAndSaveProficiencies.add("AnimalHandling");
        skillsAndSaveProficiencies.add("Athletics");
        skillsAndSaveProficiencies.add("Intimidation");
        skillsAndSaveProficiencies.add("Nature");
        skillsAndSaveProficiencies.add("Perception");
        skillsAndSaveProficiencies.add("Survival");
        proficiencies.add("Light Armor");
        proficiencies.add("Medium Armor");
        proficiencies.add("Shields");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Martial Weapons");
    }
}

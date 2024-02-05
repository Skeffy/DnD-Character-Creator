package org.dndcharacter.model.classes;

public class Barbarian extends BaseClass{

    public Barbarian() {
        name = "Barbarian";
        hitDie = 12;
        skillAndSaveProficiencies.add("Strength");
        skillAndSaveProficiencies.add("Constitution");
        skillAndSaveProficiencies.add("AnimalHandling");
        skillAndSaveProficiencies.add("Athletics");
        skillAndSaveProficiencies.add("Intimidation");
        skillAndSaveProficiencies.add("Nature");
        skillAndSaveProficiencies.add("Perception");
        skillAndSaveProficiencies.add("Survival");
        proficiencies.add("Light Armor");
        proficiencies.add("Medium Armor");
        proficiencies.add("Shields");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Martial Weapons");
    }
}

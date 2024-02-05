package org.dndcharacter.model.classes;

public class Barbarian extends BaseClass{

    public Barbarian() {
        name = "Barbarian";
        hitDie = 12;
        savingThrows.add("Strength");
        savingThrows.add("Constitution");
        skills.add("AnimalHandling");
        skills.add("Athletics");
        skills.add("Intimidation");
        skills.add("Nature");
        skills.add("Perception");
        skills.add("Survival");
        proficiencies.add("Light Armor");
        proficiencies.add("Medium Armor");
        proficiencies.add("Shields");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Martial Weapons");
    }
}

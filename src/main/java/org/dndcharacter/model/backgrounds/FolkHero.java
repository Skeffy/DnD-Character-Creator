package org.dndcharacter.model.backgrounds;

public class FolkHero extends Background{

    public FolkHero(String tool, String vehicle) {
        skills.add("AnimalHandling");
        skills.add("Survival");
        proficiencies.add(tool);
        proficiencies.add(vehicle);
        equipment.add(tool);
        equipment.add("Shovel");
        equipment.add("Iron pot");
        equipment.add("Common clothes");
        equipment.add("gold-10");
    }
}

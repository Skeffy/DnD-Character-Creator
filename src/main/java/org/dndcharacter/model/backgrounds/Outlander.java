package org.dndcharacter.model.backgrounds;

public class Outlander extends Background{

    public Outlander(String instrument, String language) {
        skills.add("Athletics");
        skills.add("Survival");
        proficiencies.add(instrument);
        languages.add(language);
        equipment.add("Staff");
        equipment.add("Hunting trap");
        equipment.add("Trophy from an animal you've killed");
        equipment.add("Traveler's clothes");
        equipment.add("gold-10");
    }
}

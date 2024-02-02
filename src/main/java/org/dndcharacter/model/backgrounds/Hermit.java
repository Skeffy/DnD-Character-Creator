package org.dndcharacter.model.backgrounds;

public class Hermit extends Background{

    public Hermit(String language) {
        skills.add("Medicine");
        skills.add("Religion");
        proficiencies.add("Herbalism kit");
        languages.add(language);
        equipment.add("Scroll bag of notes from studies or prayers");
        equipment.add("Winter blanket");
        equipment.add("Common clothes");
        equipment.add("gold-5");
    }
}

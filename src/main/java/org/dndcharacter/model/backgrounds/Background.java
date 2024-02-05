package org.dndcharacter.model.backgrounds;

import java.util.HashSet;

public abstract class Background {

    protected String name;
    protected HashSet<String> proficiencies = new HashSet<>();
    protected HashSet<String> skills = new HashSet<>();
    protected HashSet<String> languages = new HashSet<>();
    protected HashSet<String> equipment = new HashSet<>();

    public String getName() {
        return name;
    }

    public HashSet<String> getProficiencies() {
        return proficiencies;
    }

    public HashSet<String> getSkills() {
        return skills;
    }

    public HashSet<String> getLanguages() {
        return languages;
    }

    public HashSet<String> getEquipment() {
        return equipment;
    }
}

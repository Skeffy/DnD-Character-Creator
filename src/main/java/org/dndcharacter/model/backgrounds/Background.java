package org.dndcharacter.model.backgrounds;

import java.util.ArrayList;
import java.util.List;

public abstract class Background {

    protected String name;
    protected List<String> proficiencies = new ArrayList<>();
    protected List<String> skills = new ArrayList<>();
    protected List<String> languages = new ArrayList<>();
    protected List<String> equipment = new ArrayList<>();

    public String getName() {
        return name;
    }

    public List<String> getProficiencies() {
        return proficiencies;
    }

    public List<String> getSkills() {
        return skills;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public List<String> getEquipment() {
        return equipment;
    }
}

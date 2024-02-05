package org.dndcharacter.model.races;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public abstract class Race {

    protected String name;
    protected String speed;
    protected String size;
    protected Map<String, Integer> abilityScoreRacialModifier = new HashMap<>();
    protected HashSet<String> languages = new HashSet<>();
    protected String subrace = null;
    protected HashSet<String> proficiencies = new HashSet<>();
    protected HashSet<String> featuresAndTraits = new HashSet<>();
    protected HashSet<String> skills = new HashSet<>();

    public boolean hasSubrace() {
        return subrace != null;
    }

    public String getSubrace() {
        return subrace;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getAbilityScoreRacialModifier() {
        return abilityScoreRacialModifier;
    }

    public String getSpeed() {
        return speed;
    }

    public HashSet<String> getSkills() {
        return skills;
    }

    public String getSize() {
        return size;
    }

    public HashSet<String> getLanguages() {
        return languages;
    }

    public HashSet<String> getProficiencies() {
        return proficiencies;
    }

    public HashSet<String> getFeaturesAndTraits() {
        return featuresAndTraits;
    }
}

package org.dndcharacter.model.races;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Race {

    protected String name;
    protected String speed;
    protected String size;
    protected Map<String, Integer> abilityScoreRacialModifier = new HashMap<>();
    protected List<String> languages = new ArrayList<>();
    protected String subrace = null;
    protected List<String> proficiencies = new ArrayList<>();
    protected List<String> featuresAndTraits = new ArrayList<>();
    protected List<String> skills = new ArrayList<>();

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
}

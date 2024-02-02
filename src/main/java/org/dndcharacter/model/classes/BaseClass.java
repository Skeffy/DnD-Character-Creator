package org.dndcharacter.model.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseClass {

    protected String name;
    protected int level;
    protected int hitDie;
    protected int proficiencyBonus;
    protected List<String> proficiencies = new ArrayList<>();
    protected List<String> savingThrows = new ArrayList<>();
    protected List<String> skills = new ArrayList<>();

    public String getName() {
        return name;
    }

    public int getHitDie() {
        return hitDie;
    }

    public List<String> getSkills() {
        return skills;
    }
}

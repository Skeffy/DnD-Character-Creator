package org.dndcharacter.model.classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public abstract class BaseClass {

    protected String name;
    protected int level;
    protected int hitDie;
    protected HashSet<String> proficiencies = new HashSet<>();
    protected HashSet<String> skillsAndSaveProficiencies = new HashSet<>();

    public String getName() {
        return name;
    }

    public int getHitDie() {
        return hitDie;
    }

    public HashSet<String> getSkills() {
        return skillsAndSaveProficiencies;
    }
}

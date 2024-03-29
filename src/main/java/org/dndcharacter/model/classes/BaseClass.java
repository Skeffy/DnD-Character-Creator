package org.dndcharacter.model.classes;

import java.util.HashSet;

public abstract class BaseClass {

    protected String name;
    protected int level;
    protected int hitDie;
    protected HashSet<String> proficiencies = new HashSet<>();
    protected HashSet<String> skillAndSaveProficiencies = new HashSet<>();

    public String getName() {
        return name;
    }

    public int getHitDie() {
        return hitDie;
    }

    public HashSet<String> getSkillAndSaveProficiencies() {
        return skillAndSaveProficiencies;
    }

    public HashSet<String> getProficiencies() {
        return proficiencies;
    }
}

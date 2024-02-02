package org.dndcharacter.model;

import org.dndcharacter.model.backgrounds.Background;
import org.dndcharacter.model.classes.BaseClass;
import org.dndcharacter.model.races.Race;

import java.util.*;
import java.util.random.RandomGenerator;

public class Character {

    private int level = 1;
    private String hp;
    private BaseClass characterClass;
    private Race characterRace;
    private String name;
    private Background background;
    private String alignment;
    private Map<String, Integer> stats = new HashMap<>();
    private Map<String, Integer> statModifiers = new HashMap<>();
    private RandomGenerator randomGenerator = new Random();
    private String profBonus;

    public Character(String name, BaseClass characterClass, Race characterRace, Background background, String alignment, List<String> statNames) {
        this.name = name;
        this.characterClass = characterClass;
        this.characterRace = characterRace;
        this.background = background;
        this.alignment = alignment;
        List<Integer> unassignedStats = rollStats();
        assignStats(statNames, unassignedStats);
        modifyStats();
        setStatModifiers();
        setHp();
        setProfBonus();
    }

    public Character(List<String> statNames) {
        List<Integer> unassignedStats = rollStats();
        assignStats(statNames, unassignedStats);
    }

    private List<Integer> rollStats() {
        List<Integer> unassignedStats = new ArrayList<>();
        for (int i = 6; i > 0; i--) {
            List<Integer> rolls = new ArrayList<>();
            int total = 0;
            for (int x = 4; x > 0; x--) {
                rolls.add(randomGenerator.nextInt(1, 6));
            }
            Collections.sort(rolls);
            rolls.remove(0);
            for (int roll : rolls) {
                total += roll;
            }
            unassignedStats.add(total);
        }
        unassignedStats.sort(Collections.reverseOrder());
        return unassignedStats;
    }

    private void assignStats(List<String> statNames, List<Integer> unassignedStata) {
        int statNumber = 0;
        for (String stat : statNames) {
            stats.put(stat, unassignedStata.get(statNumber));
            statNumber++;
        }
    }

    private void modifyStats() {
        Map<String, Integer> modifiers = characterRace.getAbilityScoreRacialModifier();
        for (String stat : modifiers.keySet()) {
            Integer modifiedStat = stats.get(stat) + modifiers.get(stat);
            stats.put(stat, modifiedStat);
        }
    }

    private void setStatModifiers() {
        for (String stat : stats.keySet()) {
            if (stats.get(stat) <= 5) {
                statModifiers.put(stat, -3);
            } else if (stats.get(stat) <= 7) {
                statModifiers.put(stat, -2);
            } else if (stats.get(stat) <= 9) {
                statModifiers.put(stat, -1);
            } else if (stats.get(stat) <= 11) {
                statModifiers.put(stat, 0);
            } else if (stats.get(stat) <= 13) {
                statModifiers.put(stat, 1);
            } else if (stats.get(stat) <= 15) {
                statModifiers.put(stat, 2);
            } else if (stats.get(stat) <= 17) {
                statModifiers.put(stat, 3);
            } else if (stats.get(stat) <= 19) {
                statModifiers.put(stat, 4);
            } else {
                statModifiers.put(stat, 5);
            }
        }
    }

    private void setHp() {
        int hitPoints = 0;
        for (int x = 0; x < level; x++) {
            int baseRoll = randomGenerator.nextInt(1, characterClass.getHitDie());
            int conMod = statModifiers.get("Constitution");
            hitPoints += baseRoll + conMod;
        }
        hp = String.valueOf(hitPoints);
    }

    public Map<String, Integer> getStatModifiers() {
        return statModifiers;
    }

    public Map<String, Integer> getStats() {
        return stats;
    }

    public String getName() {
        return name;
    }

    public String getClassLevel() {
        return characterClass.getName() + " " + level;
    }

    public String getBackgroundName() {
        return background.getName();
    }

    public String getRaceName() {
        return characterRace.getName();
    }

    public String getAlignment() {
        return alignment;
    }

    public String getHp() {
        return hp;
    }

    public String getSpeed() {
        return characterRace.getSpeed();
    }

    public void setProfBonus() {
        int bonus = level/4 + 2;
        profBonus = String.valueOf("+" + bonus);
    }

    public String getProfBonus() {
        return profBonus;
    }
}

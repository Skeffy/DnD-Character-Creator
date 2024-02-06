package org.dndcharacter.model;

import org.dndcharacter.model.backgrounds.Background;
import org.dndcharacter.model.classes.BaseClass;
import org.dndcharacter.model.races.Race;

import java.util.*;

public class Character {

    private final String name;
    private final int level;
    private final String alignment;
    private final BaseClass characterClass;
    private final Race characterRace;
    private final Background background;
    private final Map<String, Integer> stats = new HashMap<>();
    private final Map<String, Integer> statModifiers;
    private final Set<String> proficienciesAndLanguages;
    private final HashSet<String> skillAndSaveProficiencies;
    private final Map<String, Integer> skillAndSaveModifiers;
    private final Map<String, String> skillNames = new HashMap<>();
    private final SplittableRandom random = new SplittableRandom();
    private final Integer profBonus;
    private final String hp;

    public Character(String name, int level, BaseClass characterClass, Race characterRace, Background background, String alignment,
                     List<String> statNames) {
        this.name = name;
        this.level = level;
        this.characterClass = characterClass;
        this.characterRace = characterRace;
        this.background = background;
        this.alignment = alignment;
        List<Integer> unassignedStats = rollStats();
        assignStats(statNames, unassignedStats);
        modifyStats();
        statModifiers = setStatModifiers();
        hp = setHp();
        profBonus = setProfBonus();
        skillAndSaveProficiencies = setSkillAndSaveProficiencies();
        proficienciesAndLanguages = setProficienciesAndLanguages();
        skillAndSaveModifiers = setSkillAndSaveModifiers();
    }

    private List<Integer> rollStats() {
        List<Integer> unassignedStats = new ArrayList<>();
        for (int i = 6; i > 0; i--) {
            List<Integer> rolls = new ArrayList<>();
            int total = 0;
            for (int x = 4; x > 0; x--) {
                rolls.add(random.nextInt(1, 6));
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

    private void assignStats(List<String> statNames, List<Integer> unassignedStats) {
        int statNumber = 0;
        for (String stat : statNames) {
            stats.put(stat, unassignedStats.get(statNumber));
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

    private Map<String, Integer> setStatModifiers() {
        Map<String, Integer> statModifiers = new HashMap<>();
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
        return statModifiers;
    }

    private String setHp() {
        int hitPoints = characterClass.getHitDie() + statModifiers.get("Constitution");
        if (level > 1) {
            for (int i = 1; i < level; i++) {
                int baseRoll = random.nextInt(1, characterClass.getHitDie());
                int conMod = statModifiers.get("Constitution");
                hitPoints += baseRoll + conMod;
            }
        }
        return String.valueOf(hitPoints);
    }

    private HashSet<String> setSkillAndSaveProficiencies() {
        HashSet<String> skillAndSaveProficiencies = new HashSet<>();
        skillAndSaveProficiencies.addAll(characterClass.getSkillAndSaveProficiencies());
        skillAndSaveProficiencies.addAll(characterRace.getSkills());
        skillAndSaveProficiencies.addAll(background.getSkills());
        return skillAndSaveProficiencies;
    }

    private Set<String> setProficienciesAndLanguages() {
        Set<String> proficienciesAndLanguages = new LinkedHashSet<>();
        proficienciesAndLanguages.addAll(characterRace.getLanguages());
        proficienciesAndLanguages.addAll(background.getLanguages());
        proficienciesAndLanguages.addAll(characterRace.getProficiencies());
        proficienciesAndLanguages.addAll(characterClass.getProficiencies());
        return proficienciesAndLanguages;
    }

    private Map<String, Integer> setSkillAndSaveModifiers() {
        Map<String, Integer> skillAndSaveModifiers = new HashMap<>();
        skillNames.put("Acrobatics", "Dexterity");
        skillNames.put("AnimalHandling", "Wisdom");
        skillNames.put("Arcana", "Intelligence");
        skillNames.put("Athletics", "Strength");
        skillNames.put("Deception", "Charisma");
        skillNames.put("History", "Intelligence");
        skillNames.put("Insight", "Wisdom");
        skillNames.put("Intimidation", "Charisma");
        skillNames.put("Investigation", "Intelligence");
        skillNames.put("Medicine", "Wisdom");
        skillNames.put("Nature", "Intelligence");
        skillNames.put("Perception", "Wisdom");
        skillNames.put("Performance", "Charisma");
        skillNames.put("Persuasion", "Charisma");
        skillNames.put("Religion", "Intelligence");
        skillNames.put("SleightOfHand", "Dexterity");
        skillNames.put("Stealth", "Dexterity");
        skillNames.put("Survival", "Wisdom");
        skillNames.put("Strength", "Strength");
        skillNames.put("Dexterity", "Dexterity");
        skillNames.put("Constitution", "Constitution");
        skillNames.put("Intelligence", "Intelligence");
        skillNames.put("Wisdom", "Wisdom");
        skillNames.put("Charisma", "Charisma");
        skillNames.put("PassivePerception", "Wisdom");
        for (String skill : skillNames.keySet()) {
            Integer modifier = 0;
            if (skillAndSaveProficiencies.contains(skill)) {
                modifier += profBonus;
            }
            if (skillAndSaveProficiencies.contains("Perception") && skill.equals("PassivePerception")) {
                modifier += profBonus + 10;
            }
            modifier += statModifiers.get(skillNames.get(skill));
            skillAndSaveModifiers.put(skill, modifier);
        }
        return skillAndSaveModifiers;
    }

    public Integer setProfBonus() {
        return (int)Math.ceil((double) level / 4 + 1);
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

    public Integer getProfBonus() {
        return profBonus;
    }

    public HashSet<String> getSkillAndSaveProficiencies() {
        return skillAndSaveProficiencies;
    }

    public Set<String> getProficienciesAndLanguages() {
        return proficienciesAndLanguages;
    }

    public HashSet<String> getFeaturesAndTraits() {
        return characterRace.getFeaturesAndTraits();
    }

    public Map<String, Integer> getSkillAndSaveModifiers() {
        return skillAndSaveModifiers;
    }
}

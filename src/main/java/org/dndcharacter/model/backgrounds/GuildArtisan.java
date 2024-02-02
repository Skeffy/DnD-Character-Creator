package org.dndcharacter.model.backgrounds;

public class GuildArtisan extends Background{

    public GuildArtisan(String tool, String language) {
        skills.add("Insight");
        skills.add("Persuasion");
        proficiencies.add(tool);
        languages.add(language);
        equipment.add(tool);
        equipment.add("Guild letter of introduction");
        equipment.add("Traveler's clothes");
        equipment.add("gold-15");
    }
}

package com.eplinsights.teamstatistics.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "team_statistics")
public class TeamStatistics {
    @Id
    private String id;
    private String teamName;
    private int totalPlayers;
    private int totalGoalsScored;
    private int totalAssists;
    private double averagePerformance;
    private String mostEffectivePosition;
}
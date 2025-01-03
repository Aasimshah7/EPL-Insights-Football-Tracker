package com.eplinsights.teamstatistics.service;

import com.eplinsights.teamstatistics.client.PlayerClient;
import com.eplinsights.teamstatistics.model.Player;
import com.eplinsights.teamstatistics.model.TeamStatistics;
import com.eplinsights.teamstatistics.repository.TeamStatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TeamStatisticsService {
    @Autowired
    private PlayerClient playerClient;

    @Autowired
    private TeamStatisticsRepository teamStatisticsRepository;

    public TeamStatistics generateTeamStatistics(String teamName) {
        // Fetch players for the team
        List<Player> players = playerClient.getPlayersByTeam(teamName);

        // Create team statistics
        TeamStatistics teamStats = new TeamStatistics();
        teamStats.setTeamName(teamName);
        teamStats.setTotalPlayers(players.size());
        teamStats.setTotalGoalsScored(players.stream().mapToInt(Player::getGoalsScored).sum());
        teamStats.setTotalAssists(players.stream().mapToInt(Player::getAssists).sum());
        teamStats.setAveragePerformance(players.stream().mapToDouble(Player::getPerformance).average().orElse(0.0));

        // Find most effective position
        Map<String, Long> positionCounts = players.stream()
                .collect(Collectors.groupingBy(Player::getPosition, Collectors.counting()));
        teamStats.setMostEffectivePosition(
                positionCounts.entrySet().stream()
                        .max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey)
                        .orElse("Unknown")
        );

        // Save and return
        return teamStatisticsRepository.save(teamStats);
    }

    public TeamStatistics getTeamStatistics(String teamName) {
        return teamStatisticsRepository.findByTeamName(teamName);
    }
}
package com.eplinsights.teamstatistics.controller;

import com.eplinsights.teamstatistics.model.TeamStatistics;
import com.eplinsights.teamstatistics.service.TeamStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/team-statistics")
public class TeamStatisticsController {
    @Autowired
    private TeamStatisticsService teamStatisticsService;

    @GetMapping("/generate/{teamName}")
    public TeamStatistics generateTeamStatistics(@PathVariable String teamName) {
        return teamStatisticsService.generateTeamStatistics(teamName);
    }

    @GetMapping("/{teamName}")
    public TeamStatistics getTeamStatistics(@PathVariable String teamName) {
        return teamStatisticsService.getTeamStatistics(teamName);
    }
}
package com.eplinsights.teamstatistics.repository;

import com.eplinsights.teamstatistics.model.TeamStatistics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamStatisticsRepository extends MongoRepository<TeamStatistics, String> {
    TeamStatistics findByTeamName(String teamName);
}
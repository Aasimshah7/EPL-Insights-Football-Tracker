package com.eplinsights.repository;

import com.eplinsights.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {
    List<Player> findByTeam(String team);
    List<Player> findByPosition(String position);
}
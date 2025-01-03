package com.eplinsights.teamstatistics.client;

import com.eplinsights.teamstatistics.model.Player;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "player-statistics-service", url = "${player-statistics-service.url}")
public interface PlayerClient {
    @GetMapping("/team/{team}")
    List<Player> getPlayersByTeam(@PathVariable String team);
}
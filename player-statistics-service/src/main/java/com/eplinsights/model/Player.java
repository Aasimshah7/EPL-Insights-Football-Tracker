package com.eplinsights.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "players")
public class Player {
    @Id
    private String id;
    private String name;
    private String team;
    private String position;
    private int goalsScored;
    private int assists;
    private double performance;
}
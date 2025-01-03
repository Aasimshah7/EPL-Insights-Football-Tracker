package com.eplinsights.teamstatistics.model;

import lombok.Data;

@Data
public class Player {
    private String id;
    private String name;
    private String team;
    private String position;
    private int goalsScored;
    private int assists;
    private double performance;
}
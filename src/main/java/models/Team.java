package models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Team {
    private static ArrayList<Team> allTeams = new ArrayList<>();
    private String teamName;
    private String teamMember1;
    private String teamMember2;
    private String teamMember3;
    private String teamMember4;
    private LocalDateTime createdAt;
    private int id;
    private boolean addedTeam;

    public Team (String teamName, String teamMember1, String teamMember2, String teamMember3, String teamMember4){
        this.teamName = teamName;
        this.teamMember1 = teamMember1;
        this.teamMember2 = teamMember2;
        this.teamMember3 = teamMember3;
        this.teamMember4 = teamMember4;
        this.createdAt = LocalDateTime.now();
        allTeams.add(this);
        this.id = allTeams.size();
        this.addedTeam = false;
    }
}

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

    public static ArrayList<Team> getAllTeams() {
        return allTeams;
    }

    public static void setAllTeams(ArrayList<Team> allTeams) {
        Team.allTeams = allTeams;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamMember1() {
        return teamMember1;
    }

    public void setTeamMember1(String teamMember1) {
        this.teamMember1 = teamMember1;
    }

    public String getTeamMember2() {
        return teamMember2;
    }

    public void setTeamMember2(String teamMember2) {
        this.teamMember2 = teamMember2;
    }

    public String getTeamMember3() {
        return teamMember3;
    }

    public void setTeamMember3(String teamMember3) {
        this.teamMember3 = teamMember3;
    }

    public String getTeamMember4() {
        return teamMember4;
    }

    public void setTeamMember4(String teamMember4) {
        this.teamMember4 = teamMember4;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAddedTeam() {
        return addedTeam;
    }

    public void setAddedTeam(boolean addedTeam) {
        this.addedTeam = addedTeam;
    }


}

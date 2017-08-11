package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class TeamTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        Team.clearAllTeams();
    }

    @Test
    public void NewTeamObjectGetsCorrectlyCreated_true() throws Exception {
        Team team = setupNewTeam();
        assertEquals(true, team instanceof Team);
    }

    @Test
    public void getCreatedAt_instantiatesWithCurrentTime_today() throws Exception {
        Team team = setupNewTeam();
        assertEquals(LocalDateTime.now().getDayOfWeek(), team.getCreatedAt().getDayOfWeek());
    }

    @Test
    public void TeamInstantiatesWithContent_true() throws Exception {
        Team Team = setupNewTeam();
        assertEquals("Team Programics", Team.getTeamName());
    }

    @Test
    public void AllTeamsAreCorrectlyReturned_true() throws Exception {
        Team team = setupNewTeam();
        Team otherTeam = setupNewTeam();
        assertEquals(2, Team.getAll().size());
    }

    @Test
    public void AllTeamsContainsAllTeams_true() throws Exception {
        Team team = setupNewTeam();
        Team otherTeam = setupNewTeam();
        assertTrue(Team.getAll().contains(team));
        assertTrue(Team.getAll().contains(otherTeam));
    }

    public Team setupNewTeam() {return new Team("Team Programics", "Jon Jones", "Meagan O'Neil", "Mikey McMike",
            "Anastasia Romanoff");}
}
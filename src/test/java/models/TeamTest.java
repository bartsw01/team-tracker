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
        Team sampleTeam = setupNewTeam();
        assertEquals(true, sampleTeam instanceof Team);
    }

    @Test
    public void getCreatedAt_instantiatesWithCurrentTime_today() throws Exception {
        Team sampleTeam = setupNewTeam();
        assertEquals(LocalDateTime.now().getDayOfWeek(), sampleTeam.getCreatedAt().getDayOfWeek());
    }

    @Test
    public void TeamInstantiatesWithContent_true() throws Exception {
        Team sampleTeam = setupNewTeam();
        assertEquals("Team Programics", sampleTeam.getTeamName());
    }

    @Test
    public void AllTeamsAreCorrectlyReturned_true() throws Exception {
        Team sampleTeam = setupNewTeam();
        Team otherSampleTeam = setupNewTeam();
        assertEquals(2, Team.getAll().size());
    }

    @Test
    public void AllTeamsContainsAllTeams_true() throws Exception {
        Team sampleTeam = setupNewTeam();
        Team otherSampleTeam = setupNewTeam();
        assertTrue(Team.getAll().contains(sampleTeam));
        assertTrue(Team.getAll().contains(otherSampleTeam));
    }

    @Test
    public void getId_TeamsInstantiateWithAnID_1() throws Exception {
        Team sampleTeam = setupNewTeam();
        assertEquals(1, sampleTeam.getId());
    }

    @Test
    public void findReturnsCorrectTeamWhenMoreThanOneTeamExists()throws Exception {
        Team sampleTeam = setupNewTeam();
        Team otherSampleTeam = setupNewTeam();
        assertEquals(1, Team.findById(otherSampleTeam.getId()).getId());
    }

    public Team setupNewTeam() {return new Team("Team Programics", "Eclectic Mix of Youthful Souls","Jon Jones",
            "Meagan O'Neil",
            "Mikey " +
            "McMike",
            "Anastasia Romanoff");}
}
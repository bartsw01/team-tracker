package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        assertEquals(false, team instanceof Team);
    }

    public Team setupNewTeam() {return new Team("Team Programics", "Jon Jones", "Meagan O'Neil", "Mikey McMike",
            "Anastasia Romanoff");}
}
package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_correct() {
        Team x = new Team("test-team");
        Team x1 = new Team("test-team");
        Team x2 = new Team("test-team");
        x1.addMember("d");
        x2.addMember("d");
        Team y = new Team("2");
        Team y1 = new Team("3");
        y.addMember("c");
        y1.addMember("c");
        int num=10;
        assert(team.equals(team));
        assert(team.equals(x));
        assert(!team.equals(y));
        assert(!team.equals(num));
        assert(!y.equals(y1));
        assert(x1.equals(x2));

    }
    @Test
    public void hashCode_correct(){
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
     
    }
    @Test
    public void hashCode_correct1(){
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
     
    }

}

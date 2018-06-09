package com.example.demo;

import com.example.demo.model.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void setMoveRock() {
        Player player = new Player();
        player.setMove("rock");
        assertEquals(player.move, "rock");
    }

    @Test
    public void setMoveNoArguments() {
        Player player = new Player();
        player.setMove();
        assertEquals(player.move, "scissors");
    }

}

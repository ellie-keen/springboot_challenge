package com.example.demo;

import com.example.demo.model.Player;
import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void setMoveRock() {
        Player player = new Player();
        player.setMove("rock");
        assertEquals("rock", player.move);
    }

    @Test
    public void getMove() {
        Player player = new Player();
        player.setMove("rock");
        assertEquals("rock", player.getMove());
    }

    @Test
    public void setMoveNoArguments() {
        Player player = mock(Player.class);
        player.setMove();
        when(player.getMove()).thenReturn("scissors");
        String move = player.getMove();
        assertEquals("scissors", move);
    }

}

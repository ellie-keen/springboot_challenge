package com.example.demo;
import com.example.demo.model.Game;
import com.example.demo.model.Player;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    Player player1 = new Player();
    Player player2 = new Player();

    @Test
    public void resultDrawSameMove() {
        Game game = new Game(player1, player2);
        player1.setMove("rock");
        player2.setMove("rock");
        assertEquals("Draw!", game.play());
    }

    @Test
    public void winWithRock(){
        player1.setMove("rock");
        player2.setMove("scissors");
        Game game = new Game(player1, player2);
        assertEquals("Player 1 wins!", game.play());
    }

    @Test
    public void loseWithRock(){
        player1.setMove("rock");
        player2.setMove("paper");
        Game game = new Game(player1, player2);
        assertEquals("Player 2 wins!", game.play());
    }

    @Test
    public void winWithScissors(){
        player1.setMove("scissors");
        player2.setMove("paper");
        Game game = new Game(player1, player2);
        assertEquals("Player 1 wins!", game.play());
    }

    @Test
    public void loseWithScissors(){
        player1.setMove("scissors");
        player2.setMove("rock");
        Game game = new Game(player1, player2);
        assertEquals("Player 2 wins!", game.play());
    }

    @Test
    public void winWithPaper(){
        player1.setMove("paper");
        player2.setMove("rock");
        Game game = new Game(player1, player2);
        assertEquals("Player 1 wins!", game.play());
    }

    @Test
    public void loseWithPaper(){
        player1.setMove("paper");
        player2.setMove("scissors");
        Game game = new Game(player1, player2);
        assertEquals("Player 2 wins!", game.play());
    }

}

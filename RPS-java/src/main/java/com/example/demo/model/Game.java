package com.example.demo.model;

import lombok.Data;

@Data

public class Game {

    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String play() {
        if (draw()) {
            return "Draw!";
        } else if (rockWins() || scissorsWins() || paperWins()) {
            return "Player 1 wins!";
        } else {
            return "Player 2 wins!";
        }
    }

    private Boolean rockWins() {
       return player1.move == "rock" && player2.move == "scissors";
    }

    private Boolean scissorsWins() {
        return player1.move == "scissors" && player2.move == "paper";
    }

    private Boolean paperWins() {
        return player1.move == "paper" && player2.move == "rock";
    }

    private Boolean draw() {
        return player1.move == player2.move;
    }
}

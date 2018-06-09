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

    public String play(){
        if (player1.move == player2.move) {
            return "Draw";
        } else if (player1.move == "rock" && player2.move == "scissors") {
            return "You win";
        } else if (player1.move == "scissors" && player2.move == "paper") {
            return "You win";
        } else if (player1.move == "paper" && player2.move == "rock") {
            return "You win";
        } else {
            return "You lose";
        }
    }
}

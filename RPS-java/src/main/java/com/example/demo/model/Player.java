package com.example.demo.model;

import lombok.Data;
import java.util.Random;

@Data

public class Player {

    public String move;

    public String getMove() {
        return this.move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public void setMove() {
        this.move = randomMove();
    }

    private String randomMove() {
        String [] rps = new String[]{"rock", "paper", "scissors"};
        int num = new Random().nextInt(rps.length);
        return rps[num];
    }

}



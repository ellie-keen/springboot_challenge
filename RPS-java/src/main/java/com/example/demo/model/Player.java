package com.example.demo.model;

import lombok.Data;

@Data

public class Player {

    public String move;

    public void setMove(String move) {
        this.move = move;
    }

    public void setMove() {
        this.move = "scissors";
    }

}



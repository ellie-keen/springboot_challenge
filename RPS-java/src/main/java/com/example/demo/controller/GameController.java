package com.example.demo.controller;

import com.example.demo.model.Game;
import com.example.demo.model.Player;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/api")
public class GameController {

    @ResponseBody
    @RequestMapping(method = POST, produces = "application/json")
    public String api(@RequestParam("move") String move) {
        Player player1 = new Player();
        Player player2 = new Player();
        player1.setMove(move);
        player2.setMove();
        Game game = new Game(player1, player2);
        String result = game.play();
        String data = String.format("{\"result\":\"%s\"}", result);
        return data;
    }
}
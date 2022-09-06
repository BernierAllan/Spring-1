package com.m2i.RPCcorrection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.m2i.RPCcorrection.service.Game;


@RestController
public class GameController {

	@Autowired
	Game game;
	
	@GetMapping("/score")
	public Game getScore() {
		return game;
	}
	
	@PutMapping("/score")
	public Game putScore(@RequestParam int win, @RequestParam int lose, @RequestParam int tie) {
		
		game.setWin(win);
		game.setLose(lose);
		game.setTie(tie);
		return game;
	}
			
	@DeleteMapping("/score")
	public Game deleteScore() {
		game.setLose(0);
		game.setTie(0);
		game.setWin(0);
		
		return game;
	}
	
	
	@PostMapping("/score")
	public Game postScore(@RequestParam String act) {
		
		switch (act) {
			case "win":
				game.setWin( game.getWin() + 1 );
				break;
	
			case "lose":
				game.setLose( game.getLose() + 1);
				break;
	
			case "tie":
				game.setTie( game.getTie() + 1 );
				break;
		}
		
		return game;
	}
	
	@PostMapping("/play")
	public String postPlay(@RequestParam String actplayer) {
		return game.play(actplayer);
	}
			
	
}

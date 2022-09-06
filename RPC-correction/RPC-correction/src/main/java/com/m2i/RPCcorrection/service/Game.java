package com.m2i.RPCcorrection.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class Game {
	private int win;
	private int lose;
	private int tie;
	
	private String[] listPlays = {"rocks", "papers", "scissors"};
	private Random r = new Random();
	
	
	
	public String play(String playerAction) {
		String ret = "";
		
		String serverAction = listPlays[r.nextInt(3)];
		
		switch(playerAction) {
			case "rocks":
				if (serverAction.equalsIgnoreCase("rocks")) {
					ret = "tie !";
					tie++;
				} else if (serverAction.equalsIgnoreCase("papers")) {
					ret = "lose !";
					lose++;
				} else {
					ret = "win !";
					win++;					
				}
				break;
			case "papers":
				if (serverAction.equalsIgnoreCase("papers")) {
					ret = "tie !";
					tie++;
				} else if (serverAction.equalsIgnoreCase("scissors")) {
					ret = "lose !";
					lose++;
				} else {
					ret = "win !";
					win++;					
				}
				break;
			case "scissors":
				if (serverAction.equalsIgnoreCase("scissors")) {
					ret = "tie !";
					tie++;
				} else if (serverAction.equalsIgnoreCase("rocks")) {
					ret = "lose !";
					lose++;
				} else {
					ret = "win !";
					win++;					
				}
				break;
		}
	
		
		return ret;
	}
	
	public Game(int win, int lose, int tie) {
		super();
		this.win = win;
		this.lose = lose;
		this.tie = tie;
	}
	public Game() {
		super();
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getTie() {
		return tie;
	}
	public void setTie(int tie) {
		this.tie = tie;
	}
	
	
}

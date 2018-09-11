package models;

import controllers.NetworkGame;

public class NaiveStrategy implements Strategy {
	
	public String getName() {
		return "Naive";
	}
	
	public int determineMove(Board b, NetworkGame g, int playerNumber) {
		return getRandomPlace(b, g, playerNumber);
	}
}

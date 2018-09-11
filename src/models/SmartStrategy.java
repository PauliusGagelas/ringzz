package models;

import controllers.NetworkGame;

public class SmartStrategy implements Strategy {
	public String getName() {
		return "Smart";
	}
	
	public int determineMove(Board b, NetworkGame g, int playerNumber) {
		return getRandomPlace(b, g, playerNumber);
	}
}

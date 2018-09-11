package models;

import controllers.NetworkGame;
public interface Strategy {
	String getName();
	
	int determineMove(Board b, NetworkGame g, int playerNumber);
	/* @ requires b != null && m != null; */
	default int getRandomPlace(Board b, NetworkGame g, int playerNumber) {
		//ArrayList<String> getAvailablePlaces = b.getAvailablePlaces(b, g, playerNumber);
		//System.out.println(getAvailablePlaces.size());
		return 0;
	}
}

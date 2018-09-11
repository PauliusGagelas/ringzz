package controllers;

public interface Game {
	
	/**
	 * Starts the Ringgz game. Asks after each game if user want to play again
	 */
	default public void startGame() {
//		boolean playingGame = true;
//		playerInfo();
//		
//		while (playingGame) {
//			setupPlayers();
//			reset();
//			play();
//			playingGame = view.readBoolean("\n> Play another time? (y/n)?", "y", "n");
//		}
	}
	
	public boolean gameOver();
	
	public void playerInfo();
	
	public void reset();
	
	public int[] firstMove();
	
	
}

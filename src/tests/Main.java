package tests;
import java.util.ArrayList;
import java.util.Scanner;

import controllers.LocalGame;

public class Main {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<String> humanNames = new ArrayList<String>();
		boolean notFinished = true;
		boolean validInput = true;
		int numberOfPlayers = 0;
		char[] typesOfPlayers = null;
		
		while (notFinished) {
			String response = "";
			System.out.println("Type h, s or n without space for a "
					+ "Human player, a smart computer player or a naive "
					+ "computer player");
			if (s.hasNext()) {
				response = s.nextLine();
				if (response.length() > 4 || response.length() < 2) {
					System.out.println("The maximum number of "
							+ "players is 4 and the minimum is 1");
					validInput = false;
				}
				response = response.toUpperCase();
				typesOfPlayers = response.toCharArray();
				numberOfPlayers = typesOfPlayers.length;
				for (char entry : typesOfPlayers) {
					if (entry != 'S' && entry != 'H' && entry != 'N') {
						System.out.println("Invalid player type: " + entry);
						validInput = false;
					}
					if (entry == 'H') {
						System.out.println("Enter the Human player's name");
					}
					if (s.hasNext()) {
						response = s.nextLine();
						humanNames.add(response);
					}
					System.out.println(humanNames);
				}
			}
			if (validInput) {
				notFinished = false;
			}
		}
		s.close();
		new LocalGame(numberOfPlayers, typesOfPlayers, humanNames);		
	}
}

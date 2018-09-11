package tests;

import java.util.ArrayList;

import controllers.LocalGame;

public class ComputerPlayerGameTest {
	public static void main(String[] args) {
		char[] types = {'S', 'S'};
		ArrayList<String> humanNames = new ArrayList<>();
		humanNames.add("Boop");
		humanNames.add("Beep");
		new LocalGame(2, types, humanNames);
	}
}

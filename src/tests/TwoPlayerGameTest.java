package tests;

import java.util.ArrayList;

import controllers.LocalGame;

public class TwoPlayerGameTest {
	public static void main(String[] args) {
		char[] types = {'H', 'H'};
		ArrayList<String> humanNames = new ArrayList<>();
		humanNames.add("Arnav");
		humanNames.add("Paulius");
		new LocalGame(2, types, humanNames);
	}
}

package tests;

import java.util.ArrayList;

import controllers.LocalGame;

public class ThreePlayerGameTest {
	public static void main(String[] args) {
		char[] types = {'N', 'N', 'N'};
		ArrayList<String> humanNames = new ArrayList<>();
		humanNames.add("Arnav");
		humanNames.add("Paulius");
		humanNames.add("James");
		new LocalGame(3, types, humanNames);
	}
}

package tests;

import java.util.ArrayList;

import controllers.LocalGame;

public class FourPlayerGameTest {
	public static void main(String[] args) {
		char[] types = {'N', 'N', 'N', 'N'};
		ArrayList<String> humanNames = new ArrayList<>();
		humanNames.add("Arnav");
		humanNames.add("Paulius");
		humanNames.add("James");
		humanNames.add("Matt");
		new LocalGame(4, types, humanNames);
		
	}
}

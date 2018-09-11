package tests;

import java.util.ArrayList;
import java.util.HashSet;

import controllers.NetworkGame;

public class NetworkedMain {

	public static void main(String[] args) {
		char[] types = {'H', 'H'};
		ArrayList<String> humanNames = new ArrayList<>();
		humanNames.add("Arnav");
		humanNames.add("Paulius");
		NetworkGame g = new NetworkGame(types, humanNames);
	}
	
	public static void startGame(HashSet<String> names) {
		char[] types = {'H', 'H'};
		ArrayList<String> humanNames = new ArrayList<>();
		humanNames.addAll(names);
		//NetworkGame g = new NetworkGame(names.size(), types, humanNames);
	}
}

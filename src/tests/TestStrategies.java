package models;
import java.util.ArrayList;

public class TestStrategies {

	public static void main(String[] args) {

		int playerNumber = 1;
		Player c = new ComputerPlayer(playerNumber, "Naive");
		ArrayList<Ring> rings = new ArrayList<>();
		rings.add(new Ring(2, 1, 'a', true));
		c.setRings(rings);
		System.out.println(c.getPlayerRings());
	}
}

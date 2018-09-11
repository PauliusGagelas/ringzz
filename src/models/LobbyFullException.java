package models;

public class LobbyFullException extends Exception{
	private static final long serialVersionUID = 280290776488073354L;
	
	public LobbyFullException() {
		super("Lobby is full!");
	}
}

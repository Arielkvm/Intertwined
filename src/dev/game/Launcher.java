package dev.game;

public class Launcher {
	public static void main(String[] args) {
		Game game = new Game("Title", 896, 224);
		game.start();
	}
}
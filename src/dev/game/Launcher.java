package dev.game;

/**
 * @author EFGK
 */

public class Launcher {
	public static void main(String[] args) {
		Game game = new Game("Title", 896, 480);
		game.start();
	}
}
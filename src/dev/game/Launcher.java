package dev.game;

//import base.Juego;
//import base.JuegoDao;
import dev.game.state.State;
import static java.sql.JDBCType.NULL;

/**
 * @author EFGK
 */

public class Launcher {
	public static void main(String[] args) {
		Game game = new Game("Intertwined", 896, 480);
		game.start();
//                JuegoDao fd = new JuegoDao();
//                Juego f = new Juego(0,true,true,true,true,true);
//                fd.create(f);
               
	}
}
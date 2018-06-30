package dev.game.state;

/**
 * @author EFGK
 */
import dev.game.Handler;
import dev.game.gfx.Assets;
import dev.game.worlds.World;
import java.awt.Graphics;

public class GameState2 extends State {



    public GameState2(Handler handler) {
        super(handler);
    }

    @Override
    public void tick() {       
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.F1, 0, 0, 3968, 448, null);

    }

}

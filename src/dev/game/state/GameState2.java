package dev.game.state;

/**
 * @author EFGK
 */
import dev.game.Handler;
import dev.game.gfx.Assets;
import dev.game.worlds.World;
import java.awt.Graphics;

public class GameState2 extends State {

//    private World World2;

    public GameState2(Handler handler) {
        super(handler);
//        World2 = new World(handler, "src/Worlds/World2.txt");
//        handler.setWorld(World2);
    }

    @Override
    public void tick() {
//        World2.tick();
    }

    @Override
    public void render(Graphics g) {
//        g.drawImage(Assets.F1, 0, 0, 3968, 448, null);
//        World2.render(g);
    }

}

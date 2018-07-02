package dev.game.state;

/**
 * @author EFGK
 */
import dev.game.Handler;
import dev.game.gfx.Assets;
import dev.game.worlds.World;
import java.awt.Graphics;

public class GameState extends State {
    
    private World World1;
    public static String mundo = "src/Worlds/World2.txt";
    public World getWorld1() {
        return World1;
    }

    public void setWorld1(World World1) {
        this.World1 = World1;
    }
    
    public GameState(Handler handler) {
       super(handler);
        World1 = new World(handler, mundo);
        handler.setWorld(World1);
    }

    @Override
    public void tick() {
        World1.tick();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.F2, 0, 0, 3968, 448, null);
        World1.render(g);
    }

}

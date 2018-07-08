package dev.game.state;

import dev.game.Handler;
import dev.game.gfx.Assets;
import dev.game.worlds.World;
import java.awt.Graphics;

/**
 * @author EFGK
 */
public class GameState2_5 extends State{
    private World World2;
    public static String mundo  = "src/Worlds/World2_2.txt";
    public World getWorld1() {
        return World2;
    }

    public void setWorld1(World World1) {
        this.World2 = World1;
    }
    
    public GameState2_5(Handler handler) {
        super(handler);
        World2 = new World(handler,"src/Worlds/World2_2.txt");
        handler.setWorld(World2);
    }

    @Override
    public void tick() {    
        World2.tick();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.F1, 0, 0, 3968, 500, null);
        World2.render(g);
    }

    
}

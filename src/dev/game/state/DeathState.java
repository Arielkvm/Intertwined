package dev.game.state;

import dev.game.Handler;
import dev.game.gfx.Assets;
import java.awt.Graphics;

/**
 * @author EFGK
 */
public class DeathState extends State{

    public DeathState(Handler handler) {
        super(handler);
    }

    @Override
    public void tick() {
    
    }

    @Override
    public void render(Graphics g) {
    g.drawImage(Assets.Death, 0, 0, 900, 500, null);
    }
    
}

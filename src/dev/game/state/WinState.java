package dev.game.state;

import dev.game.Handler;
import dev.game.gfx.Assets;
import java.awt.Graphics;

/**
 * @author EFGK
 */

public class WinState extends State{

    public WinState(Handler handler) {
        super(handler);
    }

    @Override
    public void tick() {
    
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.Win, 0, 0, 900, 500, null);
    }
    
}

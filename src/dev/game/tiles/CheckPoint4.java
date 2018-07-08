package dev.game.tiles;

import dev.game.gfx.Assets;
import java.awt.image.BufferedImage;

/**
 * @author EFGK
 */
public class CheckPoint4 extends Tile{
    
    public CheckPoint4(int id) {
        super(Assets.voyd, id);
    }
    
    @Override
    public boolean isCTG2(){
        return true;
    }
    
}

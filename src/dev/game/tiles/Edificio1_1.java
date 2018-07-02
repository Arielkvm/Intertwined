package dev.game.tiles;

import dev.game.gfx.Assets;
import java.awt.image.BufferedImage;

/**
 *
 * @author EFGK
 */
public class Edificio1_1 extends Tile {
    
    public Edificio1_1(int id) {
        super(Assets.brick, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
    
    
    
}

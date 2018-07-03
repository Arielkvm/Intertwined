package dev.game.tiles;

import dev.game.gfx.Assets;
import static dev.game.gfx.Assets.build1;
import java.awt.image.BufferedImage;

/**
 *
 * @author EFGK
 */
public class Edificio1_1 extends Tile {
    
    public Edificio1_1(int id) {
        super(Assets.build1, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
    
    
    
}

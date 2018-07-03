package dev.game.tiles;

import dev.game.gfx.Assets;
import static dev.game.gfx.Assets.build1_2;

/**
 *
 * @author EFGK
 */
public class Edificio1_2 extends Tile {
    
    public Edificio1_2(int id) {
        super(Assets.build1_2, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
       
}
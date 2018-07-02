package dev.game.tiles;

import dev.game.gfx.Assets;

/**
 *
 * @author EFGK
 */
public class Edificio2_2 extends Tile {
    
    public Edificio2_2(int id) {
        super(Assets.brick, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
       
}

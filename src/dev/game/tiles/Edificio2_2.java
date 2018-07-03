package dev.game.tiles;

import dev.game.gfx.Assets;

/**
 *
 * @author EFGK
 */
public class Edificio2_2 extends Tile {
    
    public Edificio2_2(int id) {
        super(Assets.build2_2, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
       
}

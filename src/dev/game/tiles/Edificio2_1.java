package dev.game.tiles;

import dev.game.gfx.Assets;

/**
 *
 * @author EFGK
 */
public class Edificio2_1 extends Tile {
    
    public Edificio2_1(int id) {
        super(Assets.brick, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
       
}
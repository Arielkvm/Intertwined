package dev.game.tiles;

import dev.game.gfx.Assets;

/**
 *
 * @author EFGK
 */
public class Edificio3_1 extends Tile {
    
    public Edificio3_1(int id) {
        super(Assets.brick, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
       
}

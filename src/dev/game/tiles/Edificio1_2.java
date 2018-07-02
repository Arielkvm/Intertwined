package dev.game.tiles;

import dev.game.gfx.Assets;

/**
 *
 * @author EFGK
 */
public class Edificio1_2 extends Tile {
    
    public Edificio1_2(int id) {
        super(Assets.brick, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
       
}
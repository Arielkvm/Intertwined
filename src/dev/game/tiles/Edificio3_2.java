package dev.game.tiles;

import dev.game.gfx.Assets;

/**
 *
 * @author EFGK
 */
public class Edificio3_2 extends Tile {
    
    public Edificio3_2(int id) {
        super(Assets.build3_2, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
       
}
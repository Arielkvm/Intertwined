package dev.game.tiles;

import dev.game.gfx.Assets;

/**
 * @author EFGK
 */


public class platarform extends Tile{
    
    public platarform(int id) {
        super(Assets.platarform, id);
    }
    
    @Override
   public boolean isSolid() {
        return true;
    }
    
}

package dev.game.tiles;

import dev.game.gfx.Assets;

/**
 * @author EFGK
 */


public class FloorTile extends Tile{
    
    public FloorTile(int id) {
        super(Assets.floor, id);
    }
    
    @Override
   public boolean isSolid() {
        return true;
    }
    
}

package dev.game.tiles;

import dev.game.gfx.Assets;


/**
 * @author kevin
 */

public class ObstacleTile extends Tile{
    
    public ObstacleTile(int id) {
        super(Assets.obstacle, id);
    }
    
   @Override
   public boolean isSolid() {
        return true;
    }
}

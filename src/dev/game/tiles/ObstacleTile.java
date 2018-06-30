package dev.game.tiles;

import dev.game.gfx.Assets;


/**
 * @author EFGK
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

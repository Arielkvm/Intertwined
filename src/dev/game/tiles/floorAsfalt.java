package dev.game.tiles;

import dev.game.gfx.Assets;

public class floorAsfalt extends Tile{
    
    public floorAsfalt(int id) {
        super(Assets.floor_asfalt, id);
    }
    
    @Override
   public boolean isSolid() {
        return true;
    }
    
}

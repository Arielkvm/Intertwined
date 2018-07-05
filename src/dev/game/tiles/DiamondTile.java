package dev.game.tiles;

import dev.game.gfx.Assets;

/**
 * @author EFGK
 */
public class DiamondTile extends Tile{
    
    public DiamondTile(int id) {
        super(Assets.diamond, id);
    }
    
    @Override
    public boolean isMoney(){
        return true;
    }
    
}

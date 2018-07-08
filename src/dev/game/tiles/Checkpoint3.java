package dev.game.tiles;

import dev.game.gfx.Assets;

/**
 * @author EFGK
 */

public class Checkpoint3 extends Tile{
    
    public Checkpoint3(int id) {
        super(Assets.voyd, id);
    }
    
    @Override
    public boolean isCTG1(){
        return true;
    }
}

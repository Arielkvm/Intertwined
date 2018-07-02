package dev.game.tiles;

import dev.game.gfx.Assets;

/**
 * @author EFGK
 */
public class CheckPoint2 extends Tile {

    public CheckPoint2(int id) {
        super(Assets.voyd, id);
    }

    @Override
    public boolean isCheckPoint() {
        return true;
    }
}

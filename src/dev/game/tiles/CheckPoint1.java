package dev.game.tiles;

import dev.game.gfx.Assets;

/**
 * @author EFGK
 */
public class CheckPoint1 extends Tile {

    public CheckPoint1(int id) {
        super(Assets.vod, id);
    }

    @Override
    public boolean isCheckPoint() {
        return true;
    }

}

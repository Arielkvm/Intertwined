package dev.game.tiles;

import dev.game.gfx.Assets;

/**
 * @author EFGK
 */
public class DeathTile extends Tile {

    public DeathTile(int id) {
        super(Assets.Spike, id);
    }

    @Override
    public boolean isCP2D() {
        return true;
    }
}

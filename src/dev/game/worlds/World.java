package dev.game.worlds;

import dev.game.Game;
import dev.game.Utils.Utils;
import dev.game.tiles.Tile;
import java.awt.Graphics;

/**
 * @author kevin
 */
public class World {

    private Game game;
    private int width, height;
    private int spawnX, spawnY;
    private int[][] tiles;

    public World(Game game, String path) {
        this.game = game;
        loadWorld(path);
    }

    public void tick() {
    }

    public void render(Graphics g) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                getTile(x, y).render(g, (int)(x * Tile.Twidth - game.getGCamera().getxOffset()), (int)(y * Tile.Theight - game.getGCamera().getyOffset()));
            }
        }
    }

    public Tile getTile(int x, int y) {
        Tile t = Tile.tiles[tiles[x][y]];
        if (t == null) {
            return Tile.voidTile;
        }
        return t;
    }

    private void loadWorld(String path) {
        String file = Utils.loadFileAsString(path);
        String[] tokens = file.split("\\s+");
        width = Utils.parseInt(tokens[0]);
        height = Utils.parseInt(tokens[1]);
        spawnX = Utils.parseInt(tokens[2]);
        spawnY = Utils.parseInt(tokens[3]);
        
        tiles = new int[width][height];
        for(int y = 0; y < height ;y++){
            for(int x = 0; x < width ; x++){
                tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
            }
        }
    }
}

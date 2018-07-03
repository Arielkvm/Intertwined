package dev.game.worlds;

import dev.game.Entity.Creature.Player;
import dev.game.Entity.EntityManager;
import dev.game.Game;
import dev.game.Handler;
import dev.game.Utils.Utils;
import dev.game.tiles.Tile;
import java.awt.Graphics;

/**
 * @author EFGK
 */
public class World {

    private Handler handler;
    private int width, height;
    private int spawnX, spawnY;
    private float Speedx, Speedy;
    private int[][] tiles;
    private EntityManager EManager;

    public float getSpeedx() {
        return Speedx;
    }

    public float getSpeedy() {
        return Speedy;
    }

    public int getSpawnX() {
        return spawnX;
    }

    public EntityManager getEManager() {
        return EManager;
    }

    public int getSpawnY() {
        return spawnY;
    }

    public World(Handler handler, String path) {
        this.handler = handler;
        EManager = new EntityManager(handler, new Player(handler, 100, 100));
        loadWorld(path);
        
        EManager.getPlayer().setX(spawnX);
        EManager.getPlayer().setY(spawnY);
    }

    public void tick() {
        EManager.tick();
    }

    public void render(Graphics g) {
        int xStart = (int) Math.max(0, handler.getGCamera().getxOffset()/Tile.Twidth);
        int xEnd = (int) Math.min(width,(handler.getGCamera().getxOffset() + handler.getWidth())/Tile.Twidth+1);
        int yStart = (int) Math.max(0, handler.getGCamera().getyOffset()/Tile.Theight);
        int yEnd = (int) Math.min(height, (handler.getGCamera().getyOffset() + handler.getHeight()) / Tile.Theight+1);         
        
        for (int y = yStart; y < yEnd; y++) {
            for (int x = xStart; x < xEnd; x++) {
                getTile(x, y).render(g, (int)(x * Tile.Twidth - handler.getGCamera().getxOffset()), (int)(y * Tile.Theight - handler.getGCamera().getyOffset()));
            }
        }
        EManager.render(g);
    }

    public Tile getTile(int x, int y) {
        if(x<0 || y<0 || x>=width || y>=height){
            return Tile.voidTile;
        }
        
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
        Speedx = Utils.parseInt(tokens[5]);
        Speedy = Utils.parseInt(tokens[6]);
        
        tiles = new int[width][height];
        for(int y = 0; y < height ;y++){
            for(int x = 0; x < width ; x++){
                tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 6]);
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

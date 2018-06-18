package dev.game.tiles;

/**
 * @author kevin
 */

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
    
    public static Tile[] tiles = new Tile[256];
    public static Tile voidTile = new VoidTile(0);
    public static Tile obstacleTile = new ObstacleTile(1);
    public static Tile floorTile = new FloorTile(2);
    
    
    protected BufferedImage texture;
    protected final int id;
    public static final int Twidth=32, Theight=32;
    
    public Tile(BufferedImage texture, int id){
        
        this.id = id;
        this.texture = texture;
        
        tiles[id] = this; 
    }
    
    public void tick(){}
    
    public void render(Graphics g, int x, int y){
        g.drawImage(texture, x, y, Twidth, Theight, null);
    }
    
    public boolean isSolid(){
        return false;
    }
    
    public int getId(){
        return id;
    }
}

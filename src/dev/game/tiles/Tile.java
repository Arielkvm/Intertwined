package dev.game.tiles;

/**
 * @author EFGK
 */
import static dev.game.gfx.Assets.brick;
import static dev.game.gfx.Assets.platarform;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {

    public static Tile[] tiles = new Tile[256];
    public static Tile voidTile = new VoidTile(0);
    public static Tile obstacleTile = new ObstacleTile(1);
    public static Tile floorTile = new FloorTile(2);
    public static Tile checkpoint1 = new CheckPoint1(3);
    public static Tile checkpoint2 = new CheckPoint2(4);
    public static Tile edificio3_1 = new Edificio3_1(5);
    public static Tile edificio3_2 = new Edificio3_2(6);
    public static Tile edificio2_1 = new Edificio2_1(7);
    public static Tile edificio2_2 = new Edificio2_2(8);
    public static Tile edificio1_1 = new Edificio1_1(9);
    public static Tile edificio1_2 = new Edificio1_2(10);
    public static Tile platarform = new platarform(11);
    public static Tile floorAsfalt = new FloorTile(12);
    public static Tile death = new DeathTile(13);

    protected BufferedImage texture;
    protected final int id;
    public static final int Twidth = 32, Theight = 32;

    public Tile(BufferedImage texture, int id) {

        this.id = id;
        this.texture = texture;

        tiles[id] = this;
    }

    public void tick() {
    }

    public void render(Graphics g, int x, int y) {
        g.drawImage(texture, x, y, Twidth, Theight, null);
    }

    public boolean isSolid() {
        return false;
    }

    public boolean isCheckPoint() {
        return false;
    }

    public boolean isCP2H() {
        return false;
    }
    
    public boolean isCP2H2() {
        return false;
    }

    public boolean isCP2D() {
        return false;
    }

    public int getId() {
        return id;
    }
}

package dev.game.Entity.Creature;

/**
 * @author EFGK
 */
import static dev.game.Entity.Creature.Creature.DEFAULT_SPEEDX;
import static dev.game.Entity.Creature.Creature.DEFAULT_SPEEDY;
import dev.game.Handler;
import dev.game.gfx.Animation;
import dev.game.gfx.Assets;
import dev.game.state.GameState;
import dev.game.state.State;
import dev.game.tiles.Tile;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player extends Creature {
    
    GameState gm;
    
    private float delay = 5.0f;
    private boolean saltar = false;
    private boolean standing = true;

    //Kawaii ❤❤❤ Animations 
    private Animation A_Run, A_Jump, A_Left, A_Right,A_Standing,A_Jump2;

    public Player(Handler handler, float x, float y) {
        super(handler, x, y, Creature.DEFAULT_WIDTH, Creature.DEFAULT_HEIGHT);

        bounds.x = 8;
        bounds.y = 16;
        bounds.width = 16;
        bounds.height = 16;

        //❤❤❤ Animations ❤❤❤
        A_Run = new Animation(250, Assets.run);
        A_Jump = new Animation(250, Assets.jump);
        A_Jump2 = new Animation(250, Assets.jumpball);
        A_Left = new Animation(500, Assets.walk_L);
        A_Right = new Animation(500, Assets.walk_R);
        A_Standing = new Animation(0, Assets.standing);
        
    }

    @Override
    public void moveY() {
        if (yMove < 0) {//up
            int ty = (int) (y + yMove + bounds.y) / Tile.Theight;
            if (!CWTile((int) (x + bounds.x) / Tile.Twidth, ty) && !CWTile((int) (x + bounds.x + bounds.width) / Tile.Twidth, ty)) {
                y += yMove;
            } else {
                y = ty * Tile.Theight + Tile.Theight - bounds.y;
            }
        }
        yMove += 3.0f + delay;
        int ty = (int) (y + yMove + bounds.y + bounds.height) / Tile.Theight;
        if (!CWTile((int) (x + bounds.x) / Tile.Twidth, ty) && !CWTile((int) (x + bounds.x + bounds.width) / Tile.Twidth, ty)) {
            y += yMove;
            delay = 0f;
        } else {
            saltar = true;
            y = ty * Tile.Theight - bounds.y - bounds.height - 1;
        }

    }

    @Override
    public void tick() {
        A_Run.tick();
        A_Jump.tick();
        A_Left.tick();
        A_Right.tick();

        getInput();
        move();
        handler.getGCamera().centerOE(this);
    }

    private void getInput() {

        xMove = 0;
        yMove = 0;
        DEFAULT_SPEEDX = handler.getWorld().getSpeedx();
        State Current  =  handler.getGameState();
        State G1 = handler.getGameState();
        State G2  = handler.getGameState2();
        if(State.getState().equals(handler.getGame().getGameState2())){
            xMove = DEFAULT_SPEEDX;
            
            if (handler.getKManager().up && saltar) {
                delay = 0;
                yMove = DEFAULT_SPEEDY;
                saltar = false;
            }
        }else if(State.getState().equals(handler.getGame().getGameState())){
            if (handler.getKManager().up && saltar) {
                delay = 0;
                yMove = DEFAULT_SPEEDY;
                saltar = false;
            }
            if (handler.getKManager().right) {
                xMove+=DEFAULT_SPEEDX;
            }
            if (handler.getKManager().left) {
                xMove-=DEFAULT_SPEEDX;
            }
        }
            
           
        
    }

    @Override
    public void render(Graphics g) {

        if (State.getState() == handler.getGameState()) {
            g.drawImage(getCAFrame(), (int) (x - handler.getGCamera().getxOffset()), (int) (y - handler.getGCamera().getyOffset()), width * 2, height * 2, null);
            //g.setColor(Color.red);
            //g.fillRect((int)(x + bounds.x - handler.getGCamera().getxOffset()), (int)(y + bounds.y - handler.getGCamera().getyOffset()), bounds.width,bounds.height);
        } else if (State.getState() == handler.getGameState2()) {
//            g.drawImage(A_Left.getCFrame(), (int) (handler.getWorld().getSpawnX() + 1 - handler.getGCamera().getxOffset()), (int) (handler.getWorld().getSpawnY() + 1 - handler.getGCamera().getyOffset()), width * 2, height * 2, null);
                g.drawImage(getCAFrame(), (int) (x - handler.getGCamera().getxOffset()), (int) (y - handler.getGCamera().getyOffset()), width * 2, height * 2, null);
            
        }
    }

    private BufferedImage getCAFrame() {
        if (xMove < 0) {
            return A_Left.getCFrame();
        } else if (xMove > 0) {
            return A_Right.getCFrame();
        } else if (saltar==false) {
            return A_Jump.getCFrame();
        }else if(standing==true){
            return A_Standing.getCFrame();
        }else{
            return A_Standing.getCFrame();
        }
    }
}
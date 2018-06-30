package dev.game.gfx;

import dev.game.Entity.Entity;
import dev.game.Handler;
import dev.game.state.State;
import dev.game.tiles.Tile;

/**
 * @author EFGK
 */

public class GCamera {

    private Handler handler;
    private float xOffset, yOffset;

    public GCamera(Handler handler, float xOffset, float yOffset) {

        this.handler = handler;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }
    
    public void CBSpace(){
        if(xOffset < 0){
            xOffset = 0;
        }else if(xOffset > handler.getWorld().getWidth() * Tile.Twidth - handler.getWidth()){
            xOffset =  handler.getWorld().getWidth() * Tile.Twidth - handler.getWidth();
        }
        if(yOffset < 0){
            yOffset =0;
        }else if(yOffset > handler.getWorld().getHeight() * Tile.Theight - handler.getHeight()){
            yOffset =  handler.getWorld().getHeight() * Tile.Theight - handler.getHeight();
        }
    }

    public void centerOE(Entity e) {
        if (State.getState() == handler.getGameState()) {
            xOffset = e.getX() - handler.getWidth() / 2;
            yOffset = e.getY() - handler.getHeight() / 2;
            CBSpace();
        } else if (State.getState() == handler.getGameState2()) {
            xOffset = e.getX() - handler.getWidth() / 2 + e.getWidth() / 2;
            yOffset = e.getY() - handler.getHeight() / 2 + e.getHeight() / 2;
            CBSpace();
        }
    }

    public void move(float xAmt, float yAmt) {
        xOffset += xAmt;
        yOffset = yAmt;
        CBSpace();
    }

    public float getxOffset() {
        return xOffset;
    }

    public void setxOffset(float xOffset) {
        this.xOffset = xOffset;
    }

    public float getyOffset() {
        return yOffset;
    }

    public void setyOffset(float yOffset) {
        this.yOffset = yOffset;
    }

}

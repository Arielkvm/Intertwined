package dev.game.gfx;

import dev.game.Entity.Entity;
import dev.game.Game;
import dev.game.state.State;

/**
 * @author kevin
 */

public class GCamera {
    
    private Game game;
    private float xOffset, yOffset;
    
    public GCamera(Game game, float xOffset, float yOffset){
        
        this.game = game;
        this.xOffset = xOffset;
        this.yOffset = yOffset;        
    }
    
    public void centerOE(Entity e){
        if(State.getState() == game.getGameState()){
            xOffset = e.getX() - game.getWidth()/2;
            yOffset = e.getY() - game.getHeight()/2;
        }else if(State.getState() == game.getGameState2()){
            xOffset = e.getX() - game.getWidth() /2 + e.getWidth()/2;
            yOffset = e.getY() - game.getHeight() /2 + e.getHeight()/2;
        }
    }
    
    public void move(float xAmt, float yAmt){
        xOffset += xAmt;
        yOffset = yAmt;
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

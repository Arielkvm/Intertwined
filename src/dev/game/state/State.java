package dev.game.state;

import dev.game.Game;
import dev.game.Handler;
import java.awt.Graphics;

public abstract class State {
    
    public static State CurrentState= null;
    
    public static void setState(State state){
        CurrentState = state;
    }
    
    public static State getState(){
        return CurrentState;
    }
    
    //class
    protected Handler handler;
    
    public State(Handler handler){
        this.handler = handler;
    }
    public abstract void tick();
    public abstract void render(Graphics g);
}

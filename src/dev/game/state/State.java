package dev.game.state;

import dev.game.Game;
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
    protected Game game;
    
    public State(Game game){
        this.game = game;
    }
    public abstract void tick();
    public abstract void render(Graphics g);
}

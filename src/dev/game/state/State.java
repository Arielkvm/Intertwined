package dev.game.state;

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
    public abstract void tick();
    public abstract void render(Graphics g);
}

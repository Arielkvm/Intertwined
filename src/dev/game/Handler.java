package dev.game;

import dev.game.gfx.GCamera;
import dev.game.input.KeyManager;
import dev.game.input.MouseManager;
import dev.game.state.State;
import dev.game.worlds.World;

/**
 * @author EFGK
 */
public class Handler {
    private Game game;
    private World world;
    
    public Handler(Game game){
        this.game = game;
    }
    
    public int getWidth(){
        return game.getWidth();  
    }
    
    public int getHeight(){
        return game.getHeight();
    }
    
    public State getGameState(){
        return game.getGameState();
    }
    
    public State getGameState2(){
        return game.getGameState2();
    }
    
    public KeyManager getKManager(){
        return game.getKeyManager();
    }
    
    public MouseManager getMouseManager(){
        return game.getMManager();
    }
    
    public GCamera getGCamera(){
        return game.getGCamera();
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }
    
    
}

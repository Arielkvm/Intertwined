package dev.game.state;

import dev.game.gfx.Assets;
import java.awt.Graphics;

public class GameState extends State{
    //Juego1
    public GameState(){
    }

    @Override
    public void tick() {
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.F1, 0, 0, null);
    }
    
}

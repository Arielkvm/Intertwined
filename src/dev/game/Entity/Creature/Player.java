package dev.game.Entity.Creature;

import dev.game.Game;
import dev.game.gfx.Assets;
import dev.game.state.GameState;
import dev.game.state.State;
import java.awt.Graphics;


public class Player extends Creature {
        
	public Player(Game game, float x, float y) {
		super(game, x, y, Creature.DEFAULT_WIDTH, Creature.DEFAULT_HEIGHT);
	}

	@Override
	public void tick() {
            getInput();
            move();
            game.getGCamera().centerOE(this);
	}
        
        private void getInput(){
            xMove=0;
            yMove=0;
            
            if(State.CurrentState == game.getGameState()){
                if(game.getKeyManager().up)
                    yMove= -(speed+1);
                if(game.getKeyManager().down)
                    yMove= +(speed+1);
                if(game.getKeyManager().left)
                    xMove= -(speed+1);
                if(game.getKeyManager().right)
                    xMove= +(speed+1);
            }
        }

	@Override
	public void render(Graphics g) {
            if(State.getState() == game.getGameState()){
		g.drawImage(Assets.player_f1, (int)(x -  game.getGCamera().getxOffset()), (int)(y - game.getGCamera().getyOffset()), width*2, height*2, null);
            }else if(State.getState() == game.getGameState2()){
                g.drawImage(Assets.player_f1, (int)(x -  game.getGCamera().getxOffset()), (int)(y - game.getGCamera().getyOffset()), width*2, height*2, null);
            }
        }
}
package dev.game.state;

import dev.game.Entity.Creature.Player;
import dev.game.Game;
import dev.game.tiles.Tile;
import dev.game.worlds.World;
import java.awt.Graphics;

public class GameState extends State{
    //Juego1
    
    private Player player;
    private World test;
    
    public GameState(Game game){
        super(game);
        player = new Player(game,100,100);
        test = new World(game,"src/Worlds/World1.txt");
    }

    @Override
    public void tick() {
        test.tick();
        player.tick();
    }

    @Override
    public void render(Graphics g) {
        test.render(g);
        player.render(g);
    }
    
}

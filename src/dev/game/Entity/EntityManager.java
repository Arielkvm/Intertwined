package dev.game.Entity;

import dev.game.Entity.Creature.Player;
import dev.game.Handler;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author EFGK
 */
public class EntityManager {

    private Handler hander;
    private Player player;
    private ArrayList<Entity> entities;
    private Comparator<Entity> RS = new Comparator<Entity>(){
        
        @Override
        public int compare(Entity A, Entity B) {
            if(A.getY() + A.getHeight() < B.getY()+ B.getHeight())
                return -1;
            return 1;
        }
    };
    
    public EntityManager(Handler handler, Player player){
        this.hander = handler;
        this.player = player;
        entities = new ArrayList<Entity>();
        entities.add(player);
    }
    
    public void tick(){
        for(int i =0; i < entities.size() ;i++){
            Entity e = entities.get(i);
            e.tick();
        }
        entities.sort(RS);
    }
    
    public void render(Graphics g){
        for(Entity e : entities){
            e.render(g);
        }
    }
    
    public void addEntity(Entity e){
        entities.add(e);
    }
    
    public Handler getHander() {
        return hander;
    }

    public void setHander(Handler hander) {
        this.hander = hander;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }

    public void setEntities(ArrayList<Entity> entities) {
        this.entities = entities;
    }
}

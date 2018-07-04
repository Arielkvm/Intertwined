package dev.game.state;

/**
 * @author EFGK
 */

import dev.game.Handler;
import dev.game.UI.ClickListener;
import dev.game.UI.UIIButton;
import dev.game.UI.UIManager;
import dev.game.gfx.Assets;
import java.awt.Graphics;


public class GameState3 extends State{
    
    public UIManager UIM;
    int DM =75;
    
    public GameState3(Handler handler) {
        super(handler);
        UIM = new UIManager(handler);
        handler.getMouseManager().setUIManager(UIM);
                
        UIM.addObject(new UIIButton(0, 0, DM, DM, Assets.Bomb, new ClickListener(){
            @Override
            public void onClick(){
                System.out.println("*Boom*");
            
            }}));
        
        UIM.addObject(new UIIButton(352, 300, DM, DM, Assets.Sword, new ClickListener(){
            @Override
            public void onClick() {
                System.out.println("*Swoosh*");
            }}));
        
        UIM.addObject(new UIIButton(352, 400, DM, DM, Assets.Potion1, new ClickListener(){
            @Override
            public void onClick() {
                System.out.println("*Gulp*");
            }}));
        
        UIM.addObject(new UIIButton(452, 400, DM, DM, Assets.Gun, new ClickListener(){
            @Override
            public void onClick() {
                System.out.println("*Pew Pew*");
            }}));
    }
    
    @Override
    public void tick() {
        UIM.tick();
    }

    @Override
    public void render(Graphics g) {
        UIM.render(g);
    }
    
}

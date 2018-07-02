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
    
    public GameState3(Handler handler) {
        super(handler);
        UIM = new UIManager(handler);
        handler.getMouseManager().setUIManager(UIM);
                
        UIM.addObject(new UIIButton(0,0,192,64, Assets.B1, new ClickListener(){
            @Override
            public void onClick(){
                State.setState(handler.getGame().getMenuState());
            
            }}));
        
        UIM.addObject(new UIIButton(352, 300, 192, 64, Assets.B2, new ClickListener(){
            @Override
            public void onClick() {
                System.out.println("2");
            }}));
        
        UIM.addObject(new UIIButton(352, 400, 192, 64, Assets.B3, new ClickListener(){
            @Override
            public void onClick() {
                System.out.println("3");
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

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


public class MenuPrincipal extends State{
    
    public UIManager uimanager;
    
    public MenuPrincipal(Handler handler) {
        super(handler);
        uimanager = new UIManager(handler);
        handler.getMouseManager().setUIManager(uimanager);
        
        uimanager.addObject(new UIIButton(352, 200, 192, 64, Assets.B1, new ClickListener(){
            @Override
            public void onClick() {
                handler.getMouseManager().setUIManager(null);
                State.setState(handler.getGame().gameState);
            }}));
        
        uimanager.addObject(new UIIButton(352, 300, 192, 64, Assets.B1, new ClickListener(){
            @Override
            public void onClick() {
                handler.getMouseManager().setUIManager(null);
                State.setState(handler.getGame().gameState2);
            }}));
        
        uimanager.addObject(new UIIButton(352, 400, 192, 64, Assets.B1, new ClickListener(){
            @Override
            public void onClick() {
                handler.getMouseManager().setUIManager(null);
                State.setState(handler.getGame().gameState3);
            }}));
    }
    
    @Override
    public void tick() {
        uimanager.tick();
    }

    @Override
    public void render(Graphics g) {
        uimanager.render(g);
    }
    
}

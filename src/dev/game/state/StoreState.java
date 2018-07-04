package dev.game.state;

import dev.game.Handler;
import dev.game.UI.ClickListener;
import dev.game.UI.UIIButton;
import dev.game.UI.UIManager;
import dev.game.gfx.Assets;
import java.awt.Graphics;

/**
 * @author EFGK
 */
public class StoreState extends State{
    
    public UIManager STUI;

    public StoreState(Handler handler) {
        super(handler);
        
        STUI = new UIManager(handler);
        handler.getMouseManager().setUIManager(STUI);
                
        STUI.addObject(new UIIButton(0,0,192,64, Assets.B1, new ClickListener(){
            @Override
            public void onClick(){
                
            
            }}));
    }

    @Override
    public void tick() {
    
    }

    @Override
    public void render(Graphics g) {
    
    }
    
}

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
public class SettingsState extends State{
    
    public UIManager STUI;
    int tm = 100;

    public SettingsState(Handler handler) {
        super(handler);
        
        STUI = new UIManager(handler);
        handler.getMouseManager().setUIManager(STUI);
                
        STUI.addObject(new UIIButton(25, 400, 150, 75, Assets.Back, new ClickListener(){
            @Override
            public void onClick(){
                State.setState(handler.getGame().getMenuState());
            }}));
    }

    @Override
    public void tick() {
        STUI.tick();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.F6, 0, 0, 900, 500, null);
        STUI.render(g);
    }
    
}

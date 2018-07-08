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

public class MenuPrincipal extends State {
    
    public UIManager uimanager;
    
    public MenuPrincipal(Handler handler) {
        super(handler);
        uimanager = new UIManager(handler);
        handler.getMouseManager().setUIManager(uimanager);
        
        uimanager.addObject(new UIIButton(352, 200, 192, 64, Assets.B1, new ClickListener() {
            @Override
            public void onClick() {
                handler.getMouseManager().setUIManager(null);
//                handler.getGame().createStage1_1();
//                State.setState(handler.getGame().getGameState());
                handler.getGame().createStage1_2();
                State.setState(handler.getGame().getGameState1_5());
                
            }
        }));
        
        uimanager.addObject(new UIIButton(352, 265, 192, 64, Assets.B2, new ClickListener() {
            @Override
            public void onClick() {
                handler.getMouseManager().setUIManager(null);
                State.setState(handler.getGame().getSettingsstate());
            }
        }));
        
        uimanager.addObject(new UIIButton(352, 330, 192, 64, Assets.B3, new ClickListener() {
            @Override
            public void onClick() {
                handler.getMouseManager().setUIManager(null);
                State.setState(handler.getGame().getStoreState());
            }
        }));
        
        uimanager.addObject(new UIIButton(352, 395, 192, 64, Assets.B4, new ClickListener() {
            @Override
            public void onClick() {
                handler.getMouseManager().setUIManager(null);
                State.setState(handler.getGame().getHistoryState());
            }
        }));
        //Debug
        uimanager.addObject(new UIIButton(64, 64, 64, 64, Assets.B4, new ClickListener() {
            @Override
            public void onClick() {
                handler.getMouseManager().setUIManager(null);
                State.setState(handler.getGame().getGameState3());
            }
        }));
    }
    
    @Override
    public void tick() {
        uimanager.tick();
    }
    
    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.F6, 0, 0, 900, 500, null);
        uimanager.render(g);
        
    }
    
}

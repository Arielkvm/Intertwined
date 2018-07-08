package dev.game.state;

import base.Juego;
import base.JuegoDao;
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
    int tm = 100;

    public StoreState(Handler handler) {
        super(handler);
        
        STUI = new UIManager(handler);
        handler.getMouseManager().setUIManager(STUI);
        Juego ju = new Juego();
                
        STUI.addObject(new UIIButton(250, 150, tm, tm, Assets.Brain, new ClickListener(){
            @Override
            public void onClick(){
////                JuegoDao fd = new JuegoDao();
////                Juego f = new Juego(ju.getId(),ju.getCuracion());
////                if(fd.update(f)){
////                    System.out.println("it worked");
////                }else{
////                    System.out.println("shit it didn't ");
//                }
            }}));
        
        STUI.addObject(new UIIButton(500, 150, tm, tm, Assets.Clock, new ClickListener(){
            @Override
            public void onClick(){
                
            }}));
        
        STUI.addObject(new UIIButton(250, 350, tm, tm, Assets.Sneaker, new ClickListener(){
            @Override
            public void onClick(){
                
            }}));
        
        STUI.addObject(new UIIButton(500, 350, tm, tm, Assets.Potion2, new ClickListener(){
            @Override
            public void onClick(){
                
            }}));
        
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

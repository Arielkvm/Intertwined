package dev.game.state;

import base.Juego;
//import base.JuegoDao;
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
    boolean mejora1=false,mejora2=false,mejora3=false,mejora4=false;

    public boolean isMejora1() {
        return mejora1;
    }

    public void setMejora1(boolean mejora1) {
        this.mejora1 = mejora1;
    }
    
    int counter = 0;
    public StoreState(Handler handler) {
        super(handler);
        
        STUI = new UIManager(handler);
        handler.getMouseManager().setUIManager(STUI);
        Juego ju = new Juego();
                
        STUI.addObject(new UIIButton(250, 150, tm, tm, Assets.Brain, new ClickListener(){
            @Override
            public void onClick(){
                if(mejora1==true){
                    counter++;
                }else if(mejora2==true){
                    counter++;
                }else if(mejora3==true){
                    counter++;
                }else if(mejora4==true){
                    counter++;
                }
                if(counter <2){
                    mejora1=true;
                    System.out.println("Mejorado");

                }
            }}));
        
        STUI.addObject(new UIIButton(500, 150, tm, tm, Assets.Clock, new ClickListener(){
            @Override
            public void onClick(){
                if(mejora1==true){
                    counter++;
                }else if(mejora2==true){
                    counter++;
                }else if(mejora3==true){
                    counter++;
                }else if(mejora4==true){
                    counter++;
                }
                if(counter <2){
                    mejora2=true;
                    System.out.println("Mejorado");

                    
                }
            }}));
        
        STUI.addObject(new UIIButton(250, 350, tm, tm, Assets.Sneaker, new ClickListener(){
            @Override
            public void onClick(){
                if(mejora1==true){
                    counter++;
                }else if(mejora2==true){
                    counter++;
                }else if(mejora3==true){
                    counter++;
                }else if(mejora4==true){
                    counter++;
                }
                if(counter <2){
                    mejora3=true;
                    System.out.println("Mejorado");

                }
            }}));
        
        STUI.addObject(new UIIButton(500, 350, tm, tm, Assets.Potion2, new ClickListener(){
            @Override
            public void onClick(){
                if(mejora1==true){
                    counter++;
                }else if(mejora2==true){
                    counter++;
                }else if(mejora3==true){
                    counter++;
                }else if(mejora4==true){
                    counter++;
                }
                if(counter <2){
                    mejora4=true;
                    System.out.println("Mejorado");
                }
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

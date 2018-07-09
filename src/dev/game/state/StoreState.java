package dev.game.state;

//import base.Juego;
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
    private static boolean mejora1=false;
    private static boolean mejora2=false;
    private static boolean mejora3=false;
    private static boolean mejora4=false;    
    
    int counter = 0;
    public StoreState(Handler handler) {
        super(handler);
        
        STUI = new UIManager(handler);
        handler.getMouseManager().setUIManager(STUI);
//        Juego ju = new Juego();
                
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
    
    public boolean isMejora1() {
        return mejora1;
    }

    public void setMejora1(boolean mejora1) {
        this.mejora1 = mejora1;
    }

    public boolean isMejora2() {
        return mejora2;
    }

    public void setMejora2(boolean mejora2) {
        this.mejora2 = mejora2;
    }

    public boolean isMejora3() {
        return mejora3;
    }

    public void setMejora3(boolean mejora3) {
        this.mejora3 = mejora3;
    }

    public boolean isMejora4() {
        return mejora4;
    }

    public void setMejora4(boolean mejora4) {
        this.mejora4 = mejora4;
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
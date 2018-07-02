package dev.game.input;

import dev.game.UI.UIManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * @author EFGK
 */
public class MouseManager implements MouseListener, MouseMotionListener{

    private boolean RPressed, LPressed;
    private int mouseX, mouseY;
    private UIManager uimanager;
    
    public MouseManager(){}

    public UIManager getUimanager() {
        return uimanager;
    }
        
    public void setUIManager(UIManager uimanager){
        this.uimanager = uimanager;
    }

    public boolean isRPressed() {
        return RPressed;
    }

    public boolean isLPressed() {
        return LPressed;
    }

    public int getMouseX() {
        return mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1)
            LPressed = true;
        else if(e.getButton() == MouseEvent.BUTTON3)
            RPressed = true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1)
            LPressed = false;
        else if(e.getButton() == MouseEvent.BUTTON3)
            RPressed = false;
        
        if(uimanager != null)
            uimanager.onMouseRelease(e);
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        
        if(uimanager != null)
            uimanager.onMouseMove(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {}
    
    @Override
    public void mouseClicked(MouseEvent e) {}
    
}

package dev.game;

/*
* @author EFGK
 */
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import dev.game.display.Display;
import dev.game.gfx.Assets;
import dev.game.gfx.GCamera;
import dev.game.input.KeyManager;
import dev.game.input.MouseManager;
import dev.game.state.DeathState;
import dev.game.state.GameState;
import dev.game.state.GameState1_5;
import dev.game.state.GameState2;
import dev.game.state.GameState2_5;
import dev.game.state.GameState3;
import dev.game.state.HistoryState;
import dev.game.state.MenuPrincipal;
import dev.game.state.SettingsState;
import dev.game.state.State;
import dev.game.state.StoreState;
import dev.game.state.StoryState;

public class Game implements Runnable {

    private Display display;
    private int width, height;
    public String title;

    private boolean running = false;
    private Thread thread;

    private BufferStrategy bs;
    private Graphics g;

    //States
    public State gameState;
    public State gameState1_5;
    public State gameState2;
    public State gameState2_5;
    public State gameState3;
    public State menuState;
    public State storestate;
    public State deathstate;
    public State storystate;
    public State historystate;
    public State settingsstate;

    //Input
    private KeyManager keyManager;
    private MouseManager MManager;

    //Camera
    private GCamera gcamera;

    //Handler
    private Handler handler;

    public Game(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.title = title;
        keyManager = new KeyManager();
        MManager = new MouseManager();
    }

    private void init() {
        display = new Display(title, width, height);
        display.getFrame().addKeyListener(keyManager);
        display.getFrame().addMouseListener(MManager);
        display.getFrame().addMouseMotionListener(MManager);
        display.getCanvas().addMouseListener(MManager);
        display.getCanvas().addMouseMotionListener(MManager);
        Assets.init();

        handler = new Handler(this);
        gcamera = new GCamera(handler, 0, 0);

        gameState = new GameState(handler);
        gameState1_5 = new GameState1_5(handler);
        gameState2 = new GameState2(handler);
        gameState2_5 = new GameState2_5(handler);
        deathstate = new DeathState(handler);
        State.setState(this.getMenuState());
    }

    public void createStage1_1() {
        gameState = new GameState(handler);
    }

    public void createStage1_2() {
        gameState = null;
        gameState1_5 = new GameState1_5(handler);
    }

    public void createStage2_1() {
        gameState1_5 = null;
        gameState2 = new GameState2(handler);
    }

    public void createStage2_2() {
        gameState2 = null;
        gameState2_5 = new GameState2_5(handler);
    }

    public State getSettingsstate() {
        return new SettingsState(handler);
    }

    public State getGameState() {
        return gameState;
    }

    public State getDeathState() {
        return deathstate;
    }

    public State getGameState2() {
        return gameState2;
    }

    public State getGameState3() {
        return new GameState3(handler);
    }

    public State getMenuState() {
        return new MenuPrincipal(handler);
    }

    public State getStoreState() {
        return new StoreState(handler);
    }

    public State getStoryState() {
        return new StoryState(handler);
    }

    public State getHistoryState() {
        return new HistoryState(handler);
    }

    public State getGameState1_5() {
        return gameState1_5;
    }

    public State getGameState2_5() {
        return gameState2_5;
    }

    private void tick() {
        keyManager.tick();

        if (State.getState() != null) {
            State.getState().tick();
        }
    }

    private void render() {
        bs = display.getCanvas().getBufferStrategy();
        if (bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        //Clear Screen
        g.clearRect(0, 0, width, height);
        //Draw Here!

        if (State.getState() != null) {
            State.getState().render(g);
        }

        //End Drawing!
        bs.show();
        g.dispose();
    }

    public void run() {

        init();

        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;

        while (running) {
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += now - lastTime;
            lastTime = now;

            if (delta >= 1) {
                tick();
                render();
                ticks++;
                delta--;
            }

            if (timer >= 1000000000) {
                //System.out.println("Ticks and Frames: " + ticks);
                ticks = 0;
                timer = 0;
            }
        }

        stop();

    }

    public KeyManager getKeyManager() {
        return keyManager;
    }

    public MouseManager getMManager() {
        return MManager;
    }

    public GCamera getGCamera() {
        return gcamera;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public synchronized void start() {
        if (running) {
            return;
        }
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
        if (!running) {
            return;
        }
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

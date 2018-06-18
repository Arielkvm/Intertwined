package dev.game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import dev.game.display.Display;
import dev.game.gfx.Assets;
import dev.game.gfx.GCamera;
import dev.game.input.KeyManager;
import dev.game.state.GameState;
import dev.game.state.GameState2;
import dev.game.state.GameState3;
import dev.game.state.MenuPrincipal;
import dev.game.state.State;


public class Game implements Runnable {

	private Display display;
	private int width, height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	//States
	private State gameState;
        private State gameState2;
        private State gameState3;
	private State menuState;

        public State getGameState() {
            return gameState;
        }

        public void setGameState(State gameState) {
            this.gameState = gameState;
        }

        public State getGameState2() {
            return gameState2;
        }

        public void setGameState2(State gameState2) {
            this.gameState2 = gameState2;
        }
        
	
	//Input
	private KeyManager keyManager;
        
        //Camera
        private GCamera gcamera;
	
	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
	}
	
	private void init(){
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		Assets.init();
                
                gcamera = new GCamera(this,0,0);
		
		gameState = new GameState(this);
                gameState2 = new GameState2(this);
                gameState3 = new GameState3(this);
		menuState = new MenuPrincipal(this);
		State.setState(gameState);
	}
	
	private void tick(){
		keyManager.tick();
		
		if(State.getState() != null)
			State.getState().tick();
	}
	
	private void render(){
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Clear Screen
		g.clearRect(0, 0, width, height);
		//Draw Here!
		
		if(State.getState() != null)
			State.getState().render(g);
		
		//End Drawing!
		bs.show();
		g.dispose();
	}
	
	public void run(){
		
		init();
		
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(running){
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1){
				tick();
				render();
				ticks++;
				delta--;
			}
			
			if(timer >= 1000000000){
				System.out.println("Ticks and Frames: " + ticks);
				ticks = 0;
				timer = 0;
			}
		}
		
		stop();
		
	}
	
	public KeyManager getKeyManager(){
		return keyManager;
	}
        
        public GCamera getGCamera(){
            return gcamera;
        }
        
        public int getWidth(){
            return width;
        }
        
        public int getHeight(){
            return height;
        }
	
	public synchronized void start(){
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop(){
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

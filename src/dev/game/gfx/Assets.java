package dev.game.gfx;

import java.awt.image.BufferedImage;

public class Assets {

	private static final int width=64, height = 64;
	
	public static BufferedImage F1, F2, F3, F4, F5;
	
	public static void init(){
		
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/SpriteSheet.png"));
		
		F1 = sheet.crop(0, 0, width, height);
		F2 = sheet.crop(width, 0, width, height);
		F3 = sheet.crop(width * 2, 0, width, height);
		F4 = sheet.crop(width * 3, 0, width, height);
		
	}
	
}

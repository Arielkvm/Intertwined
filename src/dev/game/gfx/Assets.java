package dev.game.gfx;

import java.awt.image.BufferedImage;

public class Assets {

	private static final int width=64, height = 64;
	
	public static BufferedImage floor, obstacle, brick, plataform, spTile, vod;
        public static BufferedImage player_f1, player_f2, player_f3, player_f4, player_f5;
	
	public static void init(){
		
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/grid2.png"));
		//world
		floor    = sheet.crop(0, 0, width, height);
		obstacle = sheet.crop(width, 0, width, height);
		brick    = sheet.crop(width * 2, 0, width, height);
		brick    = sheet.crop(width * 3, 0, width, height);
                spTile   = sheet.crop(width * 4, 0, width, height);
		//player
                player_f1 = sheet.crop(0, height, width, height);
		player_f2 = sheet.crop(width, height, width, height);
		player_f3 = sheet.crop(width * 2, height, width, height);
		player_f4 = sheet.crop(width * 3, height, width, height);
                player_f5 = sheet.crop(width * 4, height, width, height);
                //void
                vod = sheet.crop(0, height * 2, width, height);
                
	}
	
}

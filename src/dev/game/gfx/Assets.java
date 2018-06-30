package dev.game.gfx;

/**
 * @author EFGK
 */

import java.awt.image.BufferedImage;

public class Assets {

	private static final int width=64, height = 64;
	
	public static BufferedImage floor, obstacle, brick, plataform, spTile, vod;
        
        public static BufferedImage[] B1, B2, jump, run, walk_R, walk_L;
        public static BufferedImage F1, F2, F3, F4, F5;
	
	public static void init(){
		
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/grid2.png"));
                SpriteSheet BTN = new SpriteSheet(ImageLoader.loadImage("/textures/SpriteSheet.png"));
                SpriteSheet Fondo1 = new SpriteSheet(ImageLoader.loadImage("/textures/fc3.png"));
                SpriteSheet Fondo2 = new SpriteSheet(ImageLoader.loadImage("/textures/FB.png"));
                
        //Fondos
                F1 = Fondo1.crop(0, 0, width * 62, height * 7);
                F2 = Fondo2.crop(0, 0, width * 50, height * 7);
        //Buttons
                B1 = new BufferedImage[2];
                B2 = new BufferedImage[2];
                B1[0] = sheet.crop(0, 0, width, height);
                B1[1] = sheet.crop(width, 0, width, height);
                
                B2[0] = sheet.crop(0 ,0 * 2, width * 2, height);
                B2[1] = sheet.crop(width, 0, width * 2, height);
        //world
		floor    = sheet.crop(0, 0, width, height);
		obstacle = sheet.crop(width, 0, width, height);
		brick    = sheet.crop(width * 2, 0, width, height);
		brick    = sheet.crop(width * 3, 0, width, height);
                spTile   = sheet.crop(width * 4, 0, width, height);
	//player
                run = new BufferedImage[2];
                jump = new BufferedImage[2];
                walk_R = new BufferedImage[2];
                walk_L = new BufferedImage[2];
                //run
                run[0] = sheet.crop(0, height, width, height);
		run[1] = sheet.crop(width, height, width, height);
                //jump
		jump[0] = sheet.crop(width * 2, height, width, height);
		jump[1] = sheet.crop(width * 3, height, width, height);
                //walk left
                walk_L[0] = sheet.crop(width * 4, height, width, height);
                walk_L[1] = sheet.crop(width * 3, height, width, height);
                //walk rigth
                walk_R[0] = sheet.crop(0, height, width, height);
		walk_R[1] = sheet.crop(width, height, width, height);
        //void
                vod = sheet.crop(0, height * 2, width, height);
                
	}
	
}

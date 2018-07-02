package dev.game.gfx;

/**
 * @author EFGK
 */

import java.awt.image.BufferedImage;

public class Assets {

	private static final int width=64, height = 64;
	
	public static BufferedImage floor, obstacle, brick, plataform, spTile, voyd;
        
        public static BufferedImage[] B1, B2, B3, B4, jump, jumpball, run, walk_R, walk_L,standing;
        public static BufferedImage F1, F2, F3, F4, F5, F6;
	
	public static void init(){
		
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/grid2.png"));
		SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage("/textures/Sheet1.png"));
                SpriteSheet BTN = new SpriteSheet(ImageLoader.loadImage("/textures/SpriteSheet.png"));
                SpriteSheet Fondo1 = new SpriteSheet(ImageLoader.loadImage("/textures/fc3.png"));
                SpriteSheet Fondo2 = new SpriteSheet(ImageLoader.loadImage("/textures/FB.png"));
                SpriteSheet Fondo3 = new SpriteSheet(ImageLoader.loadImage("/textures/FC.png"));
                
        //Fondos
                F1 = Fondo1.crop(0, 0, width * 62, height * 7);
                F2 = Fondo2.crop(0, 0, width * 50, height * 7);
                F6 = Fondo3.crop(0, 0, width * 11, height * 7);
        //Buttons
                B1 = new BufferedImage[2];
                B2 = new BufferedImage[2];
                B3 = new BufferedImage[2];
                B4 = new BufferedImage[2];
                
                B1[0] = sheet2.crop(0, height*6, width*3, height);
                B1[1] = sheet2.crop(width*3, height*6, width*3, height);
                
                B2[0] = sheet2.crop(0 ,height*7, width * 3, height);
                B2[1] = sheet2.crop(width*3, height*7, width * 3, height);
                
                B3[0] = sheet2.crop(0 ,height*8, width * 3, height);
                B3[1] = sheet2.crop(width*3, height*8, width * 3, height);
                
                B4[0] = sheet2.crop(0 ,height*9, width * 3, height);
                B4[1] = sheet2.crop(width*3, height*9, width * 3, height);
        //world
		floor    = sheet2.crop(0, 0, width, height);
		obstacle = sheet2.crop(width, 0, width, height);
		brick    = sheet2.crop(width * 2, 0, width, height);
		brick    = sheet2.crop(width * 3, 0, width, height);
                spTile   = sheet2.crop(width * 4, 0, width, height);
	//player
                run = new BufferedImage[2];
                jump = new BufferedImage[2];
                jumpball = new BufferedImage[2];
                walk_R = new BufferedImage[2];
                walk_L = new BufferedImage[2];
                standing = new BufferedImage[1];
                //run
                run[0] = sheet2.crop(0, height*2, width, height);
		run[1] = sheet2.crop(width, height*2, width, height);
                //jump
		jump[0] = sheet2.crop(width * 5, height*2, width, height);
		jump[1] = sheet2.crop(width * 5, height*2, width, height);
                
                jumpball[0] = sheet2.crop(width * 6, height*2, width, height);
		jumpball[1] = sheet2.crop(width * 6, height*2, width, height);
                //walk left
                walk_L[0] = sheet2.crop(width * 3, height*2, width, height);
                walk_L[1] = sheet2.crop(width * 4, height*2, width, height);
                //walk rigth
                walk_R[0] = sheet2.crop(width, height*2, width, height);
		walk_R[1] = sheet2.crop(width*2, height*2, width, height);
                
                standing[0] = sheet2.crop(0, height*2, width, height);
        //voidg[0] = sheet2.crop(0, height*2, width, height);
                voyd = sheet.crop(0, height*2, width, height);
                
	}
	
}

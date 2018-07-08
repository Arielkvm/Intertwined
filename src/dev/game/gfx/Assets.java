package dev.game.gfx;

/**
 * @author EFGK
 */
import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 64, height = 64;

    public static BufferedImage floor, floor_asfalt, obstacle, brick, plataform, spTile, voyd, build1, build1_2, build2, build2_2, build3, build3_2, platarform;
    public static BufferedImage Death, diamond, Spike, Player, Enemy, Win, Logo, ST1, ST2;
    public static BufferedImage[] Gun, Potion1, Brain, Clock, Sneaker, Sword, Bomb, Potion2, Back, Next, PAA, EAA;
    public static BufferedImage[] B1, B2, B3, B4, jump, jumpball, run, walk_R, walk_L, standing, M, L;
    public static BufferedImage F1, F2, F3, F4, F5, F6;

    public static void init() {

        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/grid2.png"));
        SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage("/textures/Sheet1.png"));
        SpriteSheet sheet3 = new SpriteSheet(ImageLoader.loadImage("/textures/Sheet2.png"));
        SpriteSheet BTN = new SpriteSheet(ImageLoader.loadImage("/textures/SpriteSheet.png"));
        SpriteSheet Fondo1 = new SpriteSheet(ImageLoader.loadImage("/textures/fc3.png"));
        SpriteSheet Fondo2 = new SpriteSheet(ImageLoader.loadImage("/textures/FB.png"));
        SpriteSheet Fondo3 = new SpriteSheet(ImageLoader.loadImage("/textures/FC.png"));
        SpriteSheet Fondo4 = new SpriteSheet(ImageLoader.loadImage("/textures/muertito.png"));
        SpriteSheet dia = new SpriteSheet(ImageLoader.loadImage("/textures/diamond.png"));
        SpriteSheet SPK = new SpriteSheet(ImageLoader.loadImage("/textures/Spike.png"));
        SpriteSheet W = new SpriteSheet(ImageLoader.loadImage("/textures/Win.png"));
        SpriteSheet LG = new SpriteSheet(ImageLoader.loadImage("/textures/Logo.png"));
        SpriteSheet Story1 = new SpriteSheet(ImageLoader.loadImage("/textures/story1.png"));
        SpriteSheet Story2 = new SpriteSheet(ImageLoader.loadImage("/textures/story2.png"));
        
        //Last Assets
        ST1 = Story1.crop(0, 0, 900, 500);
        ST2 = Story2.crop(0, 0, 900, 500);
        Win = W.crop(0, 0, 900, 500);
        Logo = LG.crop(0, 0, width * 4, height);

        //player & Enemy
        Player = sheet2.crop(width * 8, height * 4, width, height);
        Enemy = sheet2.crop(width * 9, height * 4, width, height);

        //Attack Arrays
        PAA = new BufferedImage[5];
        EAA = new BufferedImage[5];

        //Player
        //Gun
        PAA[0] = sheet2.crop(0, height * 4, width, height);
        //Potion
        PAA[1] = sheet2.crop(width, height * 4, width, height);
        //Sword
        PAA[2] = sheet2.crop(width * 5, height * 4, width, height);
        //bomb
        PAA[3] = sheet2.crop(width * 6, height * 4, width, height);
        //voyd
        PAA[4] = sheet.crop(0, height * 2, width, height);

        //Enemy
        //Gun
        EAA[0] = sheet2.crop(0, height * 5, width, height);
        //Bomb 2
        EAA[1] = sheet2.crop(width * 6, height * 5, width, height);
        //Sword
        EAA[2] = sheet2.crop(width * 5, height * 5, width, height);
        //Bomb
        EAA[3] = sheet2.crop(width * 6, height * 5, width, height);
        //voyd
        EAA[4] = sheet.crop(0, height * 2, width, height);

        //Money & Life
        M = new BufferedImage[11];

        M[0] = sheet3.crop(0, height, width, height);
        M[1] = sheet3.crop(0, 0, width, height);
        M[2] = sheet3.crop(width, 0, width, height);
        M[3] = sheet3.crop(width * 2, 0, width, height);
        M[4] = sheet3.crop(width * 3, 0, width, height);
        M[5] = sheet3.crop(width * 4, 0, width, height);
        M[6] = sheet3.crop(width * 5, 0, width, height);
        M[7] = sheet3.crop(width * 6, 0, width, height);
        M[8] = sheet3.crop(width * 7, 0, width, height);
        M[9] = sheet3.crop(width * 8, 0, width, height);
        M[10] = sheet3.crop(width * 9, 0, width, height);

        L = new BufferedImage[21];

        L[0] = sheet3.crop(0, height * 2, width, height);
        L[1] = sheet3.crop(width, height * 2, width, height);
        L[2] = sheet3.crop(width * 2, height * 2, width, height);
        L[3] = sheet3.crop(width * 3, height * 2, width, height);
        L[4] = sheet3.crop(width * 4, height * 2, width, height);
        L[5] = sheet3.crop(width * 5, height * 2, width, height);
        L[6] = sheet3.crop(width * 6, height * 2, width, height);
        L[7] = sheet3.crop(width * 7, height * 2, width, height);
        L[8] = sheet3.crop(width * 8, height * 2, width, height);
        L[9] = sheet3.crop(width * 9, height * 2, width, height);
        L[10] = sheet3.crop(0, height * 3, width, height);
        L[11] = sheet3.crop(width, height * 3, width, height);
        L[12] = sheet3.crop(width * 2, height * 3, width, height);
        L[13] = sheet3.crop(width * 3, height * 3, width, height);
        L[14] = sheet3.crop(width * 4, height * 3, width, height);
        L[15] = sheet3.crop(width * 5, height * 3, width, height);
        L[16] = sheet3.crop(width * 6, height * 3, width, height);
        L[17] = sheet3.crop(width * 7, height * 3, width, height);
        L[18] = sheet3.crop(width * 8, height * 3, width, height);
        L[19] = sheet3.crop(width * 9, height * 3, width, height);
        L[20] = sheet3.crop(0, height * 4, width, height);
        //Diamond & Spike
        diamond = dia.crop(0, 0, width, height);
        Spike = SPK.crop(0, 0, width, height);
        //Fondos
        F1 = Fondo1.crop(0, 0, width * 62, height * 7);
        F2 = Fondo2.crop(0, 0, width * 50, height * 7);
        F6 = Fondo3.crop(0, 0, width * 11, height * 7);
        Death = Fondo4.crop(0, 0, 900, 500);

        //Back & Next
        Back = new BufferedImage[2];
        Next = new BufferedImage[2];

        Back[0] = sheet2.crop(width * 6, height * 6, width * 2, height);
        Back[1] = sheet2.crop(width * 8, height * 6, width * 2, height);

        Next[0] = sheet2.crop(width * 6, height * 7, width * 2, height);
        Next[1] = sheet2.crop(width * 8, height * 7, width * 2, height);
        //Buttons
        B1 = new BufferedImage[2];
        B2 = new BufferedImage[2];
        B3 = new BufferedImage[2];
        B4 = new BufferedImage[2];

        B1[0] = sheet2.crop(0, height * 6, width * 3, height);
        B1[1] = sheet2.crop(width * 3, height * 6, width * 3, height);

        B2[0] = sheet2.crop(0, height * 7, width * 3, height);
        B2[1] = sheet2.crop(width * 3, height * 7, width * 3, height);

        B3[0] = sheet2.crop(0, height * 8, width * 3, height);
        B3[1] = sheet2.crop(width * 3, height * 8, width * 3, height);

        B4[0] = sheet2.crop(0, height * 9, width * 3, height);
        B4[1] = sheet2.crop(width * 3, height * 9, width * 3, height);

        //Atack & Store BTNs
        Gun = new BufferedImage[2];
        Potion1 = new BufferedImage[2];
        Brain = new BufferedImage[2];
        Clock = new BufferedImage[2];
        Sneaker = new BufferedImage[2];
        Sword = new BufferedImage[2];
        Bomb = new BufferedImage[2];
        Potion2 = new BufferedImage[2];
        
        /*atack*/
        Gun[0] = sheet2.crop(0, height * 4, width, height);
        Gun[1] = sheet2.crop(0, height * 5, width, height);

        Potion1[0] = sheet2.crop(width, height * 4, width, height);
        Potion1[1] = sheet2.crop(width, height * 5, width, height);

        Sword[0] = sheet2.crop(width * 5, height * 4, width, height);
        Sword[1] = sheet2.crop(width * 5, height * 5, width, height);

        Bomb[0] = sheet2.crop(width * 6, height * 4, width, height);
        Bomb[1] = sheet2.crop(width * 6, height * 5, width, height);

        /*Store*/
        Brain[0] = sheet2.crop(width * 2, height * 4, width, height);
        Brain[1] = sheet2.crop(width * 2, height * 5, width, height);

        Clock[0] = sheet2.crop(width * 3, height * 4, width, height);
        Clock[1] = sheet2.crop(width * 3, height * 5, width, height);

        Sneaker[0] = sheet2.crop(width * 4, height * 4, width, height);
        Sneaker[1] = sheet2.crop(width * 4, height * 5, width, height);

        Potion2[0] = sheet2.crop(width * 7, height * 4, width, height);
        Potion2[1] = sheet2.crop(width * 7, height * 5, width, height);

        //world
        floor = sheet2.crop(0, 0, width, height);
        floor_asfalt = sheet2.crop(width * 3, 0, width, height);
        obstacle = sheet2.crop(width, 0, width, height);
        brick = sheet2.crop(width * 2, 0, width, height);
        brick = sheet2.crop(width * 3, 0, width, height);
        spTile = sheet2.crop(width * 4, 0, width, height);
        build1 = sheet2.crop(width * 4, 0, width, height);
        build1_2 = sheet2.crop(width * 5, 0, width, height);
        build2 = sheet2.crop(width * 6, 0, width, height);
        build2_2 = sheet2.crop(width * 7, 0, width, height);
        build3 = sheet2.crop(width * 8, 0, width, height);
        build3_2 = sheet2.crop(width * 9, 0, width, height);
        platarform = sheet2.crop(width * 0, height * 3, width, height);

        //player
        run = new BufferedImage[2];
        jump = new BufferedImage[2];
        jumpball = new BufferedImage[2];
        walk_R = new BufferedImage[2];
        walk_L = new BufferedImage[2];
        standing = new BufferedImage[1];
        //run
        run[0] = sheet2.crop(0, height * 2, width, height);
        run[1] = sheet2.crop(width, height * 2, width, height);
        //jump
        jump[0] = sheet2.crop(width * 5, height * 2, width, height);
        jump[1] = sheet2.crop(width * 5, height * 2, width, height);

        jumpball[0] = sheet2.crop(width * 6, height * 2, width, height);
        jumpball[1] = sheet2.crop(width * 6, height * 2, width, height);
        //walk left
        walk_L[0] = sheet2.crop(width * 3, height * 2, width, height);
        walk_L[1] = sheet2.crop(width * 4, height * 2, width, height);
        //walk rigth
        walk_R[0] = sheet2.crop(width, height * 2, width, height);
        walk_R[1] = sheet2.crop(width * 2, height * 2, width, height);

        standing[0] = sheet2.crop(0, height * 2, width, height);
        //voidg[0] = sheet2.crop(0, height*2, width, height);
        voyd = sheet.crop(0, height * 2, width, height);

    }

}

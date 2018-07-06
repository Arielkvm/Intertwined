package dev.game.state;

/**
 * @author EFGK
 */

import dev.game.Entity.Creature.Player;
import dev.game.Handler;
import dev.game.UI.ClickListener;
import dev.game.UI.UIIButton;
import dev.game.UI.UIManager;
import dev.game.gfx.Assets;
import java.awt.Graphics;


public class GameState3 extends State{
    
    public UIManager UIM;
    int DM =75;

    //Player
    boolean Gun_Plus = false, Bomb_Plus = true, Sword_Plus = false, Potion_Plus = false;
    int GunA = 10, BombA = 10, SwordA = 10, PotionR = 10;
    int lifeP = Player.DEFAULT_HEALTH;

    //Enemy
    int ATModifier1, ATModifier2, ATModifie3;
    int atackE, lifeE = 100, LC = (lifeE/10);

    public GameState3(Handler handler) {
        super(handler);
        UIM = new UIManager(handler);
        handler.getMouseManager().setUIManager(UIM);

        UIM.addObject(new UIIButton(25, 390, DM, DM, Assets.Bomb, new ClickListener() {
            @Override
            public void onClick() {
                if (Bomb_Plus) {
                    BombA = BombA + 10;
                    lifeE = -BombA;
                    LC = LC - 2;
                    System.out.println("vida: " + lifeE + "LC: " + LC);
                    
                } else {
                    lifeE = lifeE - BombA;
                    LC = LC - 1;
                    System.out.println("vida: " + lifeE + "LC: " + LC);
                }
                System.out.println("*Boom*");

            }
        }));

        UIM.addObject(new UIIButton(125, 390, DM, DM, Assets.Sword, new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("*Swoosh*");
            }
        }));

        UIM.addObject(new UIIButton(225, 390, DM, DM, Assets.Potion1, new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("*Gulp*");
            }
        }));

        UIM.addObject(new UIIButton(325, 390, DM, DM, Assets.Gun, new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("*Pew Pew*");
            }
        }));
    }

    @Override
    public void tick() {
        UIM.tick();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.F1, 0, 0, 900, 500, null);
        g.drawImage(Assets.M_L[LC], 0, 0, 64, 64, null);
        UIM.render(g);
    }

}

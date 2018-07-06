package dev.game.state;

/**
 * @author EFGK
 */
import dev.game.Entity.Creature.Enemy;
import dev.game.Entity.Creature.Player;
import dev.game.Handler;
import dev.game.UI.ClickListener;
import dev.game.UI.UIIButton;
import dev.game.UI.UIManager;
import dev.game.gfx.Assets;
import java.awt.Graphics;

public class GameState3 extends State {

    public UIManager UIM;
    int DM = 75;

    //Player
    boolean Gun_Plus = false, Bomb_Plus = true, Sword_Plus = false, Potion_Plus = false;
    int GunA = 10, BombA = 10, SwordA = 10, PotionR = 10;
    int lifeP = Player.DEFAULT_HEALTH;

    //Enemy
    int ATModifier1, ATModifier2, ATModifie3;
    int atackE, lifeE = 100, LC = (lifeE / 10), LP = (lifeP / 10);
    Enemy ene = new Enemy();

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
                    if (LC <= 0) {
                        LC = 0;
                    }
                    System.out.println("vida: " + lifeE + "LC: " + LC);
                    //lol
                    lifeP = lifeP - ene.attack();
                    switch (ene.attack()) {
                        case 5:
                            LC = LC - 1;
                            break;
                        case 10:
                            LC = LC - 1;
                            break;
                        case 15:
                            LC = LC - 2;
                            break;
                        case 20:
                            LC = LC - 2;
                            break;
                        default:
                             LC = LC;
                            break;
                    }
                    LP = LP - 1;
                } else {
                    lifeE = lifeE - BombA;
                    LC = LC - 1;
                    if (LC <= 0) {
                        LC = 0;
                    }
                    System.out.println("vida: " + lifeE + "LC: " + LC);
                    ene.attack();
                }
                System.out.println("*Boom*");

            }
        }));

        UIM.addObject(new UIIButton(125, 390, DM, DM, Assets.Sword, new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("*Swoosh*");
                if (Sword_Plus) {
                    SwordA = SwordA + 10;
                    lifeE = -SwordA;
                    LC = LC - 2;
                    if (LC <= 0) {
                        LC = 0;
                    }
                    System.out.println("vida: " + lifeE + "LC: " + LC);

                } else {
                    lifeE = lifeE - SwordA;
                    LC = LC - 1;
                    if (LC <= 0) {
                        LC = 0;
                    }
                    System.out.println("vida: " + lifeE + "LC: " + LC);
                }
            }
        }));

        UIM.addObject(new UIIButton(225, 390, DM, DM, Assets.Potion1, new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("*Gulp*");
                if (Potion_Plus) {
                    PotionR = PotionR + 10;
                    lifeP = +PotionR;
                    LP = LP + 2;
                    if (LP >= 10) {
                        LP = 10;
                    }
                    System.out.println("vida: " + lifeP + "LC: " + LP);

                } else {
                    lifeP = lifeP + PotionR;
                    LP = LP + 1;
                    if (LP >= 10) {
                        LP = 10;
                    }
                    System.out.println("vida: " + lifeE + "LC: " + LP);
                }
            }
        }));

        UIM.addObject(new UIIButton(325, 390, DM, DM, Assets.Gun, new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("*Pew Pew*");
                if (Gun_Plus) {
                    GunA = GunA + 10;
                    lifeE = -GunA;
                    LC = LC - 2;
                    if (LC <= 0) {
                        LC = 0;
                    }
                    System.out.println("vida: " + lifeE + "LC: " + LC);

                } else {
                    lifeE = lifeE - GunA;
                    LC = LC - 1;
                    if (LC <= 0) {
                        LC = 0;
                    }
                    System.out.println("vida: " + lifeE + "LC: " + LC);
                }
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
        g.drawImage(Assets.M_L[LP], 300, 300, 64, 64, null);
        UIM.render(g);
    }

}

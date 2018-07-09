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
    public static StoreState store;
    int DM = 75;

    //Player
    private boolean Gun_Plus = false;
    private boolean Bomb_Plus = false;
    private boolean Sword_Plus = false;
    private boolean Potion_Plus = false;

    int GunA = 1, BombA = 1, SwordA = 1, PotionR = 3;
    int LifeP = 20;
    int PlayerAA = 4;

    //Enemy
    int ATModifier1, ATModifier2, ATModifie3;
    int atackE, LifeE = 20;
    int EnemyAA = 4;
    Enemy ene = new Enemy();

    public GameState3(Handler handler) {
        super(handler);
        UIM = new UIManager(handler);
        handler.getMouseManager().setUIManager(UIM);

        UIM.addObject(new UIIButton(25, 390, DM, DM, Assets.Bomb, new ClickListener() {
            @Override
            public void onClick() {
                PlayerAA = 3;

                if (Bomb_Plus) {
                    BombA = 2;
                    LifeE = LifeE - BombA;
                    if (LifeE <= 0) {
                        LifeE = 0;
                        State.setState(handler.getGame().getWinState());
                    }
                } else {
                    LifeE = LifeE - BombA;
                    if (LifeE <= 0) {
                        LifeE = 0;
                        State.setState(handler.getGame().getWinState());
                    }
                }

//                System.out.println("*Boom*");
                switch (ene.attack()) {
                    case 1:
                        if ((LifeP - 1) <= 0) {
                            State.setState(handler.getGame().getDeathState());
                        } else {
                            LifeP = LifeP - 1;
                            EnemyAA = 0;
                        }
                        break;
                    case 2:
                        if ((LifeP - 2) <= 0) {
                            State.setState(handler.getGame().getDeathState());
                        } else {
                            LifeP = LifeP - 2;
                            EnemyAA = 1;
                        }
                        break;
                    case 3:
                        if ((LifeP - 3) <= 0) {
                            State.setState(handler.getGame().getDeathState());
                        } else {
                            LifeP = LifeP - 3;
                            EnemyAA = 2;
                        }
                        break;
                    case 4:
                        if ((LifeP - 4) <= 0) {
                            State.setState(handler.getGame().getDeathState());
                        } else {
                            LifeP = LifeP - 4;
                            EnemyAA = 3;
                        }
                        break;
                    default:
                        LifeP = LifeP;
                        break;
                }

            }
        }));

        UIM.addObject(new UIIButton(125, 390, DM, DM, Assets.Sword, new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("*Swoosh*");
                PlayerAA = 2;
                if (Sword_Plus) {
                    SwordA = 1;
                    LifeE = LifeE - SwordA;
                    if (LifeE <= 0) {
                        LifeE = 0;
                        State.setState(handler.getGame().getWinState());
                    }
                } else {
                    LifeE = LifeE - SwordA;
                    if (LifeE <= 0) {
                        LifeE = 0;
                        State.setState(handler.getGame().getWinState());
                    }
                }

                switch (ene.attack()) {
                    case 1:
                        if ((LifeP - 1) <= 0) {
                            State.setState(handler.getGame().getDeathState());
                        } else {
                            LifeP = LifeP - 1;
                            EnemyAA = 0;
                        }
                        break;
                    case 2:
                        if ((LifeP - 2) <= 0) {
                            State.setState(handler.getGame().getDeathState());
                        } else {
                            LifeP = LifeP - 2;
                            EnemyAA = 1;
                        }
                        break;
                    case 3:
                        if ((LifeP - 3) <= 0) {
                            State.setState(handler.getGame().getDeathState());
                        } else {
                            LifeP = LifeP - 3;
                            EnemyAA = 2;
                        }
                        break;
                    case 4:
                        if ((LifeP - 4) <= 0) {
                            State.setState(handler.getGame().getDeathState());
                        } else {
                            LifeP = LifeP - 4;
                            EnemyAA = 3;
                        }
                        break;
                    default:
                        LifeP = LifeP;
                        break;
                }
            }
        }));

        UIM.addObject(new UIIButton(225, 390, DM, DM, Assets.Potion1, new ClickListener() {
            @Override
            public void onClick() {
                PlayerAA = 1;
                System.out.println("*Gulp*");
                if (Potion_Plus) {

                    PotionR = 5;
                    LifeP = LifeP + PotionR;

                    if (LifeP >= 20) {
                        LifeE = 0;
                        State.setState(handler.getGame().getDeathState());
                    }

                } else {

                    LifeP = LifeP + PotionR;

                    if (LifeP >= 20) {
                        LifeP = 20;
                    }

                }

                switch (ene.attack()) {
                    case 1:
                        if ((LifeP - 1) <= 0) {
                            State.setState(handler.getGame().getDeathState());
                        } else {
                            LifeP = LifeP - 1;
                            EnemyAA = 0;
                        }
                        break;
                    case 2:
                        if ((LifeP - 2) <= 0) {
                            State.setState(handler.getGame().getDeathState());
                        } else {
                            LifeP = LifeP - 2;
                            EnemyAA = 1;
                        }
                        break;
                    case 3:
                        if ((LifeP - 3) <= 0) {
                            State.setState(handler.getGame().getDeathState());
                        } else {
                            LifeP = LifeP - 3;
                            EnemyAA = 2;
                        }
                        break;
                    case 4:
                        if ((LifeP - 4) <= 0) {
                            State.setState(handler.getGame().getDeathState());
                        } else {
                            LifeP = LifeP - 4;
                            EnemyAA = 3;
                        }
                        break;
                    default:
                        LifeP = LifeP;
                        break;
                }
            }
        }));

        UIM.addObject(new UIIButton(325, 390, DM, DM, Assets.Gun, new ClickListener() {
            @Override
            public void onClick() {
                PlayerAA = 0;
                System.out.println("*Pew Pew*");
                if (Gun_Plus) {

                    GunA = 3;
                    LifeE = LifeE - GunA;

                    if (LifeE <= 0) {
                        LifeE = 0;
                        State.setState(handler.getGame().getWinState());
                    }

                } else {

                    LifeE = LifeE - GunA;

                    if (LifeE <= 0) {
                        LifeE = 0;
                        State.setState(handler.getGame().getWinState());
                    }

                }

                switch (ene.attack()) {
                    case 1:
                        if ((LifeP - 1) <= 0) {
                            State.setState(handler.getGame().getDeathState());
                        } else {
                            LifeP = LifeP - 1;
                            EnemyAA = 0;
                        }
                        break;
                    case 2:
                        if ((LifeP - 2) <= 0) {
                            State.setState(handler.getGame().getDeathState());
                        } else {
                            LifeP = LifeP - 2;
                            EnemyAA = 1;
                        }
                        break;
                    case 3:
                        if ((LifeP - 3) <= 0) {
                            State.setState(handler.getGame().getDeathState());
                        } else {
                            LifeP = LifeP - 3;
                            EnemyAA = 2;
                        }
                        break;
                    case 4:
                        if ((LifeP - 4) <= 0) {
                            State.setState(handler.getGame().getDeathState());
                        } else {
                            LifeP = LifeP - 4;
                            EnemyAA = 3;
                        }
                        break;
                    default:
                        LifeP = LifeP;
                        break;
                }
            }
        }));
    }

    public void setGun_Plus(boolean Gun_Plus) {
        this.Gun_Plus = Gun_Plus;
    }

    public void setBomb_Plus(boolean Bomb_Plus) {
        this.Bomb_Plus = Bomb_Plus;
    }

    public void setSword_Plus(boolean Sword_Plus) {
        this.Sword_Plus = Sword_Plus;
    }

    public void setPotion_Plus(boolean Potion_Plus) {
        this.Potion_Plus = Potion_Plus;
    }

    public void setGunA(int GunA) {
        this.GunA = GunA;
    }

    @Override

    public void tick() {
        UIM.tick();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.F1, 0, 0, 900, 500, null);

        //Enemy
        g.drawImage(Assets.L[LifeE], 640, 80, 64, 64, null);
        g.drawImage(Assets.Enemy, 732, 32, 100, 100, null);
        g.drawImage(Assets.EAA[EnemyAA], 550, 150, 150, 150, null);

        //Payer
        g.drawImage(Assets.L[LifeP], 196, 325, 64, 64, null);
        g.drawImage(Assets.Player, 64, 275, 100, 100, null);
        g.drawImage(Assets.PAA[PlayerAA], 200, 150, 150, 150, null);
        UIM.render(g);
    }

}

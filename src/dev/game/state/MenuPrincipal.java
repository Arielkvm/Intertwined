package dev.game.state;

/**
 * @author EFGK
 */

import dev.game.Handler;
import dev.game.UI.ClickListener;
import dev.game.UI.UIIButton;
import dev.game.UI.UIManager;
import dev.game.gfx.Assets;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import music.Musica;

public class MenuPrincipal extends State {

    public UIManager uimanager;
//    Musica musica = new Musica();
//    public void music(){
//        File Music = new File("src/music/UndertaleAnotherMedium.wav");
//        PlaySound(Music);
//    }
//    static void PlaySound(File Sound){
//        try{
//            Clip clip = AudioSystem.getClip();
//            clip.open(AudioSystem.getAudioInputStream(Sound));
//            clip.start();
//            Thread.sleep(clip.getMicrosecondLength()/1000);
//        }catch(Exception e){
//            
//        }
//    }

//    public Musica getMusica() {
//        return musica;
//    }
//
//    public void parar() {
//        musica.detener();
//    }

    public MenuPrincipal(Handler handler) {
        super(handler);
        uimanager = new UIManager(handler);
        handler.getMouseManager().setUIManager(uimanager);

        uimanager.addObject(new UIIButton(352, 200, 192, 64, Assets.B1, new ClickListener() {
            @Override
            public void onClick() {
                handler.getMouseManager().setUIManager(null);
                handler.getGame().createStage1_1();
                State.setState(handler.getGame().getGameState());
//                musica.start();
            }
        }));

        uimanager.addObject(new UIIButton(352, 265, 192, 64, Assets.B2, new ClickListener() {
            @Override
            public void onClick() {
//                JuegoDao fd = new JuegoDao();
//                Juego f = fd.getTop();
//                System.out.println(f.getId());
                handler.getMouseManager().setUIManager(null);
                State.setState(handler.getGame().getSettingsstate());
            }
        }));

        uimanager.addObject(new UIIButton(352, 330, 192, 64, Assets.B3, new ClickListener() {
            @Override
            public void onClick() {
                handler.getMouseManager().setUIManager(null);
                State.setState(handler.getGame().getStoreState());
            }
        }));

        uimanager.addObject(new UIIButton(352, 395, 192, 64, Assets.B4, new ClickListener() {
            @Override
            public void onClick() {
                handler.getMouseManager().setUIManager(null);
                State.setState(handler.getGame().getHistoryState());
            }
        }));
        //Debug
        uimanager.addObject(new UIIButton(64, 64, 64, 64, Assets.B4, new ClickListener() {
            @Override
            public void onClick() {
                handler.getMouseManager().setUIManager(null);
                State.setState(handler.getGame().getGameState3());
            }
        }));
    }

    @Override
    public void tick() {
        uimanager.tick();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.F6, 0, 0, 900, 500, null);
        g.drawImage(Assets.Logo, 250, 64, 394, 96, null);

        uimanager.render(g);

    }

}

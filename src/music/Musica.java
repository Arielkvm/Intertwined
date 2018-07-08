
package music;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author GEEK
 */
public class Musica extends Thread {
    static void PlaySound(){
        File Music = new File("src/music/UndertaleAnotherMedium.wav");
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Music));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
            
            
        }catch(Exception e){
            
        }
    }
    volatile boolean ejecutar = true;

    public void detener() {
        ejecutar = false;
        
    }
    @Override
    public void run(){
        while(ejecutar) {
            PlaySound();
            yield();
        }
        
    }
}

package base;

import java.util.ArrayList;
import sun.net.www.content.text.Generic;

/**
 *
 * @author EFGK
 */
public interface metodos<Generic> {
    public boolean create(Generic g);
    public boolean delete (Object key);
    public boolean update (Generic c);
    public boolean updatePuntaje (Generic c);
    public boolean updateArma1 (Generic c);
    public boolean updateArma2 (Generic c);
    public boolean updateVida (Generic c);
    public boolean updateAtaque (Generic c);
    public boolean updateCuracion (Generic c);
    public Generic getTop (); 
    //public int getIdU();
    
    public Generic read(Object key);
    public ArrayList <Generic> readAll();
}

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
    
    public Generic read(Object key);
    public ArrayList <Generic> readAll();
}

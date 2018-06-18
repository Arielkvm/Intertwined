package dev.game.Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author kevin
 */
public class Utils {

    public static String loadFileAsString(String path) {
        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String Line;
            while ((Line = br.readLine()) != null) {
                builder.append(Line + "\n");
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return builder.toString();
    }
    
    public static int parseInt(String number){
        try{
            return Integer.parseInt(number);
        }catch(NumberFormatException e){
            e.printStackTrace();
            return 0;
        }
    }
}

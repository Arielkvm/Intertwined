/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.game.Entity.Creature;

import java.util.Random;

/**
 *
 * @author GEEK
 */
public class Enemy {
    public int[] alAzar = {1,2,3,4};
    
    public int AtacarAlAzar(int[] AR){
        int rn = new Random().nextInt(AR.length);
        return AR[rn];
    }
    
    public int attack(){
        int n = AtacarAlAzar(alAzar);
        switch(n){
            case 1:
                System.out.println("Verga te hice "+10+" de daño");
                return 10;
            case 2:
                System.out.println("Verga te hice "+5+" de daño");
                return 5;
            case 3:
                System.out.println("Verga te hice "+15+" de daño");
                return 15;
            case 4:
                System.out.println("Verga te hice "+20+" de daño");
                return 20;
            default:
                return 0;
        }
    }
    
    
}

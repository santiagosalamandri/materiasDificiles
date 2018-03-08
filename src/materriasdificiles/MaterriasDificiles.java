/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materriasdificiles;

import java.util.Random;

/**
 *
 * @author utku38
 */
public class MaterriasDificiles extends MetodosSteve{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand= new Random();
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=rand.nextInt(10);
                System.out.print(" "+matriz[i][j]);
            }
            imprimir("");
        }
        
        
        
    }
    
}

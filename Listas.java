/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.Iterator;

/**
 *
 * @author Humberto
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int NUM_BALL = 75, NUM_PULLS = 10;
        LinkedSet<BingoBall> bingo = new LinkedSet<>();
        BingoBall ball;
        for (int i = 1; i <= NUM_BALL; i++) {
            ball = new BingoBall(i);
            bingo.add(ball);

        }
        System.out.println("size:" + bingo.size());
        for (int i = 1; i <= NUM_PULLS; i++) {
            ball = bingo.removeRandom();
            System.out.println(ball);
        }
        System.out.println("size:" + bingo.size());
        Iterator iterator=bingo.iterator();
        while (iterator.hasNext()){
        BingoBall p= (BingoBall)iterator.next();
        System.out.println(p);
    }
    }

}

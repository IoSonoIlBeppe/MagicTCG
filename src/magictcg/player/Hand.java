/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.player;

import java.util.ArrayList;
import java.util.List;
import magictcg.cards.IMagic;

/**
 *
 * @author gianmarcocallegher
 */
public class Hand {
    List<IMagic> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    /* Metodo per scartare una carta */ 
    public void discardCard (int i) {
        if (!hand.isEmpty())
            hand.remove(i);
    }
    
    /* Metodo per aggiungere una carta alla mano */
    public void addCard (IMagic c) {
        hand.add(c);
    }
    
    /* Metodo per giocare una carta */
    public IMagic pickCard (int i) {
        return (!hand.isEmpty())? hand.remove(i) : null;
    }
    
    /* Metodo che restituisce il numero di carte nella mano */
    public int getSize () {
        return hand.size();
    }
    
    public void showCards () {
        int i = 1;
        for (IMagic c : hand)
            System.out.println(c.getName() + " " + i);      
    }
}

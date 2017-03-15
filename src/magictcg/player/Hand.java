/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.player;

import java.util.ArrayList;
import java.util.List;
import magictcg.magic.IMagic;
import magictcg.magic.instant.IInstant;


/**
 *
 * @author gianmarcocallegher
 */
public class Hand {
    List<IMagic> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.hand.isEmpty();
    }
    
    /* Metodo per scartare una magia */ 
    public void discardMagic (int i) {
        if (!hand.isEmpty())
            hand.remove(i - 1);
    }
    
    /* Metodo per aggiungere una magia alla mano */
    public void addMagic (IMagic m) {
        hand.add(m);
    }
    
    /* Metodo per giocare una magia */
    public IMagic pickMagic (int i) {
        return (!hand.isEmpty())? hand.remove(i - 1) : null;
    }
    
    /* Metodo che restituisce il numero di magie nella mano */
    public int getSize () {
        return hand.size();
    }
    
    public IMagic getMagic (int i) {
        return hand.get(i);
    }
    
    public void showMagics () {
        int i = 1;
        for (IMagic m : hand) {
            System.out.println(m.getName() + " " + i);
            i++;
        }
    }
    
    public void showInstants() {
        int i = 1;
        for (IMagic m : hand) {
            if (m instanceof IInstant) {
                System.out.println(m.getName() + " " + i);
            }
            i++;
        }
    }
    
    public boolean hasInstants () {
        boolean flag = false;
        for (IMagic m : hand)
            if (m instanceof IInstant)
                flag = true;
        return flag;
    }
        
}

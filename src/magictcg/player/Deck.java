/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.player;

import java.util.ArrayList;
import java.util.List;
import magictcg.magic.IMagic;

/**
 *
 * @author Beppe
 */
public class Deck {

    List<IMagic> magics;

    public Deck() {
        this.magics = new ArrayList<>();
    }
    
    /**
     * Mette una magia m nel mazzo
     * @param m magia da inserire nel deck
     */
    public void push(IMagic m) {
        magics.add(m);
    }
    /**
     * Pesca una magia dal Deck, se non è vuoto
     * @return ritorna la magia in cima al deck
     */
    public IMagic pop () {
        return (magics.isEmpty())? null : magics.remove(0);
    }
    
    /**
     * Computa il numero di magie nel deck
     * @return la dimensione del deck
     */
    public int getSize() {
        return magics.size();
    }
}

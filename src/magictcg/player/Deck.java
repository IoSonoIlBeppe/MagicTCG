/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.player;

import magictcg.cards.IMagic;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Beppe
 */
public class Deck {

    List<IMagic> cards;

    public Deck(List<IMagic> cards) {
        this.cards = cards;
    }
    
    /* Pesca una carta dal Deck, se non è vuoto */
    public IMagic pop () {
        return (cards.isEmpty())? null : cards.remove(0);
    }
}

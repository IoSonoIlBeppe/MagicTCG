/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.player;

import java.util.List;
import magictcg.magic.IMagic;

/**
 *
 * @author Beppe
 */
public class Deck {

    List<IMagic> magics;

    public Deck(List<IMagic> cards) {
        this.magics = cards;
    }
    
    /* Pesca una magia dal Deck, se non è vuoto */
    public IMagic pop () {
        return (magics.isEmpty())? null : magics.remove(0);
    }
}

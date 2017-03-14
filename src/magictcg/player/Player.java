/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.player;

import magictcg.Game;
import magictcg.cards.IMagic;


/**
 *
 * @author Beppe
 */
public class Player {
    int lifepoints;
    Field field;
    Deck deck;
    Hand hand;

    public Player(int lifepoints, Deck deck) {
        this.lifepoints = lifepoints;
        this.deck = deck;
        field = new Field();
        hand = new Hand();
    }

    public Field getField() {
        return field;
    }

    public Deck getDeck() {
        return deck;
    }

    public Hand getHand() {
        return hand;
    }

    public int getLifepoints() {
        return lifepoints;
    }
    
    /* Pesca carta, se ce ne sono nel deck*/
    public boolean drawCard() {
        IMagic c = deck.pop();
        if (c != null) {
            hand.addCard(c);
            return true;
        }
        return false;
    }
    
    /* Viene aggiunta una carta allo Stack, se la mano non è vuota */
    public void playCard (int i) {
        IMagic c = hand.pickCard(i);
        if (c != null)
            Game.getInstanceGame().getStack().pushCard(c);   // bisogna chiedere all'avversario se vuole rispondere con un istantanea
    }
    
    /* Metodo che modifica i lifepoints in seguito all'attacco di un avversario */
    public void modifyLifePoints (int n) {
        lifepoints += n;
    }
}

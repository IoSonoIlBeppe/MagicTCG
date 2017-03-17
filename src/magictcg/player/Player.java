/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.player;

import magictcg.Game;
import magictcg.PhaseManager;
import magictcg.magic.IMagic;
import magictcg.magic.instant.Omeopathy;

/**
 *
 * @author Beppe
 */
public class Player {
    
    String name;
    int lifepoints;
    Field field;
    Deck deck;
    Hand hand;
    PhaseManager phaseManager;

    public Player(int lifepoints, String name) {
        this.name = name;
        this.lifepoints = lifepoints;
        this.deck = new Deck();
        field = new Field();
        hand = new Hand();
        phaseManager = new PhaseManager();
    }

    public String getName() {
        return name;
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

    public PhaseManager getPhaseManager() {
        return phaseManager;
    }

    public void setLifepoints(int lifepoints) {
        this.lifepoints = lifepoints;
    }

    public void setOmeopathyDeck() {
        for (int i = 0; i < 10; i++) {
            deck.push(new Omeopathy());
        }
    }
    
    public void setFirstHand() {
        for (int i = 0; i < 5; i++) {
            this.drawMagic();
        }
    }

    /* Pesca una magia, se ce ne sono nel deck, se non riesce a pescare setta la propria vita a 0*/
    public boolean drawMagic() {
        IMagic m = deck.pop();
        if (m != null) {
            hand.addMagic(m);
            return true;
        } else {
            lifepoints = 0;
            return false;
        }

    }

    public void playMagic(int i) {
        Game.getInstanceGame().getStack().pushMagic(this.getHand().pickMagic(i));
    }

    /* Metodo che modifica i lifepoints in seguito all'attacco di un avversario */
    public void modifyLifePoints(int n) {
        lifepoints += n;
    }

}

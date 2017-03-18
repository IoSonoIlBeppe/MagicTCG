package magictcg.player;

import magictcg.Game;
import magictcg.PhaseManager;
import magictcg.magic.IMagic;
import magictcg.magic.instant.Omeopathy;

/**
 * Tale classe definisce il giocatore. Il suo compito è di contenere le informazioni
 * riguardanti se stesso come il nome, i punti vita, le sue magie permanenti presenti in campo ( field ),
 * il suo mazzo di magie (deck), le magie che possiede in mano (hand) e le varie fasi che deve
 * attraversare durante il suo turno (phaseManager). Inoltre, vengono fatti interagire 
 * con alcuni metodi.
 */
public class Player {
    
    String name;
    int lifepoints;
    Field field;
    Deck deck;
    Hand hand;
    PhaseManager phaseManager;

    /**
     * Vengono inizializzati nome, punti vita, mazzo , magie in mano e gestore delle fasi.
     * @param lifepoints punti vita del giocatore
     * @param name nome del giocatore 
     */
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
    
    /**
     * Si crea un mazzo contenente 10 magie Omeopatia.
     */
    public void setOmeopathyDeck() {
        for (int i = 0; i < 10; i++) {
            deck.push(new Omeopathy());
        }
    }
    
    /**
     * Si crea la mano iniziale del giocatore. 
     */
    public void setFirstHand() {
        for (int i = 0; i < 5; i++) {
            this.drawMagic();
        }
    }

    /**
     * Pesca una magia se il mazzo non è vuoto.
     * @return true se sono riuscito a pescare una magia, false altrimenti
     */
    public boolean drawMagic() {
        IMagic m = deck.pop();
        if (m != null) {
            hand.addMagic(m);
            return true;
        }
        return false;
    }
    
    /**
     * Viene inserita una magia, tra quelle presenti nella mano, nello Stack di gioco.
     * @param i posizione della i-esima magia nella mano da inserire nello stack
     */
    public void playMagic(int i) {
        Game.getInstanceGame().getStack().pushMagic(this.getHand().pickMagic(i));
    }

    /**
     * Si modificano i punti vita del giocatore
     * @param n numero da aggiungere ai punti vita ( può essere sia positivo che negativo)
     */
    public void modifyLifePoints(int n) {
        lifepoints += n;
    }

}

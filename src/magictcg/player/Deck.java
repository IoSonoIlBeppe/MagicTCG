package magictcg.player;

import java.util.ArrayList;
import java.util.List;
import magictcg.magic.IMagic;

/**
 * Questa classe definisce il mazzo di un giocatore. Inizialmente non conterrà
 * nessuna magia, ma verranno inserite, uno alla volta, all'inizio della partita.
 * 
 * 
 */
public class Deck {

    List<IMagic> magics;

    /**
     * Crea un mazzo vuoto di default
     */
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

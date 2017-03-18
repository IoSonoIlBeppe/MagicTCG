package magictcg.player;

import java.util.ArrayList;
import java.util.List;
import magictcg.magic.IMagic;
import magictcg.magic.instant.IInstant;


/**
 * Tale classe definisce le magie che un giocatore possiede in mano.
 * Inizialmente il giocatore non possiede nessuna magia. 
 * 
 */
public class Hand {
    List<IMagic> hand;

    /**
     * Crea una lista di magie vuota
     */
    public Hand() {
        this.hand = new ArrayList<>();
    }
    /**
     * Metodo per controllare se ho magie in mano
     * @return true se ho almeno una magia, false altrimenti
     */
    public boolean isEmpty(){
        return this.hand.isEmpty();
    }
    
    /**
     * Scarta la i-esima magia presente in mano
     * @param i , posizione della magia in mano
     */
    public void discardMagic (int i) {
        if (!hand.isEmpty())
            hand.remove(i);
    }
    
    /**
     * Aggiungi una magia alla lista di quelle presenti nella mano
     * @param m magia da aggiungere alla mano
     */
    public void addMagic (IMagic m) {
        hand.add(m);
    }
    
    /**
     * Metodo per giocare una magia dalla mano. Viene poi rimossa dalla lista di magie presenti nella mano 
     * @param i posizione della magia nella mano 
     * @return la magia che si è deciso di giocare 
     */
    public IMagic pickMagic (int i) {
        return hand.remove(i);
    }
    
    /**
     * Indica quante magie ho nella mano
     * @return il numero di magie presenti nella mano
     */
    public int getSize () {
        return hand.size();
    }
    
    /**
     * Metodo per ottenere la magia nella posizione i-esima nella mano. NON viene rimossa dalla mano.
     * @param i posizione i-esima nella mano
     * @return la magia nella posizione i-esima.
     */
    public IMagic getMagic (int i) {
        return hand.get(i);
    }
    
    /**
     * Metodo per elencare tutte le magie presenti nella mano
     */
    public void showMagics () {
        int i = 1;
        for (IMagic m : hand) {
            System.out.println(m.getName() + " " + i);
            i++;
        }
    }
    
    /**
     * Metodo per elencare tutte le magie istantanee presenti nella mano
     */
    public void showInstants() {
        int i = 1;
        for (IMagic m : hand) {
            if (m instanceof IInstant) {
                System.out.println(m.getName() + " " + i);
            }
            i++;
        }
    }
    
    /**
     * Metodo con il quale si controlla se tra le magie nella mano vi è almeno una istantanea
     * @return true se ho almeno una magia istantanea, false altrimenti
     */
    public boolean hasInstants () {
        boolean flag = false;
        for (IMagic m : hand)
            if (m instanceof IInstant)
                flag = true;
        return flag;
    }
        
}

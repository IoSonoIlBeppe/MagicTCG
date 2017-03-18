package magictcg.player;


import java.util.ArrayList;
import java.util.List;
import magictcg.magic.permanent.PermanentCreature;
import magictcg.magic.permanent.IPermanent;

/**
 * Tale classe definisce il campo di un giocatore. Il suo compito è quello di 
 * contenere le magie permanenti che verrano giocate durante la partita.
 */
public class Field {
    List<IPermanent> slots = new ArrayList<>();
    
    /**
     * Viene eseguita l'operazione di Untap per ogni creatura presente in campo 
     */
    public void untap () {
        for (IPermanent p : slots)
            if (p instanceof PermanentCreature)
                ((PermanentCreature) p).setTapped(false);
    }
    
    /**
     * Metodo per ottenere il numero di magie permanenti nel campo
     * @return il numero di magie permanenti nel campo
     */
    public int getSize() {
        return slots.size();
    }
}

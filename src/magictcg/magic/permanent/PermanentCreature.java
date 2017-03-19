package magictcg.magic.permanent;

/**
 * Questa classe astratta rappresenta le funzionalità e le proprietà comuni a 
 * tutte le creature che permangono nel campo di gioco
 */
public class PermanentCreature implements IPermanent{
    boolean tapped;
    int attack, defence, damage;
    
    @Override
    public void deletePermanent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Permette di settare il valore tapped della creatura (True -> tapped, 
     * False -> Untapped)
     * @param tapped Il valore booleano da applicare
     */
    public void setTapped(boolean tapped) {
        this.tapped = tapped;
    }
}

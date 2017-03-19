
package magictcg.phase;

/**
 * classe astratta che implementa tutti i metodi comuni alle possibili 
 * implementazioni della fase combat.
 * 
 */
public abstract class CombatPhase extends AbstractPhase {
    
    /**
     * ritorna il codice univoco di una fase combat
     * @return codice univoco di una fase Combat
     */
    @Override
    public String getPhaseName() {
        return "CombatPhase";
    }
    
}

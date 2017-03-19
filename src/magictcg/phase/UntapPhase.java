
package magictcg.phase;

/**
 * classe astratta che implementa tutti i metodi comuni alle possibili 
 * implementazioni della fase Untap.
 * 
 */
public abstract class UntapPhase extends AbstractPhase {
    
     /**
     * ritorna il codice univoco di una fase Untap
     * @return codice univoco di una fase Untap
     */
    @Override
    public String getPhaseName() {
        return "UntapPhase";
    }
    
}

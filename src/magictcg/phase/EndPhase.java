
package magictcg.phase;


/**
 * classe astratta che implementa tutti i metodi comuni alle possibili 
 * implementazioni della fase End.
 * 
 */
public abstract class EndPhase extends AbstractPhase {
    
     /**
     * ritorna il codice univoco di una fase End
     * @return codice univoco di una fase End
     */
    @Override
    public String getPhaseName() {
      return "EndPhase";
    }
}

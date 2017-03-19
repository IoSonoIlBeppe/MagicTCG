
package magictcg.phase;

/**
 * classe astratta che implementa tutti i metodi comuni alle possibili 
 * implementazioni della fase Draw.
 * 
 */
public abstract class DrawPhase extends AbstractPhase{
    
     /**
     * ritorna il codice univoco di una fase Draw
     * @return codice univoco di una fase Draw
     */
    @Override
    public String getPhaseName() {
        return "DrawPhase";
    }
}

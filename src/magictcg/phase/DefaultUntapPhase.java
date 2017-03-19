
package magictcg.phase;

import magictcg.Game;
import static magictcg.InputOutput.phaseNameOf;
import magictcg.player.Player;

/**
 * classe per l'implemetazione di default della Untap Phase
 * 
 */
public class DefaultUntapPhase extends UntapPhase{
    
    /**
     * Richiama il metodo untap() di Field per mettere untapped tutte le 
     * creature in campo
     */
    @Override
    public void startPhase() {
        Player p = Game.getInstanceGame().getCurrentplayer();
        phaseNameOf(p, this);
        Game.getInstanceGame().getCurrentplayer().getField().untap();
    }
}

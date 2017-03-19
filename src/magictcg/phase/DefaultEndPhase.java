
package magictcg.phase;

import magictcg.Game;
import static magictcg.InputOutput.phaseNameOf;
import magictcg.player.Player;


/**
 * classe per l'implemetazione di default dell' End Phase
 * 
 */
public class DefaultEndPhase extends EndPhase{
    
    /**
     * Verrà cambiato il giocatore corrente per far cominciare il turno al suo
     * avversario
     */
    @Override
    public void startPhase() {
        Player p = Game.getInstanceGame().getCurrentplayer();
        phaseNameOf(p, this);
        Game.getInstanceGame().switchPlayer();
    }    
}

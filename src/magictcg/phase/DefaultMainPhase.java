
package magictcg.phase;

import magictcg.Game;
import static magictcg.InputOutput.phaseNameOf;
import magictcg.player.Player;

/**
 * classe per l'implemetazione di default della Main Phase
 * 
 */
public class DefaultMainPhase extends MainPhase{
    
    /**
     * chiede al giocatore di turno se vuole giocare una magia, dopodichè 
     * inizierà la risposta con istantanee alternata fra i due giocatori 
     * finchè tutti i due giocatori non vorranno o non potranno più rispondere.
     */
    @Override
    public void startPhase() {
        int flag;
        Player p = Game.getInstanceGame().getCurrentplayer();
        phaseNameOf(p, this);
        flag = playDefaultMagic(p);
        p = Game.getInstanceGame().opponent(p);
        playDefaultInstant(p, flag);
        Game.getInstanceGame().getStack().resolveStack();
    }
}

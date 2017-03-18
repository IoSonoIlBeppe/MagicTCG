/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.phase;

import magictcg.Game;
import static magictcg.InputOutput.phaseNameOf;
import magictcg.player.Player;

/**
 *
 * @author Beppe
 */
public class DefaultUntapPhase extends UntapPhase{
    
    /* Richiama il metodo untap() di Field per mettere untapped tutte le creature in campo */
    @Override
    public void startPhase() {
        Player p = Game.getInstanceGame().getCurrentplayer();
        phaseNameOf(p, this);
        Game.getInstanceGame().getCurrentplayer().getField().untap();
    }
}

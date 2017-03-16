/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.phase;

import magictcg.Game;

/**
 *
 * @author Beppe
 */
public class DefaultUntapPhase implements IPhase {
    
    /* Richiama il metodo untap() di Field per mettere untapped tutte le creature in campo */
    @Override
    public void startPhase() {
        Game.getInstanceGame().getCurrentplayer().getField().untap();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.phase;

import magictcg.Game;
import static magictcg.InputOutput.deckSize;
import static magictcg.InputOutput.handSize;
import static magictcg.InputOutput.phaseNameOf;
import magictcg.player.Player;

/**
 *
 * @author Beppe
 */
public class DefaultDrawPhase extends DrawPhase {

    /* Il giocatore pescherà una magia dal mazzo. Se in mano ci saranno più di 7 magie,
    appare ad output una scelta su quale carta scartare */
    @Override
    public void startPhase() {
        Player p = Game.getInstanceGame().getCurrentplayer();
        phaseNameOf(p, this);
        draw();
        handSize(p);
        deckSize(p);
        discard();
    }
}

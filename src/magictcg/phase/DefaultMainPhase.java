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
public class DefaultMainPhase extends MainPhase{

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

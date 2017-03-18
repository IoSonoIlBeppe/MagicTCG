/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.phase;

import magictcg.Game;
import static magictcg.InputOutput.inputDiscard;
import magictcg.player.Player;

/**
 *
 * @author gianmarcocallegher
 */
public abstract class AbstractPhase implements IPhase {
    public void loser(boolean b) {
        Player p = Game.getInstanceGame().getCurrentplayer();
        if (!b)
            p.setLifepoints(0);
    }
    
    public void draw() {
        Player p = Game.getInstanceGame().getCurrentplayer();
        boolean b = p.drawMagic();
        loser(b);
    }
    
    public void discard() {
        int i;
        Player p = Game.getInstanceGame().getCurrentplayer();
        while (p.getHand().getSize() > 7) {
            i = inputDiscard(p);
            p.getHand().discardMagic(i - 1);
        }
    }
}

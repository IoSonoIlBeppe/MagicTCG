/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.phase;

import java.util.Scanner;
import magictcg.Game;
import static magictcg.InputOutput.inputDiscard;
import magictcg.player.Player;

/**
 *
 * @author Beppe
 */
public class DrawPhase implements IPhase{
    
    /* Il giocatore pescherà una magia dal mazzo. Se in mano ci saranno più di 7 magie,
    appare ad output una scelta su quale carta scartare */
    @Override
    public void startPhase() {
        int i;
        Player p = Game.getInstanceGame().getCurrentplayer();
        boolean b = p.drawMagic();
        if (!b)
            Game.getInstanceGame().getCurrentplayer().setLifepoints(0);
        else
            do{
                i = inputDiscard(p);
                p.getHand().discardMagic(i);
            } while (p.getHand().getSize() > 7);
    }
}


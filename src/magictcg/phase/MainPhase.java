/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.phase;

import magictcg.Game;
import static magictcg.InputOutput.inputInstant;
import static magictcg.InputOutput.inputMagic;
import magictcg.player.Player;

/**
 *
 * @author gianmarcocallegher
 */
public abstract class MainPhase extends AbstractPhase {

    @Override
    public String getPhaseName() {
        return "MainPhase";
    }
    
    public int playDefaultMagic(Player p) {
        int i = 0, flag = 0;
        if(!p.getHand().isEmpty()) {
            i = inputMagic(p);
            if (i != 0)
                p.playMagic(i - 1);
            else
                flag++;
        }
        return flag;
    }
    
    public void playDefaultInstant(Player p, int flag) {
        int i;
            while (!(p.getHand().isEmpty()) && flag < 2) {
            if (p.getHand().hasInstants()) {
                i = playInstant(p);
                if (i != 0)
                    flag = 0;
                else
                    flag++;
            }
            else
                flag++;
            p = Game.getInstanceGame().opponent(p);
        }
    }
    
    public int playInstant(Player p) {
        int i = inputInstant(p);
        if (i != 0)
            p.playMagic(i - 1);
        return i;
    }
}

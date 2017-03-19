
package magictcg.phase;

import magictcg.Game;
import static magictcg.InputOutput.inputDiscard;
import magictcg.player.Player;

/**
 * classe che contiene i metodi comuni a tutte le fasi
 * 
 */
public abstract class AbstractPhase implements IPhase {
    
    /**
     * metodo che azzera i life points del  giocatore corrente se non è 
     * riuscito a pescare poichè ha finito le carte nel mazzo.
     * @param b specifica se un giocatore è riuscito a pescare o no. 
     */
    public void loser(boolean b) {
        Player p = Game.getInstanceGame().getCurrentplayer();
        if (!b)
            p.setLifepoints(0);
    }
    
    /**
     * metodo che fa pescare una carta al giocatore corrente
     */
    public void draw() {
        Player p = Game.getInstanceGame().getCurrentplayer();
        boolean b = p.drawMagic();
        loser(b);
    }
    
    /**
     * metodo che fa scartare carte dalla mano al giocatore corrente finchè non 
     * arriva ad averne meno di sette.
     */
    public void discard() {
        int i;
        Player p = Game.getInstanceGame().getCurrentplayer();
        while (p.getHand().getSize() > 7) {
            i = inputDiscard(p);
            p.getHand().discardMagic(i - 1);
        }
    }
}

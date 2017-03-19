
package magictcg.phase;

import magictcg.Game;
import static magictcg.InputOutput.inputInstant;
import static magictcg.InputOutput.inputMagic;
import magictcg.player.Player;

/**
 * classe astratta che implementa tutti i metodi comuni alle possibili 
 * implementazioni della fase Main.
 * 
 */
public abstract class MainPhase extends AbstractPhase {
    
     /**
     * ritorna il codice univoco di una fase Main
     * @return codice univoco di una fase Main
     */
    @Override
    public String getPhaseName() {
        return "MainPhase";
    }
    
    /**
     * metodo che dato un giocatore p gli permetterà di giocare una magia a sua 
     * scelta dalla mano se questa non è vuota. 
     * @param p il giocatore che può giocare una magia.
     * @return 1 se è riuscito a giocare una carta 0 altrimenti.
     */
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
    
     /**
     * metodo che dato un giocatore p iniziale e un flag iniziale inizierà la
     * catena delle risposte con le istantanee.
     * Il metodo inoltre utilizza un flag che rappresenta quante volte 
     * consecutive un giocatore non ha voluto giocare alcuna istantanea, quando
     *  il flag arriva a 2 la catena termina.
     * @param p il giocatore che può giocare un istantanea.
     * @param flag flag iniziale che rappresenta se è stata o no giocata una
     * magia in precedenza.
     */
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
    
      /**
     * metodo che dato un giocatore p gli permetterà di giocare un'istantanea 
     * a sua scelta dalla mano (i controlli sono garantiti dal chiamante).
     * @param p il giocatore che può giocare una istantanea.
     * @return input del giocatore (0 significa che non ha giocato alcuna
     * carta).
     */
    public int playInstant(Player p) {
        int i = inputInstant(p);
        if (i != 0)
            p.playMagic(i - 1);
        return i;
    }
}

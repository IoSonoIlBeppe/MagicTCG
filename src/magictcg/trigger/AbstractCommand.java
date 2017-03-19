package magictcg.trigger;


/**
 * classe che implementa i metodi e le proprietà comuni a tutti gli oggetti 
 * contenuti nella lista di ICommand nella classe Trigger.
 */
public abstract class AbstractCommand implements ICommand {
    int triggercounter, turns;
    
    /**
     * setta il valore della proprità attuale a quello del parametro 
     * triggercounter.
     * @param triggercounter
     */
    public void setTriggercounter(int triggercounter) {
        this.triggercounter = triggercounter;
    }
    
    /**
     * ritorna il numero dei turni che il comando deve aspettare per 
     * attivarsi.
     * @return proprietà triggerconter
     */
    public int getTriggercounter() {
        return triggercounter;
    }
    
    /**
     * ritorna il numero dei turni in cui il comando dovrà riattivarsi.
     * @return proprità turns
     */
    public int getTurns() {
        return turns;
    }

    /**
     * setta il valore della proprità attuale a quello del parametro turns.
     * @param turns 
     */
    public void setTurns(int turns) {
        this.turns = turns;
    }
}

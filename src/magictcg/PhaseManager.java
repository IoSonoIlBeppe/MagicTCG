package magictcg;

import java.util.ArrayList;
import java.util.List;
import magictcg.phase.DefaultDrawPhase;
import magictcg.phase.DefaultEndPhase;
import magictcg.phase.DefaultMainPhase;
import magictcg.phase.DefaultUntapPhase;
import magictcg.phase.IPhase;
import magictcg.trigger.Trigger;


/**
 * Questa classe si occupa della gestione dei turni e delle fasi di gioco,
 * fornendo funzioni che permettono di inserire, modificare l'ordine o eliminare
 * fasi di gioco, saltare o ripetere turni, e si occupa amche della risoluzione
 * dei trigger applicabili durante le fasi di gioco
 */
public class PhaseManager {
    
    List<IPhase> phases;
    Trigger startTrigger, endTrigger;
    
    /**
     * Crea un PhaseManager vuoto di default
     */
    public PhaseManager() {
        phases = new ArrayList<>();
        startTrigger = new Trigger();
        endTrigger = new Trigger();
    }
    
    /**
     * Controlla la lista delle fasi per controllare se un turno è concluso
     * @return True se la lista delle fasi è vuota, False altrimenti
     */
    public boolean isEndOfTurn() {
        return phases.isEmpty();
    }

    /**
     * Restituisce la prossima fase secondo l'ordine della lista delle fasi, e
     * la rimuove dalla lista
     * @return La prossima fase da eseguire
     */
    public IPhase nextPhase() {
        if (!isEndOfTurn()) {
            return phases.remove(0);
        } else {
            return null;
        }
    }
    
    /**
     * Questo metodo si occupa della risoluzione delle fasi di gioco, avviandole
     * una dopo l'altra secondo l'ordine della lista delle fasi. Verranno
     * risolte anche le liste di Trigger startTrigger e endTrigger per ogni fase,
     * essendoci la possibilità che ci siano trigger che si possono attivare
     * all'inizio o alla fine di ciascuna fase
     */
    public void resolvePhases() {
        startTrigger.resolveCommands();
        for (IPhase p : phases)
            p.startPhase();
        endTrigger.resolveCommands();
    }

    /**
     * Questo metodo elimina il contenuto della lista delle fasi e inserisce una
     * sequenza di fasi che rappresenta un turno standard per un giocatore:
     * Draw Phase -> Untap Phase -> Combat Phase -> Main Phase -> End Phase
     */
    public void resetPhases() {
        phases.clear();
        phases.add(new DefaultDrawPhase());
        phases.add(new DefaultUntapPhase());
        //phases.add(new CombatPhase());
        phases.add(new DefaultMainPhase());
        phases.add(new DefaultEndPhase());
    }

    /**
     * Permette di inserire una fase aggiuntiva all'interno della lista delle
     * fasi in una posizione specifica
     * @param index L'indice in cui inserire la nuova fase
     * @param phase La fase da inserire
     */
    public void insertPhase(int index, IPhase phase) {
        phases.add(index, phase);
    }

    /**
     * Permette di ottenere l'indice in cui si trova una determinata fase 
     * al''interno della lista delle fasi
     * @param name Il nome del tipo di fase
     * @return L'indice in cui si trova la fase cercata. Se non è presente,
     * ritorna -1
     */
    public int indexOfPhase(String name) {
        int i = 0;
        while ((name.equals(phases.get(i).getPhaseName())) && i < phases.size())
            i++;
        return (i < phases.size())? i : -1;
    }

    /**
     * Permette di scambiare l'ordie di due fasi all'interno della lista delle 
     * fasi
     * @param phase1 L'indice della prima fase da scambiare 
     * @param phase2 L'indice della seconda fase da scambiare
     */
    public void switchPhases(int phase1, int phase2) {
        IPhase tmp = phases.get(phase1);
        phases.remove(phase1);
        phases.add(phase1, phases.get(phase2));
        phases.remove(phase2);
        phases.add(phase2, tmp);
    }
    
    /**
     * Permette di cambiare il turno e preparare la struttura del turno del
     * prossimo giocatore
     */
    public void switchTurn() {
        Game.getInstanceGame().switchPlayer();
        this.resetPhases();
    }
    
    /**
     * Permette di saltare una determinata fase
     * @param phase L'indice della fase da saltare
     */
    public void skipPhase(int phase) {
        phases.remove(phase);
    }

}

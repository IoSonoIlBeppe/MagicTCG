/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg;

import java.util.ArrayList;
import magictcg.phase.DefaultDrawPhase;
import magictcg.phase.DefaultEndPhase;
import magictcg.phase.DefaultMainPhase;
import magictcg.phase.DefaultUntapPhase;
import magictcg.phase.IPhase;


/**
 *
 * @author Beppe
 */
public class PhaseManager {

    ArrayList<IPhase> phases;

    public PhaseManager() {
        phases = new ArrayList<>();
        this.resetPhases();
    }

    public boolean isEndOfTurn() {
        return phases.isEmpty();
    }

    public IPhase nextPhase() {
        if (!isEndOfTurn()) {
            return phases.remove(0);
        } else {
            return null;
        }
    }

    private void resetPhases() {
        phases.clear();
        phases.add(new DefaultDrawPhase());
        phases.add(new DefaultUntapPhase());
        phases.add(new DefaultMainPhase());
        phases.add(new DefaultEndPhase());
    }

    public void insertPhase(int index, IPhase phase) {
        phases.add(index, phase);
    }

    public int indexOfPhase(IPhase selector) {
        int i = 0;
        while (((phases.get(i)).getClass() != selector.getClass()) && i < phases.size()) {
            i++;
        }
        return (i < phases.size()) ? i : -1;
    }

    public void switchPhases(int phase1, int phase2) {
        IPhase tmp = phases.get(phase1);
        phases.remove(phase1);
        phases.add(phase1, phases.get(phase2));
        phases.remove(phase2);
        phases.add(phase2, tmp);
    }

    public void switchTurn() {
        Game.getInstanceGame().switchPlayer();
        this.resetPhases();
    }
    
    public void skipPhase(int phase) {
        phases.remove(phase);
    }

}

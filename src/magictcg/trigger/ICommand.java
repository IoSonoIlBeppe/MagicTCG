/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.trigger;

/**
 * Intefaccia per tutti i comandi nella lista "commands" nella classe Trigger.
 * 
 */
public interface ICommand {
    void execute();
    int getTriggerCounter ();
    void setTriggerCounter (int triggerCounter);
    int getTurns();
    void setTurns(int turns);
}

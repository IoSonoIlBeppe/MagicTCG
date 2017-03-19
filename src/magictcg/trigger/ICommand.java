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

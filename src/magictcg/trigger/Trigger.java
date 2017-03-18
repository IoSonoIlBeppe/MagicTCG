
package magictcg.trigger;
import java.util.ArrayList;
import java.util.List;

/**
 * classe che contiene e gestisce la lista dei command da eseguire.
 * 
 */
public class Trigger {
    List<ICommand> commands;
    
    /**
     * inizializza le proprità della classe trigger.
     */
    public Trigger () {
        commands = new ArrayList<>();
    }
    
   
    /**
     * metodo principale che esegue tutti i command appartenenti alla lista 
     * commands il cui contatore dei turni da aspettare "triggercounter" è 
     * arrivato a 0, modifica poi opportunamente poi le proprità dei command:
     * - decrementa il numero dei turni da aspettare "triggercount" dei command
     * che sono in attesa.
     * - decrementa il contatore turns per i command che sono stati eseguiti.
     * - se il contatore turns è arrivato a 0 toglie il comando dalla lista.
     */
    public void resolveCommands () {
        for (ICommand c : commands){
            if (c.getTriggerCounter() == 0) {
                c.execute();
                c.setTurns(c.getTurns() - 1);
                if (c.getTurns() == 0)
                    commands.remove(c);
            }
            else
                c.setTriggerCounter(c.getTriggerCounter() - 1);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.trigger;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gianmarcocallegher
 */
public class Trigger {
    List<ICommand> commands;
    
    public Trigger () {
        commands = new ArrayList<>();
    }
    
    public void resolveCommands () {
        for (ICommand c : commands){
            if (c.getTriggerCounter() == 0)
                c.execute();
            else
                c.setTriggerCounter(c.getTriggerCounter() - 1);
        }
    }
}

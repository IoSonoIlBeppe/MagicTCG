/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.phase;

import java.util.ArrayList;
import java.util.List;
import magictcg.trigger.AbstractCommand;
import magictcg.trigger.ICommand;


/**
 *
 * @author gianmarcocallegher
 */
public abstract class AbstractPhase implements IPhase {
    List<ICommand> commands;
    
    public AbstractPhase (){
        this.commands  = new ArrayList<>();
    }
}

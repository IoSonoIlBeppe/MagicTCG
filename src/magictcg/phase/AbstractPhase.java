/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.phase;

import java.util.Stack;
import magictcg.ICommand;


/**
 *
 * @author gianmarcocallegher
 */
public abstract class AbstractPhase implements IPhase {
    Stack<ICommand> commands;
    
    public AbstractPhase (){
        this.commands  = new Stack<>();
    }
    
    void resolveCommand() {
        while (!(commands.isEmpty()))
            commands.pop().execute();
    }
}

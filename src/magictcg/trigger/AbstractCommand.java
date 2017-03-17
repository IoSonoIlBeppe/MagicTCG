/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.trigger;


/**
 *
 * @author gianmarcocallegher
 */
public abstract class AbstractCommand implements ICommand {
    int triggercounter;

    public void setTriggercounter(int triggercounter) {
        this.triggercounter = triggercounter;
    }

    public int getTriggercounter() {
        return triggercounter;
    }   
}

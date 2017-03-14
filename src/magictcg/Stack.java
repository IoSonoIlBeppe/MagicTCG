/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg;

import magictcg.cards.IMagic;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Beppe
 */
public class Stack {
    List<IMagic> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    /* Aggiunge una carta allo Stack */
    public void pushCard(IMagic c) {
        stack.add(c);
    }
    
    /* Viene prelevata una carta dallo stack e ne viene attivato l'effetto, 
    se lo stack non è vuoto */
    public boolean popMagic() {
        if (!stack.isEmpty()) {
            IMagic m = stack.remove(stack.size() - 1);
            m.activeEffect();
            return true;
        }
        return false;
    }
}

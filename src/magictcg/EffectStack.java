/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg;

import magictcg.magic.IMagic;
import java.util.ArrayList;
import java.util.List;


/**
 * The EffectStack class represents a last-in-first-out (LIFO) stack of IMagic 
 * objects, which are the containers of the effects to be activated.
 * 
 * @author Beppe
 */
public class EffectStack {
    List<IMagic> stack;
    
    /**
     * Creates an empty stack of effects
     */
    public EffectStack() {
        this.stack = new ArrayList<>();
    }
    
   /**
    * This method pushes a magic containing the effect on the top of the stack
    * @param m the magic that will be inserted
    */
    public void pushMagic(IMagic m) {
        stack.add(m);
    }
    
    
    /**
     * This method pops a magic from the top of the stack and its effect is 
     * activated
     * @return True if a magic is popped, False if the stack is empty
     */
    public boolean popMagic() {
        if (!stack.isEmpty()) {
            IMagic m = stack.remove(stack.size() - 1);
            m.activeEffect();
            return true;
        }
        return false;
    }
    
    /**
     * This method pushes a magic containing the effect into a specified index 
     * of the stack
     * @param m the magic that will be inserted
     * @param i the index of insertion
     */
    public void pushMagic (IMagic m, int i) {
        stack.add(i, m);
    }
    
    /**
     * This method pops a magic from a specified index of the stack and its 
     * effect is activated
     * @param i The index of the element to pop
     */
    public void popMagic (int i) {
        stack.remove(i);
    }
    
    /**
     * This method activates all the effect of the magic contained into the 
     * stack, popping the one by one
     */
    public void resolveStack() {
        while(!stack.isEmpty())
            popMagic();
    }
}

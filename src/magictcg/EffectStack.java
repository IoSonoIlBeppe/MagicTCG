package magictcg;

import magictcg.magic.IMagic;
import java.util.ArrayList;
import java.util.List;


/**
 * La classe EffectStack rappresenta uno stack (struttura LIFO) di oggetti IMagic, i quali contengono
 * gli effetti che dovranno essere attivati.
 * 
 */
public class EffectStack {
    List<IMagic> stack;
    
    /**
     * Crea uno stack degli effetti vuoto
     */
    public EffectStack() {
        this.stack = new ArrayList<>();
    }
    
   /**
    * Metodo per inserire in cima allo stack la magia contenente l'effetto.
    * @param m la magia che verrà inserita
    */
    public void pushMagic(IMagic m) {
        stack.add(m);
    }
    
    
    /**
     * Metodo per estrarre una magia dalla cima dello stack e attivare il suo effetto
     * @return True se la magia è estratta ed attivata , False se lo stack è vuoto
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
     * Metodo per inserire una magia contentente un effetto in una specifica 
     * posizione dello stack.
     * @param m la magia che verrà inserita
     * @param i la posizione i-esima nello stack
     */
    public void pushMagic (IMagic m, int i) {
        stack.add(i, m);
    }
    
    /**
     * Metodo per estratte una magia contentente un effetto da una posizione 
     * specifica dello stack
     * @param i la posizione i-esima dell'effetto da estrarre
     */
    public void popMagic (int i) {
        stack.remove(i);
    }
    
    /**
     * Metodo per l'estrazione e l'attivazione di tutti gli effetti presenti nello
     * stack. Si ferma solamente quando lo stack si svuota.
     */
    public void resolveStack() {
        while(!stack.isEmpty())
            popMagic();
    }
}

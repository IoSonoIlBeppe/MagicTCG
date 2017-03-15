/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.player;


import java.util.ArrayList;
import java.util.List;
import magictcg.magic.permanent.PermanentCreature;
import magictcg.magic.permanent.IPermanent;

/**
 *
 * @author Beppe
 */
public class Field {
    List<IPermanent> slots = new ArrayList<>();
    
    /* Mettodo per settare a false la proprietà di tutte le creature in campo */
    public void untap () {
        for (IPermanent p : slots)
            if (p instanceof PermanentCreature)
                ((PermanentCreature) p).setTapped(false);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.cards;

/**
 *
 * @author Beppe
 */
public class PermanentCreature implements IPermanent{
    boolean tapped;
    int attack, defence, damage;
    
    @Override
    public void deletePermanent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTapped(boolean tapped) {
        this.tapped = tapped;
    }
}

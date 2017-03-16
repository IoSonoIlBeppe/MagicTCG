/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.magic.instant;

import magictcg.magic.creature.AbstractCreature;

/**
 *
 * @author gianmarcocallegher
 */
public class Omeopathy extends AbstractCreature implements IInstant {
    public Omeopathy() {
        name = "Omeopathy";
        description = "It doesn't nothing";
        type = "Instant";
    }
    
    @Override
    public void activeEffect() {
        
    }
}

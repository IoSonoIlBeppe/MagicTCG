/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.magic.creature;

import magictcg.magic.AbstractMagic;



/**
 *
 * @author fmaganza
 */
public abstract class AbstractCreature extends AbstractMagic {
    int attack, defense, damage;
    
    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getDamage() {
        return damage;
    }
}

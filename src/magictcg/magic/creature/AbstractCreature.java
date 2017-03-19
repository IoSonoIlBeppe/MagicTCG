package magictcg.magic.creature;

import magictcg.magic.AbstractMagic;



/**
 * Questa classe astratta rappresenta le funzionalità e le proprietà comuni a 
 * tutte le creature
 */
public abstract class AbstractCreature extends AbstractMagic implements ICreature{
    int attack, defense, damage;
    
    /**
     * Fornisce il valore di attacco di una creatura
     * @return Il valore d'attacco della creatura
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Fornisce il valore di difesa di una creatura
     * @return Il valore di difesa della creatura
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Restituisce il totale dei danni subiti dalla creatura
     * @return Il totale dei danni subiti dalla creatura
     */
    public int getDamage() {
        return damage;
    }
}

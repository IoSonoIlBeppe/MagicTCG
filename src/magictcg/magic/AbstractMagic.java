/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.magic;

/**
 * Questa classe astratta rappresenta le funzionalità e le proprietà comuni a 
 * tutte le magie
 */
public abstract class AbstractMagic implements IMagic{
    protected String name, description, type;
    
    /**
     * Restituisce il nome della magia
     * @return Il Nome della magia
     */
    public String getName() {
        return name;
    }
    
    /**
     * Restituisce la descrizione delle magia
     * @return La descrizione delle magia
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Restituisce il tipo di magia (creatura, instantanea, ecc.)
     * @return Il tipo di magia
     */
    public String getType() {
        return type;
    }
}

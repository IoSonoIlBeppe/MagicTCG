/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.magic;

/**
 *
 * @author gianmarcocallegher
 */
public abstract class AbstractMagic implements IMagic{
    protected String Name, Description;

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }
}

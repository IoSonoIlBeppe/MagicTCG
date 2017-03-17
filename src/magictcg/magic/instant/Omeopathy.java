/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.magic.instant;

/**
 *
 * @author gianmarcocallegher
 */
public class Omeopathy extends AbstractInstant {
    public Omeopathy() {
        name = "Omeopathy";
        description = "It doesn't nothing";
        type = "Instant";
    }
    
    @Override
    public void activeEffect() {
        System.out.println("Sono omeopathy e non faccio nulla");
    }
}

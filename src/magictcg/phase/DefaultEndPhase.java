/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.phase;

import magictcg.Game;

/**
 *
 * @author Beppe
 */
public class DefaultEndPhase extends AbstractPhase{
    
    /* Verrà cambiato il giocatore corrente per far cominciare il turno al suo avversario */
    @Override
    public void startPhase() {
        Game.getInstanceGame().switchPlayer();
    }

    @Override
    public void resolveCommand() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

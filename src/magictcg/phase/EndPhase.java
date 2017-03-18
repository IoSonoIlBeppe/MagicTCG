/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.phase;

import magictcg.Game;
import static magictcg.InputOutput.deckSize;
import static magictcg.InputOutput.handSize;
import magictcg.player.Player;

/**
 *
 * @author gianmarcocallegher
 */
public abstract class EndPhase extends AbstractPhase {
    
    @Override
    public String getPhaseName() {
      return "EndPhase";
    }
}

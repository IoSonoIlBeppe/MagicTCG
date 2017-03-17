/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg;

import java.util.ArrayList;
import magictcg.player.Deck;
import magictcg.player.Player;

/**
 *
 * @author gianmarcocallegher
 */
public class StartGame {
    private final static int LIFEPOINTS = 20;
    
    public static void main(String[] args) {       
        Game g = Game.getInstanceGame();
        g.setP1(new Player(LIFEPOINTS, new Deck(new ArrayList<>())));
        g.setP2( new Player(LIFEPOINTS, new Deck(new ArrayList<>())));
        g.setStack(new EffectStack());
        g.setCurrentplayer(g.getP1());
        while (g.getP1().getLifepoints()>0 && g.getP2().getLifepoints()>0){
            
        }
        
        
        
    
    }
}

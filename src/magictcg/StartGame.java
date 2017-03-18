/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg;

import magictcg.player.Player;

/**
 *
 * @author gianmarcocallegher
 */
public class StartGame {

    public static void main(String[] args) {
        int lifepoints = 20;
        Game g = Game.getInstanceGame();
        System.out.println("Magic by Group 3");
        g.setP1(new Player(lifepoints, "Player1"));
        System.out.println(g.getP1().getName() + " has " + g.getP1().getLifepoints() + " lifepoints");
        g.setP2(new Player(lifepoints, "Player2"));
        System.out.println(g.getP2().getName() + " has " + g.getP2().getLifepoints() + " lifepoints");
        g.setStack(new EffectStack());
        g.setCurrentplayer(g.getP1());
        g.getP1().setOmeopathyDeck();
        g.getP2().setOmeopathyDeck();
        g.getP1().setFirstHand();
        g.getP2().setFirstHand();
        
        while (g.getP1().getLifepoints() > 0 && g.getP2().getLifepoints() > 0) {
            Player p = g.getCurrentplayer();
            System.out.println("It's " + g.getCurrentplayer().getName() + " turn");
            PhaseManager m = p.getPhaseManager();
            m.resetPhases();
            m.resolvePhases();
        }
        
        if (g.getP1().getLifepoints() == 0)
            System.out.println(g.getP2().getName() + " wins.");
        else
            System.out.println(g.getP1().getName() + " wins.");       
    }
}

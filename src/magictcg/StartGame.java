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

    //private static int LIFEPOINTS = 20;

    public static void main(String[] args) {
        Game g = Game.getInstanceGame();
        System.out.println("creato il game");
        g.setP1(new Player(20, "Player1"));
        System.out.println(g.getP1().getName()+ " "+ g.getP1().getLifepoints());
        g.setP2(new Player(20, "Player2"));
        System.out.println(g.getP2().getName()+ " "+ g.getP2().getLifepoints());
        g.setStack(new EffectStack());
        System.out.println("creato stack");
        g.setCurrentplayer(g.getP1());
        System.out.println("creato curr");
        System.out.println(g.getP1().getName()+ " "+ g.getP1().getLifepoints());
        g.getP1().setOmeopathyDeck();
        g.getP2().setOmeopathyDeck();
        g.getP1().setFirstHand();
        System.out.println("creato h p1");
        System.out.println(g.getP1().getName()+ " "+ g.getP1().getLifepoints());
        g.getP2().setFirstHand();
        System.out.println("creato h p2");
        System.out.println(g.getP1().getLifepoints());
        System.out.println(g.getP2().getLifepoints());
        
        while (g.getP1().getLifepoints() > 0 && g.getP2().getLifepoints() > 0) {
            System.out.println("ciao");
            Player p = g.getCurrentplayer();
            System.out.println("È il turno del giocatore " + g.getCurrentplayer().getName());
            PhaseManager m = p.getPhaseManager();
            m.resetPhases();
            m.resolvePhases();
        }

    }
}

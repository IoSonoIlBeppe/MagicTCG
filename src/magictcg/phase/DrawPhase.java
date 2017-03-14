/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.phase;

import java.util.Scanner;
import magictcg.Game;
import magictcg.player.Player;

/**
 *
 * @author Beppe
 */
public class DrawPhase implements IPhase{
    
    /* Il giocatore pescherà una carta dal mazzo. Se in mano ci saranno più di 7 carte,
    appare ad output una scelta su quale carta scartare */
    @Override
    public void startPhase() {
        Player p = Game.getInstanceGame().getCurrentplayer();
        p.drawCard();
        while (p.getHand().getSize() > 7) {
            System.out.println("Scegli la carta da scartare :");
            p.getHand().showCards();
            Scanner sc = new Scanner(System.in);
            p.getHand().discardCard(sc.nextInt());
        }
    }
}

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
public class MainPhase implements IPhase{

    @Override
    public void startPhase() {
        int a;
        Player p = Game.getInstanceGame().getCurrentplayer();
        System.out.println("Seleziona la carta che vuoi giocare :");
        p.getHand().showCards();
        System.out.println("Se non vuoi giocare nessuna carta premi 0");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a != 0 )
            p.playCard(sc.nextInt());
    }
    
}

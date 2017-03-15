/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg.phase;

import magictcg.Game;
import static magictcg.InputOutput.inputInstant;
import static magictcg.InputOutput.inputMagic;
import magictcg.player.Player;

/**
 *
 * @author Beppe
 */
public class MainPhase implements IPhase{

    @Override
    public void startPhase() {
        int i, flag = 0;
        Player p = Game.getInstanceGame().getCurrentplayer();
        if(!p.getHand().isEmpty()) {
            i = inputMagic(p);
            if (i != 0)
                p.playMagic(inputMagic(p));
            else
                flag++;
        }
        
        p = Game.getInstanceGame().opponent(p);
        
        while (!(p.getHand().isEmpty()) && flag < 2) {
            i = inputInstant(p);
            if (i != 0) {
                flag = 0;
                p.playMagic(i);
            }
            else
                flag++;
            p = Game.getInstanceGame().opponent(p);
        }
        Game.getInstanceGame().getStack().resolveStack();
    }
    
    /*@Override
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
    }*/
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg;

import java.util.Scanner;
import magictcg.magic.instant.IInstant;
import magictcg.phase.IPhase;
import magictcg.player.Player;

/**
 *
 * @author gianmarcocallegher
 */
public final class InputOutput {
    
    private static int input (Player p) {
        int i;
        do {
            p.getHand().showMagics();
            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();
        } while (i > p.getHand().getSize());
        return i;
     }
    
    public static int inputMagic (Player p) {
        int i;
        System.out.println("I'm " + p.getName() + ".  Choose the magic you want to play or press 0 to skip:");
        do{
            i = input(p);
        }while(i < 0);
        
        return i;
    }
    
    public static int inputInstant (Player p) {
        System.out.println("I'm " + p.getName() + ". Choose the instant you want to play or press 0 to skip:");
        int i;
        do{
            do{
                i = input(p);
            }while (i < 0);
        }while(i != 0 && !(p.getHand().getMagic(i - 1) instanceof IInstant));
        
        return i;
    }
    
    public static int inputDiscard (Player p) {
        int i;
        System.out.println("Choose the magic you want to discard: ");
        do{
            i =  input(p);
        }while(i < 1);
        
        return i;
    }
    
    public static void handSize(Player p) {
        System.out.println(p.getName() + " has " + p.getHand().getSize() + " magics on his hand");
    }
    
    public static void deckSize(Player p) {
        System.out.println(p.getName() + " has " + p.getDeck().getSize() + " magics on his deck");
    }
    
    public static void phaseNameOf (Player p, IPhase i) {
        System.out.println(i.getPhaseName() + " of " + p.getName());
    }
}

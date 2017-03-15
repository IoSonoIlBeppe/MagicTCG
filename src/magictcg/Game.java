/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg;

import magictcg.player.Deck;
import magictcg.player.Player;
import java.util.ArrayList;
import static magictcg.InputOutput.inputInstant;
import magictcg.magic.IMagic;
import magictcg.magic.instant.IInstant;

/**
 *
 * @author Beppe
 */
public class Game {
    
    private static Player currentplayer; // indica il giocatore corrente
    private static Game instanceGame;
    private static Player p1, p2;
    private static Stack stack;
    private final static int LIFEPOINTS = 20;
    
    /* Costruttore privato per implementare il pattern Singleton */
    private Game() {}
    
    /* Istanza del Singleton */
    public static Game getInstanceGame () {
        if (instanceGame == null)
            instanceGame = new Game ();
        return instanceGame;
    }
    
    public Player getP1() {
        return p1;
    }

    public Player getP2() {
        return p2;
    }

    public Player getCurrentplayer() {
        return currentplayer;
    }

    public Stack getStack() {
        return stack;
    }
    
    /* Cambia il giocatore che avrà posesso del turno */
    public void switchPlayer() {
        if (currentplayer == p1)
            currentplayer = p2;
        else
            currentplayer = p1;
    }
    
    public Player opponent (Player p) {
        return (p == p1)? p2 : p1;
    }
   
    
    public IMagic selectInstant (Player p) {
        int i;
        do {
            i = inputInstant(p);
        } while (i < 0 || i > p.getHand().getSize() || !(p.getHand().getMagic(i - 1) instanceof IInstant));
        
        return (i != 0)? p.getHand().getMagic(i - 1) : null;
    }
    
    public static void main(String[] args) {
        p1 = new Player(LIFEPOINTS, new Deck(new ArrayList<>()));
        p2 = new Player(LIFEPOINTS, new Deck(new ArrayList<>()));
        stack = new Stack();
        currentplayer = p1;
    }
    
}

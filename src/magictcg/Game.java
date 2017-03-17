/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictcg;


import magictcg.player.Player;


/**
 *
 * @author Beppe
 */
public class Game {
    
    private static Player currentplayer;
    private static Game instanceGame;
    private static Player p1, p2;
    private static EffectStack stack;
    
    /* Costruttore privato per implementare il pattern Singleton */
    /**
     * Private constructor used to implement the singleton pattern
     */
    private Game() {}
    
    /* Istanza del Singleton */
    /**
     * This static method return the instence of the game singleton
     * @return the sgnleton instance
     */
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
    
    /**
     * This method returns the reference to the player which is currently 
     * playing
     * @return The current player
     */
    public Player getCurrentplayer() {
        return currentplayer;
    }
    
    /**
     * This method returns the reference to the stack of effects of the game
     * @return The stack of effects
     */
    public EffectStack getStack() {
        return stack;
    }
    
    /**
     * This method switches the player with its opponent as current player
     */
    public void switchPlayer() {
        if (currentplayer == p1)
            currentplayer = p2;
        else
            currentplayer = p1;
    }
    
    /**
     * This method returns the opponent player of a specified player
     * @param p The to be specified
     * @return The opponent of player p
     */
    public Player opponent (Player p) {
        return (p == p1)? p2 : p1;
    }
}

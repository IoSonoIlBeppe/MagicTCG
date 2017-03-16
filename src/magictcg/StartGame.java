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

        Player currentplayer;
        Game instanceGame;
        Player p1, p2;
        EffectStack stack;

        p1 = new Player(LIFEPOINTS, new Deck(new ArrayList<>()));
        p2 = new Player(LIFEPOINTS, new Deck(new ArrayList<>()));
        stack = new EffectStack();
        currentplayer = p1;
    
    }
}

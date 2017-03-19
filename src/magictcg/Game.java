package magictcg;


import magictcg.player.Player;


/**
 * Tale classe, utilizzata per l'implementazione del pattern Singleton, verrà istanziata
 * un'unica volta, per poi essere usata come contenitore dove mantenere delle risorse
 * necessarie a oggetti differenti.
 * 
 */
public class Game {
    
    private static Player currentplayer;
    private static Game instanceGame;
    private static Player p1, p2;
    private static EffectStack stack;
    
    /**
     * Costruttore privato per implementare il pattern Singleton
     */
    private Game() {}
    
    /*  */
    /**
     * Metodo per forzare un unica istanza del singleton
     * @return l'istanza del singleton
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

    public void setCurrentplayer(Player currentplayer) {
        Game.currentplayer = currentplayer;
    }

    public void setP1(Player p1) {
        Game.p1 = p1;
    }

    public void setP2(Player p2) {
        Game.p2 = p2;
    }

    public void setStack(EffectStack stack) {
        Game.stack = stack;
    }
    
    
    
    /**
     * Metodo che mi indica indica qual'è il giocatore che sta giocando il turno 
     * attuale
     * @return una referenza a uno dei due oggetti Player
     */
    public Player getCurrentplayer() {
        return currentplayer;
    }
    
    /**
     * Metodo per ottenere una referenza allo stack degli effetti del gioco
     * @return lo Stack degli effetti
     */
    public EffectStack getStack() {
        return stack;
    }
    
    /**
     * Metodo per cambiare la referenza di currentplayer dal giocatore attuale 
     * al giocatore avversario
     */
    public void switchPlayer() {
        if (currentplayer == p1)
            currentplayer = p2;
        else
            currentplayer = p1;
    }
    
    /**
     * Metodo che ritorna il Player avversario
     * @param p Il Player dato
     * @return L'avversario del Player p 
     */
    public Player opponent (Player p) {
        return (p == p1)? p2 : p1;
    }
}

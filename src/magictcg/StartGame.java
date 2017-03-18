package magictcg;
import magictcg.player.Player;

/**
 * classe che contiene il main
 * 
 */
public class StartGame {
   
    public static void main(String[] args) {
        int lifepoints = 20;
        Game g = Game.getInstanceGame();    /* inizializza il Singleton*/
        System.out.println("Magic by Group 3");
        g.setP1(new Player(lifepoints, "Player1"));  /* crea i giocatori e li inserisce nel Game*/
        System.out.println(g.getP1().getName() + " has " + g.getP1().getLifepoints() + " lifepoints");
        g.setP2(new Player(lifepoints, "Player2"));
        System.out.println(g.getP2().getName() + " has " + g.getP2().getLifepoints() + " lifepoints");
        g.setStack(new EffectStack()); /* assegna al game uno stack per la risoluzione degli effetti delle magie*/
        g.setCurrentplayer(g.getP1()); /* decide il giocatore che inizierà la partita*/
        g.getP1().setOmeopathyDeck();   /* imposta il mazzo dei giocatori*/
        g.getP2().setOmeopathyDeck();
        g.getP1().setFirstHand();    /* ogni giocatore pesca 5 carte*/
        g.getP2().setFirstHand();
        
        /* ciclo principale che alternerà i turni dei 2 giocatori*/
        while (g.getP1().getLifepoints() > 0 && g.getP2().getLifepoints() > 0) {
            Player p = g.getCurrentplayer();
            System.out.println("It's " + g.getCurrentplayer().getName() + " turn");
            PhaseManager m = p.getPhaseManager();
            m.resetPhases();
            m.resolvePhases();
        }
        
        /* messaggio di output per sapere il vincitore della partita*/
        if (g.getP1().getLifepoints() == 0)
            System.out.println(g.getP2().getName() + " wins.");
        else
            System.out.println(g.getP1().getName() + " wins.");       
    }
}

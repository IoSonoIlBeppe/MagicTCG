package magictcg;

import java.util.Scanner;
import magictcg.magic.instant.IInstant;
import magictcg.phase.IPhase;
import magictcg.player.Player;

/**
 * Classe contenente tutti i vari messaggi di Input/Output
 * 
 */
public final class InputOutput {
    
    /**
     * Metodo per mostrare al giocatore le sue magie nella mano, e chiedergli di 
     * sceglierne una 
     * @param p Il giocatore interrogato
     * @return i L'indice della magia nella posizone i-esima nella mano
     */
    private static int input (Player p) {
        int i=0;
        do {
            p.getHand().showMagics();
            Scanner sc = new Scanner(System.in);
            while(!sc.hasNextInt()){
                System.out.println("Error. Please insert a number ");
                sc.next();
            }
            i = sc.nextInt();
        } while (i > p.getHand().getSize());
        return i;
     }
    
    /**
     * Metodo per chiedere al giocatore che magia vuole giocare dalla sua mano
     * @param p Il giocatore interrogato
     * @return i L'indice della magia nella posizone i-esima nella mano
     */
    public static int inputMagic (Player p) {
        int i;
        System.out.println("I'm " + p.getName() + ".  Choose the magic you want to play or press 0 to skip:");
        do{
            i = input(p);
        }while(i < 0);
        
        return i;
    }
    
    /**
     * Metodo per chiedere al giocatore che magia istantanea vuole giocare dalla sua mano
     * @param p Il giocatore interrogato
     * @return i L'indice della magia istantanea nella posizone i-esima nella mano
     */
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
    
    /**
     * Metodo per chiedere al giocatore che magia vuole scartare dalla sua mano
     * @param p Il giocatore interrogato
     * @return i L'indice della magia nella posizone i-esima nella mano
     */
    public static int inputDiscard (Player p) {
        int i;
        System.out.println("Choose the magic you want to discard: ");
        do{
            i =  input(p);
        }while(i < 1);
        
        return i;
    }
    
    /**
     * Informa il giocatore su quante magie ha in mano
     * @param p Il giocatore da informare
     */
    public static void handSize(Player p) {
        System.out.println(p.getName() + " has " + p.getHand().getSize() + " magics on his hand");
    }
    
    /**
     * Informa il giocatore su quante magie ha nel mazzo
     * @param p Il giocatore da informare
     */
    public static void deckSize(Player p) {
        System.out.println(p.getName() + " has " + p.getDeck().getSize() + " magics on his deck");
    }
    
    /**
     * Metodo per indicare quale fase di quale giocatore è in corso.
     * @param p Il giocatore attuale
     * @param i La fase attuale
     */
    public static void phaseNameOf (Player p, IPhase i) {
        System.out.println(i.getPhaseName() + " of " + p.getName());
    }
}

package magictcg.magic.instant;

/**
 * Questa classe rappresenta la magia Omeopathy
 */
public class Omeopathy extends AbstractInstant {
    
    /**
     * Crea la magia Omeopathy
     */
    public Omeopathy() {
        name = "Omeopathy";
        description = "It doesn't nothing";
        type = "Instant";
    }
    
    /**
     * Attiva l'effetto della magia
     */
    @Override
    public void activeEffect() {
        System.out.println("I'm Omeopathy. I'm useless");
    }
}

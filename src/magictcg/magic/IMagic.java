package magictcg.magic;

/**
 * Quest'interfaccia rappresenta la sturttura di una magia generica, con un 
 * effetto e un nome che la descrive
 */
public interface IMagic {
    /**
     * Permette di attivare l'effetto della magia
     */
    void activeEffect();
    
    /**
     * Restituisce il nome della magia
     * @return Il nome della magia
     */
    String getName();
}

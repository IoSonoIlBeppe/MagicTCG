
package magictcg.phase;

/**
 * interfccia pr tutte le fasi dentro il phase manager.
 */
public interface IPhase {
    void startPhase();
    String getPhaseName();
}

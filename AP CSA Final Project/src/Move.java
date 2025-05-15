/**
 * Represents a move that a player can use in a game.
 * A move consists of a name, damage, and type, which define the characteristics of the move.
 * 
 * @author Emery Li
 * @version 1.0
 */
public class Move {
    
    private String name;  // The name of the move
    private int damage;   // The damage dealt by the move
    private String type;  // The type of the move (e.g., physical, magic)

    /**
     * Constructs a new Move object with the specified name, damage, and type.
     * 
     * @param name The name of the move.
     * @param damage The damage dealt by the move.
     * @param type The type of the move (e.g., physical, magic).
     */
    public Move(String name, int damage, String type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    /**
     * Returns the name of the move.
     * 
     * @return The name of the move.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the damage dealt by the move.
     * 
     * @return The damage of the move.
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Returns the type of the move (e.g., physical, magic).
     * 
     * @return The type of the move.
     */
    public String getType() {
        return type;
    }
}

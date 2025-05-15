/**
 * Represents a player character in a game.
 * This class includes the player's health, attack power, speed, and the moves the player can perform.
 * 
 * @author Emery Li
 * @version 1.0
 */

import java.util.ArrayList;
public class Player {
    
    private int currentHealth = 10;  // Player's health
    private int maxHealth = 10;
    private int attack;  // Player's attack power
    private int speed;  // Player's speed
    private String name;  // Player's name
    static ArrayList<Move> moveset = new ArrayList<Move>();  // List of moves the player can perform

    /**
     * Constructs a new Player object with the specified name.
     * The player is initialized with 10 health, attack, and speed.
     * 
     * @param name The name of the player.
     */
    public Player(String name) {
        this.currentHealth = 20;
        this.maxHealth = currentHealth;
        this.name = name;
        this.attack = 10;
        this.speed = 10;
    }

    /**
     * Adds a move to the player's move set.
     * 
     * @param name The name of the move.
     * @param damage The damage dealt by the move.
     * @param type The type of the move (e.g., physical, magic).
     * @throws IllegalArgumentException If the damage is negative.
     */
    public static void addMove(String name, int damage, String type) {
        if (damage < 0) {
            throw new IllegalArgumentException("Damage cannot be negative");
        } 
        if (damage > 20) {
            throw new IllegalArgumentException("Too much damage. Try Again");
        } 
        Move move = new Move(name, damage, type);
        moveset.add(move);
    }

    /**
     * Returns the name of the player.
     * 
     * @return The name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the health of the player.
     * 
     * @return The health of the player.
     */
    public int getHealth() {
        return currentHealth;
    }

    /**
     * Returns the attack value of the player.
     * 
     * @return The attack value of the player.
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Returns the speed of the player.
     * 
     * @return The speed of the player.
     */
    public int getSpeed() {
        return speed;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void resetHealth() {
        currentHealth = maxHealth;
    }

    /**
     * Reduces the player's health when they take damage.
     * The player's health cannot drop below 0.
     * 
     * @param damage The amount of damage dealt to the player.
     * @throws IllegalArgumentException If the damage is negative.
     */
    public void takeDamage(int damage) {
        if (damage < 0) {
            throw new IllegalArgumentException("Damage cannot be negative");
        }
        this.currentHealth -= damage;
        if (this.currentHealth < 0) {
            this.currentHealth = 0;
        }
    }
}

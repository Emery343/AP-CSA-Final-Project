/**
 * Represents an animal with attributes such as health, attack, speed, and name.
 * The Animal class serves as a base class for different types of animals in the game, 
 * allowing them to have common attributes and behaviors such as taking damage.
 * 
 * @author Emery Li
 * @version 1.0
 */
public class Animal {
    
    private int health;   // The health of the animal
    private int attack;   // The attack power of the animal
    private int speed;    // The speed of the animal
    private String name;  // The name of the animal

    /**
     * Constructs a new Animal object with the specified attributes.
     * 
     * @param name The name of the animal.
     * @param health The health of the animal.
     * @param attack The attack power of the animal.
     * @param speed The speed of the animal.
     */
    public Animal(String name, int health, int attack, int speed) {
        this.health = health;
        this.name = name;
        this.attack = attack;
        this.speed = speed;
    }

    /**
     * Returns the name of the animal.
     * 
     * @return The name of the animal.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the health of the animal.
     * 
     * @return The health of the animal.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Returns the attack power of the animal.
     * 
     * @return The attack power of the animal.
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Returns the speed of the animal.
     * 
     * @return The speed of the animal.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Reduces the health of the animal by the specified damage amount.
     * The health cannot drop below 0.
     * 
     * @param damage The amount of damage to subtract from the animal's health.
     */
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0; // Prevent negative health
        }
    }
}

/**
 * Represents a Fish, which is a type of Animal.
 * This class extends the Animal class and includes the additional attribute of oxygen level.
 * 
 * @author Emery Li
 * @version 1.0
 */
public class Fish extends Animal {
    
    private int oxygenLevel;  // The oxygen level of the fish

    /**
     * Constructs a new Fish object with the specified attributes.
     * 
     * @param name The name of the fish.
     * @param health The health of the fish.
     * @param attack The attack power of the fish.
     * @param speed The speed of the fish.
     * @param oxygenLevel The oxygen level of the fish.
     */
    public Fish(String name, int health, int attack, int speed, int oxygenLevel) {
        super(name, health, attack, speed);  // Call to the superclass constructor (Animal)
        this.oxygenLevel = oxygenLevel;  // Set the oxygen level for the fish
    }

    /**
     * Returns the oxygen level of the fish.
     * 
     * @return The oxygen level of the fish.
     */
    public int getOxygenLevel() {
        return oxygenLevel;
    }
}

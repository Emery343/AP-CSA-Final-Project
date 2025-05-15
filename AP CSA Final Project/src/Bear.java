/**
 * Represents a Bear, which is a type of Animal.
 * This class extends the Animal class and includes the additional attribute of fur thickness.
 * 
 * @author Emery Li
 * @version 1.0
 */
public class Bear extends Animal {
    
    private int furThickness;  // The thickness of the bear's fur

    /**
     * Constructs a new Bear object with the specified attributes.
     * This constructor initializes the name, health, attack, speed, and fur thickness of the bear.
     * 
     * @param name The name of the bear.
     * @param health The health of the bear.
     * @param attack The attack power of the bear.
     * @param speed The speed of the bear.
     * @param furThickness The thickness of the bear's fur.
     */
    public Bear(String name, int health, int attack, int speed, int furThickness) {
        super(name, health, attack, speed);  // Call to the superclass constructor (Animal)
        this.furThickness = furThickness;  // Set the fur thickness for the bear
        health += furThickness/3;
    }

    /**
     * Returns the thickness of the bear's fur.
     * 
     * @return The thickness of the bear's fur.
     */
    public int getFurThickness() {
        return furThickness;
    }
}

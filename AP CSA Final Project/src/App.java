import java.util.Scanner;

/**
 * The main class that handles the game flow where the player can battle animals (like Bear or Fish),
 * check stats, and use different moves.
 * 
 * The game includes a simple menu and a battle loop where the player can select an action, fight different animals,
 * and interact with the game world.
 * 
 * @author Emery Li
 * @version 1.0
 */
public class App {
    /**
     * The main method to start the game, which allows the player to choose actions such as battling animals,
     * checking stats, or quitting the game.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Create player
        System.out.println("What's your name?");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        
        // Add moves to the player's moveset
        Player.addMove("Bite", 5, "Physical");
        Player.addMove("Swim", 2, "Speed");
        Player.addMove("Roar", 10, "Psychic");

        // Print player's moves
        System.out.println("Moveset for " + player.getName() + ": ");
        for (Move move : Player.moveset) {
            System.out.println(move.getName() + " - Damage: " + move.getDamage() + ", Type: " + move.getType());
        }

        // Game loop
        boolean gameOn = true;
        while (gameOn) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Fight a Bear");
            System.out.println("2. Fight a Fish");
            System.out.println("3. Check Player Stats");
            System.out.println("4. Quit");

            int choice = input.nextInt();
            input.nextLine(); // Consume the newline

            // Enhanced cases
            switch (choice) {
                case 1: // Fight Bear
                    startBattle(player, new Bear("Grizzly", 50, 15, 5, 10), input);
                    break;

                case 2: // Fight Fish
                    startBattle(player, new Fish("Salmon", 15, 3, 8, 50), input);
                    break;

                case 3: // Player stats
                    System.out.println(player.getName() + " Stats: ");
                    System.out.println("Health: " + player.getHealth());
                    System.out.println("Attack: " + player.getAttack());
                    System.out.println("Speed: " + player.getSpeed());
                    break;

                case 4: // Quit
                    System.out.println("Thanks for playing!");
                    gameOn = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        
        input.close();
    }

    /**
     * Initiates and manages the battle between the player and a wild animal (either a Bear or a Fish).
     * The player can choose a move, and the animal will counterattack. The battle continues until either the player
     * or the animal is defeated, or the player flees.
     * 
     * @param player The player object that is engaging in the battle.
     * @param animal The animal object that the player is battling.
     * @param input The scanner object used to capture user input.
     */
    public static void startBattle(Player player, Animal animal, Scanner input) {
        System.out.println("\nA wild " + animal.getName() + " has appeared!");

        // Battle loop
        while (player.getHealth() > 0 && animal.getHealth() > 0) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Choose a Move");
            System.out.println("2. Flee");
            
            int choice = input.nextInt();
            input.nextLine(); // Get to new line

            if (choice == 1) {
                // Choose a move
                System.out.println("Choose a move:");
                for (int i = 0; i < Player.moveset.size(); i++) {
                    System.out.println((i + 1) + ". " + Player.moveset.get(i).getName());
                }
                int moveChoice = input.nextInt() - 1;
                Move move = Player.moveset.get(moveChoice);

                System.out.println(player.getName() + " used " + move.getName() + "!");
                animal.takeDamage(move.getDamage());

                // Animal turn to attack
                System.out.println(animal.getName() + " attacks!");
                player.takeDamage(animal.getAttack());

                // Print player stats after turn
                System.out.println(player.getName() + " Health: " + player.getHealth());
                System.out.println(animal.getName() + " Health: " + animal.getHealth());
            } else if (choice == 2) {
                System.out.println(player.getName() + " fled from the battle!");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        // Who wins the battle?
        if (player.getHealth() <= 0) {
            System.out.println(player.getName() + " has been defeated by " + animal.getName() + "!");
            System.out.println("Respawning...");
            player.resetHealth();
        } else if (animal.getHealth() <= 0) {
            System.out.println(player.getName() + " has defeated the " + animal.getName() + "!");
            System.out.println("Restoring health...");
            player.resetHealth();
        }
    }
}

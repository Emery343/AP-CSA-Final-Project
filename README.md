
Build-a-World: Animal Battle Game
Project Description

Animal Battle Game is a simple battle simulator where a player can engage in turn-based combat against various animals. For instance, the game allows players to pick from their moveset and fight against animals like a bear or fish. Each animal has unique stats, and the player can use moves such as bite, swim, and roar to attack or defend. You can expect to name your player and fight against different animals. You’re also able to track your current stats during the battle. The game is unique because each animal has different attributes and is simple to understand. 



Features
Customizable Player: Create a player character with a customizable name and default stats (health, attack, and speed).
Dynamic Moveset: Add moves with different damage types and values.
Battle System: Fight against animals such as Bear or Fish, each with unique stats.
Turn-based Combat: Player and enemy take turns attacking each other until one is defeated.
Player Stats: View the player's health, attack, and speed.
Animal Types: Support for multiple animal types, with inheritance allowing for extension to new species.



How the Code Works

Key Classes and Structure:
Player: Represents the user’s character. The player has attributes like health, attack, speed, and a moveset, which they use during battles.
Move: Represents a move the player can use in battle. Each move has a name, damage, and type (physical, speed, psychic).
Animal: The base class for all animals. Contains attributes for health, attack, speed, and name. Animals can take damage.
Bear: A subclass of Animal, representing a bear with specific attributes like health and attack.
Fish: Another subclass of Animal, representing a fish with its own stats.
App: The main application class that drives the game. The player can interact with it to battle animals, check stats, and more.


Interaction Between Classes:
Inheritance: The Bear and Fish classes extend Animal, meaning they inherit its attributes and methods. This reduces code duplication and allows for easy addition of more animals in the future.
Data Storage: The player's moveset is stored in an ArrayList<Move>. This allows for manipulation of the player's available moves.
Combat: In battles, the player can choose moves from their moveset to deal damage to animals. The animals also attack back based on their stats.

Writing Class Diagram: https://app.diagrams.net/?src=about#G1EPin6sUWjUCI_xSKwij3NgRqW8Z8wUcT#%7B%22pageId%22%3A%22C5RBs43oDa-KdzZeNtuy%22%7D 

How to Run the Program
1. Clone the Repository: Download or clone this repository to your local machine.
2. Compile the Code: Open a terminal or command prompt, navigate to the project directory, and compile the code:
 javac *.java
3. Run the Game: Once compiled, run the game by executing the App class:
java App

Gameplay:
Enter your player's name when prompted.
Choose to fight a Bear or a Fish.
Select a move from your moveset to attack.
Track your health and the animal's health as the battle progresses.
You can flee the battle at any time or continue to fight until one of you is defeated.



Development Process
Sprint Goals: The goal was to implement a simple battle system using object-oriented principles and fulfill all the criteria. I focused on creating a flexible structure where new animals and moves could be easily added in the future to expand the project to a bigger size in the future if I wanted to. 
Challenges Overcome: One challenge was I originally wanted to make it a maze where you fought other animals. However, making the maze was a challenge in and of itself and I tried to utilize other people's code except it didn’t work as expected. 
Future Improvements: I plan to add more animal types, implement an item system, and introduce more complex combat mechanics (e.g., special moves, buffs, or debuffs).



Author Info
Name: Emery Li
Project Description: This project was built to demonstrate object-oriented programming concepts, including inheritance and polymorphism. I applied these concepts to create a small but fun interactive game.


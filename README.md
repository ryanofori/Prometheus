# Prometheus

## Contributors
Please make all contributions to the **Prototype** branch

## Intro
This text-based game programmed in Java assumes a character to experience 3 kinds of activities

* **Story** is the activity where the player is first displayed with an interactive story introduction, followed by one or more battles. The battles outcomes depend on the strength (health) of the character, his/her ammunition (weapon + armor) and a number of randomized factors. Same is applicable to enemies. Completing the story as a winner is associated with monetary reward. Loosing in at most one battle is the **game over** condition. (Suggestion: The story mode could be based on the story of Prometheus if anyone likes the idea).


* **Tournament** is where the character can **gamble** to *boost* or *loose* previously gained money. The tournament has a number of **levels of hardness** where opponents of matching skill levels will gamble with the character. The outcome of every round is randomized. The character can leave the tournament at any time, but will not be able to return to the same level there after, s/he will have to start from the very beginning. From this perspective the biggest difference in levels is the associated reward. The lower the level, the smaller reward (or loss). The character will not be allowed to gamble on the particular level shoud s/he not have enough money to match the possible reward / loss. The tournament style will be a 16 person single elimaination. (The stats (health weapon + armor, ) that the character achevied in game will be automatically transfered to the tournament.) The other players in the tournament will have stats weighted based on their placement in the tournament. As the other players progress in the tournament their stats will increase.

* **Shopping** is where the character can spend previously gained money (in story or tournament activity) and purchase better items for battles. Better items such as weapons, armor, and skills increases the chance of winning.


## Problem Formulation
All 3 activities should be implemented as standalone Java modules that can be instantiated into the game. The player should be given an interface (likely menu driven) to enter/leave particular game activities. The character him/herself should be modeled as an object with certain ammunition, money, health, and other attributes. Starting up particular activity should be implemented as a call to method `go()` of the character class that would take an instance of the activity object. The variety of activities should be implemented as derived classes from a set of 3 base classes (one per each kind of activity).

## Solution Components
There must be 5 packages to contain classes for:
1. Game
1. Character
1. Story activity
1. Tournament activity
1. Shopping activity

Additional packages included for functionality of the game:
* Enemy
* Battle System

##Characters
There should be additional characters alongside the Warrior and Orc for users to choose from. These are Wizard, Dwarf, Elf. Each character including the choosable and the enemies will have their own set of unique attributes set on a scale from 0 to 200. (The base attributes will be 0-100, but the scale to 200 allows for upgrades.) 
 /* Base	Character Attributes:		Warrior		Orc		Wizard		Dwarf		Elf
		damage =                       50		60		60			40			60
		magic =                        20		30		100			30			60
		defense =                      50		80		10			50			40							
		boost =                        50		50		50			50			50
		weapon_damage =                60		80		40			60			60
		armor =                        50		70		20			50			70
		intelligence =                 50		10		100			30			80
		speed =                        70		20		50			50			80			
		strength =                     60		90		40			60			60*/
		
A new class should be created for each character, and will derive from the character class. 

Damage level will be affected by the character intelligence, speed, and magic. 


##Tournament Activity
The Tournament mode should be arcade style. Once you enter a tournament, the character is unable to leave the tournament until either they have defeated each opponent or they have run out of money and are unable to purchase a revive. You are unable to start a tournament unless you have the set wager amount.  


## Battle System
The battle system is the main action of the game, both in story mode and tournament mode. The following are different aspects of the battle system to be included:
* **Entering a battle -** When a player enters a battle, they will be given information about their enemies and the abilities, weapons, and items they have available, or be given an option to view the latter.
* **Types of Enemies -** The types of enemies the player will have to face should be described well such that the player can make decisions based on their knowledge of the enemy type. Each enemy will have different advantages that will make them a challenge for the player.
* **Health -** The health of the player and their enemies determines how much longer they can fight.
* **Weapons and Abilities -** The player will have different abilities and weapons available for them to use in the battle (either found through the story, obtained through leveling up, or bought in the store), and information about each of them should be available to the player. Stronger weapons may have limited use in battle, while at least one attack (such as a punch) will be weak, but have unlimited uses. The player must choose wisely when deciding on how to attack.
* **Items -** The player can obtain different items that have a one-time use during battles. These items can do things such as heal the player, boost the player's stats, or cause different effects during battle.


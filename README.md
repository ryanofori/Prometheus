# Prometheus

## Intro
This text-based game programmed in Java assumes a character to experience 3 kinds of activities

* **Story** is the activity where the player is first displayed with an interactive story introduction, followed by one or more battles. The battles outcomes depend on the strength (health) of the character, his/her ammunition (weapon + armor) and a number of randomized factors. Same is applicable to enemies. Completing the story as a winner is associated with monetary reward. Loosing in at most one battle is the **game over** condition.


* **Tournament** is where the character can **gamble** to *boost* or *loose* previously gained money. The tournament has a number of **levels of hardness** where opponents of matching skill levels will gamble with the character. The outcome of every round is randomized. The character can leave the tournament at any time, but will not be able to return to the same level there after, s/he will have to start from the very beginning. From this perspective the biggest difference in levels is the associated reward. The lower the level, the smaller reward (or loss). The character will not be allowed to gamble on the particular level shoud s/he not have enough money to match the possible reward / loss. 

* **Shopping** is where the character can spend previously gained money (in story or tournament activity) and purchase ammunition for story battles. Better ammunition increases the chance of the winning, so the positive outcome of the story activity. 

## Problem Formulation
All 3 activities should be implemented as standalone Java modules that can be instantiated into the game. The player should be given an interface (likely menu driven) to enter/leave particular game activities. The character him/herself should be modeled as an object with certain ammunition, money, health, and other attributes. Starting up particular activity should be implemented as a call to method `go()` of the character class that would take an instance of the activity object. The variety of activities should be implemented as derived classes from a set of 3 base classes (one per each kind of activity).

## Solution Components
There must be 5 packages to contain classes for:
1. Game
1. Character
1. Story activity
1. Tournament activity
1. Shopping activity

## Battle System
The battle system is the main action of the game. The following are different aspects of the battle system:
* **Entering a battle -** When a player enters a battle, they will be given information about their enemies and the abilities, weapons, and items they have available, or be given an option to view the latter.
* **Types of Enemies -** The types of enemies the player will have to face should be described well such that the player can make decisions based on their knowledge of the enemy type. Each enemy will have different advantages that will make them a challenge for the player.
* **Health -** The health of the player and their enemies determines how much longer they can fight.
* **Weapons and Abilities -** The player will have different abilities and weapons available for them to use in the battle (either found through the story, obtained through leveling up, or bought in the store), and information about each of them should be available to the player. Stronger weapons may have limited use in battle, while at least one attack (such as a punch) will be weak, but have unlimited uses. The player must choose wisely when deciding on how to attack.
* **Items -** The player can obtain different items that have a one-time use during battles. These items can do things such as heal the player, boost the player's stats, or cause different effects during battle.

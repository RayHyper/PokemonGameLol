package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        boolean gameRunning = true;
        String name, randomName;
        int numLetters, choice, playerChoice = 0, monsterHealth, monsterAttack, killed = 0, playAgain;
        String [] pokemon = {"Pikachu","Venusaur","Mewtwo","Bulbasaur"};



        String [] enemies = {"Dragon","Fox","Wizard","Mouse","Lion", "Dinosaur", "Skolas", "Boros",
        "Enderman", "Naruto", "Luffy", "Goku", "Ryuk", "Tanjiro"};


        int playerHealth = 150;
        int playerAttack = 70;

        System.out.println(Arrays.toString(pokemon));

        System.out.println("What is your name?");
        name = input.nextLine();

        System.out.println("Hello " + name);

        System.out.println("Choose a pokemon!: ");
        System.out.println("1. Pikachu 2. Venusaur 3. Mewtwo 4.Bulbasaur");
        choice = input.nextInt();

        System.out.println("You picked " + pokemon[choice-1]);
        while(gameRunning == true)
        {
            randomName = enemies[random.nextInt(enemies.length) + 0];
            System.out.println("------------------");
            System.out.println("A " + randomName + " appeared!");

            monsterHealth = random.nextInt(201) + 10;
            monsterAttack = random.nextInt(250) + 10;


                System.out.println("Health: " + monsterHealth);
                System.out.println("Attack: " + monsterAttack);
                System.out.println("------------------");

                System.out.println("What do you do? \nYour Health: " + playerHealth + " Attack: " + playerAttack);
                System.out.println("[1] Attack");
                System.out.println("[2] Run");
                playerChoice = input.nextInt();

                if (playerChoice == 1 ) {
                    while(playerChoice ==1) {
                        if(monsterHealth > 0 && playerHealth > 0) {
                                System.out.println("> You do " + playerAttack + " damage.");
                                monsterHealth = monsterHealth - playerAttack;
                                if(monsterHealth > 0) {
                                    System.out.println(randomName + " does " + monsterAttack + " damage.");
                                    playerHealth = playerHealth - monsterAttack;
                                }
                                if(monsterHealth > 0 && playerHealth > 0) {

                                    System.out.println("------------------");
                                    System.out.println(randomName + " Health: " + monsterHealth);
                                    System.out.println(randomName + " Attack: " + monsterAttack);
                                    System.out.println("------------------");
                                    System.out.println("What do you do? \nYour Health: " + playerHealth + " Attack: " + playerAttack);
                                    System.out.println("[1] Attack");
                                    System.out.println("[2] Run");
                                    playerChoice = input.nextInt();
                                }
                        }
                        else{
                            killed += 1;
                            playerChoice = 3;
                            gameRunning = false;
                        }
                    }
                }
            else if(playerChoice == 2)
            {
                System.out.println("You go to the next dungeon\n");
            }
        }
        if(playerHealth > 0)
        {
            System.out.println("You killed " + killed + " monster!");
            System.out.println("You Win");
            System.out.println("Gain 10xp");
        }
        else if(playerHealth < 0)
        {
            System.out.println("You Lose");
        }













    }
}

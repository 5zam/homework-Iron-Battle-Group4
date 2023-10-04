import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import javax.swing.*;

public class Main {

    //private static List<Character> characterList = new ArrayList<>();

    private static List<Character> characterList = new ArrayList<>();
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the CVS:");
        String filename = scanner.nextLine();
        importCharactersFromCSV("characters.csv");
        //if (!filename.equalsIgnoreCase("skip")) {
        //importCharactersFromCSV("characters.csv");}


        if (true) {
            // Display menu options
            System.out.println("\n1. Create Warrior");
            System.out.println("2. Create Wizard");
            System.out.println("3. Start Battle");
            System.out.println("4. Import Characters from CSV");
            System.out.println("4. Simulate Battle with Random Characters ");
            System.out.println("0. Exit");

            // Get user choice
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {

                case 1:
                case 2:
                case 3:
                    createWarrior();
                    createWizard();
                    startBattle();
                    break;
                case 4:
                    importCharactersFromCSV(filename);
                    break;
                case 5:
                    simulateRandomBattle();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
    }


    private static void simulateRandomBattle () {
        int warriorStamina = generateRandomNumber(10, 50);
        int warriorStrength = generateRandomNumber(1, 10);
        Warrior warrior = new Warrior("RandomWarrior",
                generateRandomNumber(100, 200), warriorStamina, warriorStrength);

        // Generate random attributes for the wizard
        int wizardMana = generateRandomNumber(10, 50);
        int wizardIntelligence = generateRandomNumber(1, 50);
        Wizard wizard = new Wizard("RandomWizard", generateRandomNumber(50, 100), wizardMana, wizardIntelligence);

        // Battle simulation
        while (warrior.isAlive() && wizard.isAlive()) {
            warrior.attack(wizard);
            wizard.attack(warrior);

            System.out.println("Warrior HP: " + warrior.getHp() + " | Wizard HP: " + wizard.getHp());
        }

        // Display the winner
        if (warrior.isAlive()) {
            System.out.println("Warrior wins!");
        } else if (wizard.isAlive()) {
            System.out.println("Wizard wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    private static int generateRandomNumber ( int i, int i1){
        Random random = new Random();
        return random.nextInt(i1 - i + 1) + i;
    }

    private static void startBattle () {
        // Create a warrior
        Warrior warrior = createWarrior();

        // Create a wizard
        Wizard wizard = createWizard();

        // Battle simulation
        while (warrior.isAlive() && wizard.isAlive()) {
            warrior.attack(wizard);
            wizard.attack(warrior);

            System.out.println("Warrior HP: " + warrior.getHp()
                    + " | Wizard HP: " + wizard.getHp());
        }

        if (warrior.isAlive()) {
            System.out.println("Warrior wins!");
        } else if (wizard.isAlive()) {
            System.out.println("Wizard wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    private static Wizard createWizard () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the wizard: ");
        String name = scanner.nextLine();

        System.out.println("Enter the health points (HP) of the wizard (between 50 and 100): ");
        int hp = getUserInputInRange(50, 100);

        System.out.println("Enter the mana of the wizard (between 10 and 50): ");
        int mana = getUserInputInRange(10, 50);

        System.out.println("Enter the intelligence of the wizard (between 1 and 50): ");
        int intelligence = getUserInputInRange(1, 50);

        return new Wizard(name, hp, mana, intelligence);
    }

    private static Warrior createWarrior () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the warrior: ");
        String name = scanner.nextLine();

        System.out.println("Enter the health points (HP) of the warrior (between 100 and 200): ");
        int hp = getUserInputInRange(100, 200);

        System.out.println("Enter the stamina of the warrior (between 10 and 50): ");
        int stamina = getUserInputInRange(10, 50);

        System.out.println("Enter the strength of the warrior (between 1 and 10): ");
        int strength = getUserInputInRange(1, 10);

        return new Warrior(name, hp, stamina, strength);
    }

    private static int getUserInputInRange ( int min, int max){
        Scanner scanner = new Scanner(System.in);
        int userInput;

        while (true) {
            try {
                userInput = Integer.parseInt(scanner.nextLine());
                if (userInput >= min && userInput <= max) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number within the specified range.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return userInput;
    }

    private static void importCharactersFromCSV(String s) {
        try {
            Scanner scanner = new Scanner(new File(s));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");

                if (fields.length >= 5) {
                    String type = fields[0];
                    String name = fields[1];
                    int hp = Integer.parseInt(fields[2]);
                    int attribute1 = Integer.parseInt(fields[3]);
                    int attribute2 = Integer.parseInt(fields[4]);

                    if (type.equals("Warrior")) {
                        Warrior warrior = new Warrior(name, hp, attribute1, attribute2);
                        // Do something with the warrior instance
                    } else if (type.equals("Wizard")) {
                        Wizard wizard = new Wizard(name, hp, attribute1, attribute2);
                        // Do something with the wizard instance
                    }
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
>>>>>>> 4296c04bc3a8be597dc4df6a98353f7d6e1ce7b6

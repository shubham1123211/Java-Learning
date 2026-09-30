package MiniProjects.GameManagement;

import java.util.Scanner;

public class playGame {
    static void main(String[] args) {
        Character character1 = new Character("Warrior", 100, 25);
        character1.viewCharacter();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter enemy Current Health : ");
        int enemyHealth = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter enemy attack Power:  ");
        int enemyAttackPower = sc.nextInt();
        sc.nextLine();

        while(true) {

            //first attack by character
            enemyHealth = character1.attack(enemyHealth);
            if(enemyHealth == 0) {
                System.out.println("Wins the match");
                break;
            }

            //second attack by enemy
            if(character1.attackedByEnemy(enemyAttackPower) == 0) {
                System.out.println("Lost the match");
                break;
            }

            character1.viewCharacter();
            character1.heal();
            character1.increaseLevel();
        }
    }
}

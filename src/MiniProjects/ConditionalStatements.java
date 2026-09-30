package MiniProjects;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Deposit Amount : ");
        int totalBalance = sc.nextInt();

        sc.nextLine();

        if(totalBalance < 0){
            System.out.println("Negative Balance input");
            return;
        }

        System.out.print("SET PIN : ");
        String password = sc.nextLine();

        int noOfTry = 0;

        while(noOfTry < 3){
            System.out.print("Enter PIN : ");
            String pin = sc.nextLine();

            //pin matches
            if(pin.equals(password)){
                System.out.println("Enter one of the Option :\n" +
                        "1. Check Balance \n" +
                        "2. Withdraw \n" +
                        "3. Exit");


                while(true){
                    System.out.print("Enter option : ");
                    int option = sc.nextInt();
                    sc.nextLine();

                    if(option < 1 || option > 3){
                        System.out.println("Invalid Option");
                        continue;
                    }
                    if(option == 1){
                        System.out.println("Option selected to check balance");
                        System.out.println("Total Balance : " + totalBalance);

                    }else if(option == 2){
                        System.out.println("Withdrawal option selected");
                        System.out.print("Enter amount to withdraw : ");
                        int withdraw = sc.nextInt();
                        sc.nextLine();

                        if(withdraw > 0 && withdraw <= totalBalance){
                            totalBalance -= withdraw;
                            System.out.println("You successfully Withdraw " + withdraw + " Remaining balance : " + totalBalance);
                        }else{
                            System.out.println("Withdraw amount invalid");
                        }

                    }else if(option == 3){
                        System.out.println("Exiting.........");
                        System.out.println("Thank you for visiting!");
                        break;
                    }
                }
                break;
            // pin does not match - try again
            }else{
                System.out.println("Wrong pin, Enter correct PIN");
                noOfTry++;
                if(noOfTry == 3){
                    System.out.println("You exceeds the number of try, Try again after 24 hours");
                    System.out.println("ACCOUNT LOCKED");
                }
            }
        }
    }
}
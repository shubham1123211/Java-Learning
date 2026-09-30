package MiniProjects;

import java.util.Scanner;

public class hotelManagementsUsingMethods {
    public static void main(String[] args) {
        int[] roomNumbers = {101, 102, 103};
        Boolean[] isRoomBooked = {false, false, false};
        Integer[] billCalculation = {0, 0 , 0};
        int[] price = {1000, 1500, 2000};


        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Choose an Option below :");
            System.out.println("1. View Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Calculate Bill");
            System.out.println("4. Exit");

            int choice = input.nextInt();
            input.nextLine();

            if(choice == 1){
                viewRooms(roomNumbers, isRoomBooked);
            }else if(choice == 2){
                System.out.print("Enter the Room Number : ");
                int roomNum = input.nextInt();
                input.nextLine();

                System.out.print("Enter the number of days : ");
                int days = input.nextInt();
                input.nextLine();

                if(days <= 0) {
                    System.out.println("Invalid number of days");
                    continue;
                }
                bookRoom(roomNum, days, roomNumbers, isRoomBooked, billCalculation, price);
            }else if(choice == 3){
                System.out.print("Enter room number to check bill : ");
                int rNumber = input.nextInt();
                input.nextLine();


                System.out.println("Bill for "+rNumber+ " is "+ checkBill(rNumber, roomNumbers, billCalculation));
            }else if(choice == 4){
                System.out.println("Thank you for staying with use");
                return;
            }else {
                System.out.println("Invalid Option");
            }
        }
    }


    public static void viewRooms(int[] roomNumbers, Boolean[] isRoomBooked){
        for(int i = 0; i < roomNumbers.length; i++){
            if(!isRoomBooked[i]){
                System.out.println(roomNumbers[i] + " Available");
            }
            else{
                System.out.println(roomNumbers[i] + " Booked");
            }
        }
    }

    public static void  bookRoom(int roomNumber, int days, int[] roomNumbers, Boolean[] isRoomBooked, Integer[] billCalculation, int[] price){
        for(int i = 0; i < roomNumbers.length; i++) {
            if(roomNumbers[i] == roomNumber) {
                if(isRoomBooked[i] == false) {
                    billCalculation[i] = days * price[i];
                    isRoomBooked[i] = true;
                    System.out.println("Room with room no.: " + roomNumber + " booked successfully.");
                }else{
                    System.out.println("Room with room no.: "+roomNumber + " Already Booked");
                }
                return;
            }
        }
        System.out.println("Invalid Room Number");
    }

    public static int checkBill(int rNumber, int[] roomNumbers, Integer[] billCalculation) {
        for(int i = 0; i < roomNumbers.length; i++) {
            if(rNumber == roomNumbers[i]) {
                return billCalculation[i];
            }
        }
        return -1;
    }


}

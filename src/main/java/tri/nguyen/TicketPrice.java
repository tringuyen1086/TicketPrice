package tri.nguyen;

import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Please enter the day of Week (Monday to Sunday or 1 to 7 which Monday = 1): ");
        String day = input.nextLine();

        System.out.print("Please enter the time in 24-hour format: ");
        int hour  = input.nextInt();

        Double price = 0.00;

        if (age <= 15 || age >=65){ // seniors and minor
            price = 5.50;
            System.out.printf("The ticket price is $%.2f.", price);
        } else if (day == "Saturday"
                || day == "saturday"
                || day == "sunday"
                || day == "Sunday"
                || day == "6"
                || day == "7"){ //weekend
            price = 9.75;
            System.out.printf("The ticket price is $%.2f.", price);
        } else if (hour < 14) { // before 2 p.m. weekdays
            price = 7.00;
            System.out.printf("The ticket price is $%.2f.", price);
        } else { // all other times and days
            price = 8.25;
            System.out.printf("The ticket price is $%.2f.", price);
        }
    }
}

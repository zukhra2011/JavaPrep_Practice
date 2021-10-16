package Practice_examples;

import java.util.Scanner;

public class If_else_statement {
    public static void main(String[] args) {
   /*    char letter='Q';
        if (letter=='Q'){
            System.out.println("Letter is Q");
        }
        else {
            System.out.println("Letter is not Q");
        }
        //if condition is, if block will run
        //if it's not true, else will run

        System.out.println("Welcome to the Bank ATM");
        int secretPincode=1234;
        int  inputPincode=1234;
        if(secretPincode==inputPincode){
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw, check balance deposit");
        }
        else{
            System.out.println("Incorrect pincode! "+ inputPincode);
            System.out.println("Please try again.");
        }
        System.out.println("Thank you for using TD Bank ATM");

    */
        Scanner weather = new Scanner(System.in);
        System.out.println("Please type temperature:");
        int temp = weather.nextInt();
        if (temp >= 70) {
            System.out.println("It is a beautiful day!");
            System.out.println("Lets code java");
        } else {
            System.out.println("Its kind of cold today");
            System.out.println("Stay home and code java");
        }

        int bonus = 0;
        double salesAmount = 200.55;
        if (salesAmount <= 1000) {
            System.out.println("Good job, you qualified for bonus!");
            bonus = 50;
            System.out.println("bonus = " + bonus);
            ;

        } else {
            System.out.println("Great job you are qualified for full bonus");
            bonus = 100;
            System.out.println("bonus = " + bonus);
        }



    }

}

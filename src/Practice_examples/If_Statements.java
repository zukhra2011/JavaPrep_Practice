package Practice_examples;

import java.sql.SQLOutput;
import java.util.Scanner;

public class If_Statements {
    public static void main(String[] args) {
        if(10>5){
            System.out.println("Condition is true->10 is greater than 5" );
    } else{
            System.out.println("Condition is false");
        }

        Scanner object= new Scanner(System.in);
        System.out.println("Enter total price:");
        double totalPrice= object.nextDouble();
        if(totalPrice>=25){
            System.out.println("Free shipping eligible." +
                    "Your order total is: $55");
        }
        else{
            System.out.println("Not eligible for free shipping." +
                    "Your order total is $10 less than a minimum of $25.");
        }

    }
}

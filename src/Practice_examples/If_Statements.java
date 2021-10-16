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

    /*    Scanner object= new Scanner(System.in);
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



       Scanner info= new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information.");
        System.out.println("Enter your first name:");
        String firstName=info.next();
        System.out.println("Enter your last name:");
        String lastName= info.next();
        System.out.println("Enter your full name:");
        String fullName= info.nextLine();
        System.out.println("Enter your email:");
        String email= info.next();
        System.out.println("Enter your street:");
        String street= info.next();
        System.out.println("Enter your city:");
        String city=info.next();
        System.out.println("Enter your state:");
        String state= info.next();
        System.out.println("Enter your zipcode:");
        int zipcode= info.nextInt();
        System.out.println("Enter your work phone number:");
        Long phoneNumber=info.nextLong();
        System.out.println("Enter your personal phone number:");
        Long cellNumber=info.nextLong();
        System.out.println("Enter your age:");
        int age= info.nextInt();
        System.out.println("Enter your height:");
        double height=info.nextDouble();
        System.out.println("Enter your weight:");
        double weight=info.nextDouble();
        System.out.println("Are you married?");
        Boolean isMarried=info.nextBoolean();
        String address= info.next();
        System.out.println("Patient personal information.Full name:"+fullName
        +"Address: "+address+"Contacts: work phone"+phoneNumber);

     */
        Scanner time= new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int inputSeconds=time.nextInt();
        //formulas come from 
        int hours=inputSeconds/60/60;
        int minutes=(inputSeconds/60)%60;
        int seconds=inputSeconds%60;
        System.out.println("Hours"+hours+" "+"minutes "+minutes+" seconds "+seconds);

    }
}

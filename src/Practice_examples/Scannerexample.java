package Practice_examples;
import java.util.Scanner;
public class Scannerexample {
    public static void main(String[] args) {
  // Scanner scan=new Scanner(System.in);
  //  System.out.println("Please print your name:");
   //   String firstname=scan.next();
   //     System.out.println("Nice to meet you, "+ firstname);

    //Scanner age= new Scanner(System.in);
      //  System.out.println("How old are you?");
    //    String answer=scan.next();
     //   System.out.println(answer+"-thats great age");

      //  Scanner age2=new Scanner(System.in);
    //    System.out.println("How old are you?");
    //    int answer2=scan.nextInt();
      //  System.out.println(answer2+ "- solid age bro");

        /*Scanner number=new Scanner(System.in);
        System.out.println("Lets add");
        System.out.println("Enter two numbers");
        int num1=number.nextInt();
        int num2= number.nextInt();
        int result=num1+num2;
        System.out.println("Result: "+result);
         */
    /* Scanner calculator= new Scanner(System.in);
      System.out.println("Enter the hourly:");
     int hourly=calculator.nextInt();
     int weeklyPay=40*hourly;
      System.out.println("weeklyPay = " + weeklyPay);
     int monthlyPay=4*weeklyPay;
      System.out.println("monthlyPay = " + monthlyPay);
     int annualPay=12*monthlyPay;
      System.out.println("annualPay = " + annualPay);*/
  /*   Scanner grocery= new Scanner(System.in);
     System.out.println("Enter the price of milk:");
     double milk=grocery.nextDouble();
     System.out.println("Enter the price of bread:");
     double bread=grocery.nextDouble();
     System.out.println("Enter the price of cucumbers");
     double cucumbers=grocery.nextDouble();
     double total= milk+bread+cucumbers;
     System.out.println("Total of groceries = " + total);
   */

     Scanner scan=new Scanner(System.in);
     System.out.println("Enter item1 and its price");
     String item1=scan.next();
     Double price1=scan.nextDouble();
     System.out.println("Enter item2 and its price");
     String item2=scan.next();
     Double price2=scan.nextDouble();
     System.out.println("Enter item3 and its price");
     String item3=scan.next();
     Double price3=scan.nextDouble();
     System.out.println("Report="+(" Item1:"+item1+" Price1:"+price1
             +" Item2:"+item2+" Price2:"+price2
             +" Item3:"+item3+" Price3:"+price3));
     Double totalPrice=price1+price2+price3;
     System.out.println("TotalPrice = " + totalPrice);

    }}

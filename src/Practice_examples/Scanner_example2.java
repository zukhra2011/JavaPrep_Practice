package Practice_examples;

import java.util.Scanner;

public class Scanner_example2 {

    public static void main(String[] args) {
    /*  Scanner weather = new Scanner(System.in);
       System.out.println("How is the weather today?");
       String temp= weather.next();
        System.out.println(temp+ " - is a nice day today!");


        Scanner view= new Scanner(System.in);
        System.out.println("New command .nextLine() " +
                "takes on more than few words");
        String lotsofwords= view.nextLine();
        System.out.println(lotsofwords);*/

        //Updating variable value
      /*  int count=10;
        count=15;
        System.out.println(count);
        double rent=500;
        rent=rent+50;
        System.out.println(rent);
        double fuelPrice=2.75;
        System.out.println(fuelPrice-1.00);
       double price=25;
        System.out.println(price*5);*/

        int n=5;
        n=n+3;//8
        n+=3;//11
        n++;//12
        ++n;//13
        n--;//12

        System.out.println(n);
        //increment/decrememnt
        int apples=5;
        System.out.println(apples++);
        System.out.println(--apples);

//Post increment ++ is places after the variable name.
// As it runs from left to right, increase in value happens afterwards.
        int num1 = 4;
        int num2 = ++num1;
        System.out.println(num1);
        System.out.println(num2);
        num2=num1++;
        System.out.println("num2 = " + num2);

        int a= 50;
        int b= 22;
        int c= a++ + ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //////////////////////
        //Boolean
        System.out.println(10>5);
        System.out.println(5<30);
        System.out.println(432==432);
        System.out.println(555==111);
        System.out.println(345<=346);//should satisfy one of the conditions
        System.out.println(23!=43);
        System.out.println(33>=34);
         String word1="Please";
         String word2="please";
        System.out.println(word1==word2);
        word2="Please";
        System.out.println(word1==word2);

        int age=3;
        boolean nomoreToddler=age>4;
        System.out.println(nomoreToddler);
        if(age<=3){
            System.out.println("Toddler");
        }
        int ndf=23_4543_34;










    }
}

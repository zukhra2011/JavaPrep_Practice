package Practice_examples;

import java.util.Scanner;

public class If_else_statements3 {
    public static void main(String[] args) {
/*
        String selection = "y";
        System.out.println("Are you sure you want to delete this file?");
        if (selection == "y") {
            System.out.println("Your file will be deleted");
            boolean answer = true;
            System.out.println("answer = " + answer);
        } else {
            System.out.println("File deletion cancelled.");
            boolean answer = false;
            System.out.println("answer = " + answer);
        }


        int year = 2021;
        if (year >= 2021) {
            System.out.println("Covid19 pandemic year");
            System.out.println("Wear mask and keep distance");



        }


      int day=3;
        if (day == 1) {
            System.out.println("Monday");
        }
        else{
            System.out.println("Not Monday");
        }
        if (day==2){
            System.out.println("Tuesday");
        }
        if(day==3){
            System.out.println("Wednesday");
        }


//similar thing

        int day1 = 4;

        if (day1 == 1) {
            System.out.println("Monday");
        } else if (day1 == 2) {
            System.out.println("Tuesday");
        } else if (day1 == 3) {
            System.out.println("Wednesday");
        } else {
            System.out.println("java day");
        }
        System.out.println("Choose your language");
        int choice = 4;
        switch (choice) {
            case 1:
                choice = 1;
                System.out.println("hola");
                break;
            case 2:
                choice = 2;
                System.out.println("hello");
                break;
            case 3:
                choice = 3;
                System.out.println("privet");
                break;
            case 4:
                choice = 4;
                System.out.println("das");
            default:
                break;


        }


        String when="rainy";
        if(when=="sunny"){
            System.out.println("GO to park");
        } else if (when == "cloudy") {
            System.out.println("Stay home");
        }
        else if (when=="windy"){
            System.out.println("Get ready for power loss");
        }
        else{
            System.out.println("Just keep coding java");

        }


        int num1=24;
        int num2=3;
        char operator='/';
        if(operator=='+'){
            System.out.println(num1+num2);
        }
        else if(operator=='-'){
            System.out.println(num1-num2);
        }
        else if(operator=='/'){
            System.out.println(num1/num2);
        }
        else {
            System.out.println("No math today.");
        } */

        Scanner number= new Scanner(System.in);
        System.out.println("Please enter the numbers:");
        int numb1= number.nextInt();
        int numb2= number.nextInt();
        System.out.println("Enter operator:+, -, /");
        char oper=number.next().charAt(0);
        if(oper=='+'){
            System.out.println(numb1+numb2);
        }
        else if(oper=='-'){
            System.out.println(numb1-numb2);
        }
        else{
            System.out.println("No math today");
        }





    }}



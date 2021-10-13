package Practice_examples;

import java.util.Scanner;

public class Scanner_examples {
    public static void main(String[] args) {
      /*  Scanner time= new Scanner(System.in);
        int hour=time.nextInt();
        int minute=time.nextInt();
        int second=time.nextInt();
        String amorpm="PM";
        System.out.println(hour+":"+minute+":"+second+" "+amorpm);

       */

        Scanner area=new Scanner(System.in);
        System.out.println("Enter areq code:");
        int areaCode=area.nextInt();
        int localNumber=area.nextInt();
        String phoneNumber="Calling number ";
        System.out.println(phoneNumber+"("+areaCode+")"+"-"+localNumber);

    }
}

package Practice_examples;

public class Converting_types {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("n = " + n);
        String city="Baltimore";
        int population=1200000;
        System.out.println(n+population);
        System.out.println(city+population);
        boolean b1=true;
        boolean b2=false;
        System.out.println("b1"+b2);
        System.out.println(5+10);
        System.out.println(10-3);
        System.out.println(3*3);
        System.out.println(15/5);
        System.out.println(13%5);
        System.out.println(-2*2);
        int chairs=4+2;
        System.out.println("chairs = " + chairs);
        int spoons=10+20+23;
        System.out.println("spoons = " + spoons);
        int toyotas = 65, hondas=23;
        int vs = 56,bmw=345;
        int tesla = 234, nissan=576;
        int totalcarsinparkinglot;
        System.out.println("totalcarsinparkinglot= "+(toyotas+hondas+vs+bmw+tesla+nissan));
        int yearofBirth=1994;
        int currentYear=2021;
        System.out.println("Age is "+ (currentYear-yearofBirth));
        String city1="Chicago";
        String city2="Atlanta";
        double ticketprice=216.80;
        System.out.println("From "+city1+" to "+city2+" is $ "+ticketprice);
        System.out.println("java"+5+3);
        System.out.println("java"+(5+3));
        System.out.println(5+""+5);
        System.out.println(5+" "+5);
        char ascii='a';
        char aacii2='b';
        System.out.println(ascii+aacii2);//Follows Ascii table
        System.out.println(10/3); //==3
        System.out.println(10.0/3.0);//=3.33333335
         int n1=4;
         byte b3=(byte)n1;
        System.out.println("b3 = " + b3);
         byte b5=55;
         int n2=b5;
        System.out.println("n2 = " + n2);
       // implicit casting-small data type to  larger one.
        byte num1=10;
        short num2=num1;
        System.out.println("num2 = " + num2);
        short num3=3456;
        int num4=num3;
        System.out.println(num4);
        //explicit casting larger data type into smaller one.
        //need to parenthesis around the bigger one.
        //byte short into long.
        int nums1=55;
        byte nums2=(byte)num1;
        System.out.println("nums2 = " + nums2);
        long nums3=4444L;
        int nums4=(int)num3;
        System.out.println("nums4 = " + nums4);
       double d=34.556;
       short sh= (short)d;
        System.out.println("sh = " + sh);
        int num=(int)345.54;
        System.out.println("num = " + num);
        int numr=857;
        double f=(int)numr;
        System.out.println("f = " + f);

        






         










    }
}
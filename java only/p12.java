import java.util.Scanner;

public class p12{
    public static void main(String[]args){
    double principle,rate,amount;
    int years,timescompounds;
    Scanner sc = new Scanner(System.in);
    System.out.printf("enter the principle:");
    principle =sc.nextDouble();

    System.out.printf("enter the rate in (%%):");   
    rate = sc.nextDouble()/100;

    System.out.printf("enter the years:");
    years = sc.nextInt();   

    System.out.printf("enter the times compounded:");
    timescompounds = sc.nextInt();

    amount = principle * Math.pow((1 + rate/timescompounds),timescompounds*years);
    System.out.printf("the amount is : %,.2f \n",amount);
    sc.close();

    }
}
import java.util.Scanner;
public class p2{

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);    
        int a = 0;
        int b = 0;
        int sum = 0;
        System.out.println("enter a number:");
        System.out.println("enter a number:");
         
        a=sc.nextInt();
        b=sc.nextInt();         
        sum = a + b;
        System.out.println("sum of two numbers is:"+sum);       
        sc.close();
    }
}
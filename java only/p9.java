import java.util.Scanner;
public class p9{
public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 Double a,b,result;
 System.out.print("enter first number:");
 a=sc.nextDouble();
 System.out.print("enter second number:");
 b=sc.nextDouble();
 result=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
 System.out.println("the hypostenuseof trianlge is "+result);
 sc.close();
    }
}
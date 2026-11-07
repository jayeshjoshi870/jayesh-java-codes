import java.util.Scanner;
public class p6 {
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);   
    
     int a;
     System.out.print("enter your age:");
     a= sc.nextInt();
     {
        if(a==20){
          System.out.println("your elgibililty😂😂😊");
        }else if(a>25){
            System.out.println("your are above the elgibiltiy");
        }else if(a<18){
            System.out.println("your are not eliglibilty");
        }
     }
     sc.close();
        
    }
}

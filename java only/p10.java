import java.util.Scanner;
public class p10 {
    public static void main(String[]args){
         Scanner sc =new Scanner(System.in);
        double r,area,circumference,volume;
        System.out.print("enter the radius of the circle:");
        r =sc.nextDouble();
        area=Math.PI*Math.pow(r,2);
        System.out.printf("the area of the circle is %.2fcm^2 \n",area);
        circumference=2*Math.PI*r;
        System.out.printf("the circumference of the circle is %.2fcm \n",circumference);
        volume =(4/3)*Math.PI*Math.pow(r,3);
        System.out.printf("the volume of the circle is %.2fcm^3 \n",volume);
        sc.close();
    }                           
}

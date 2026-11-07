import java.util.Scanner; 
public class p11 {
    public static void main(String[] args){
        //String name = "jayesh";
       /* String name;
        int age ;*/
        int id1,id2,id3;
       /*  double salary;
        //System.out.printf("the name of the student is  %s",name);
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter the name of the person :");
        name = sc.next();  
        System.out.printf("the name of the person is :%s \n",name);
        System.out.printf("enter the age :");
        age =sc.nextInt();
        System.out.printf("your age  is : %d \n",age);
        System.out.printf("the name is %s and the age is %d. \n",name ,age);
        System.out.printf("enter the salary :");
        salary = sc.nextDouble();
        System.out.printf("the salary is : %,.1f \n",salary);*/
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter the id1 :");
        id1 = sc.nextInt();
        System.out.printf("enter the id2 :");
        id2 = sc.nextInt();
        System.out.printf("enter the id3 :");
        id3 = sc.nextInt();
        System.out.printf("the id1 is : %03d \n",id1);
        System.out.printf("the id2 is : %03d \n",id2);
        System.out.printf("the id3 is : %03d \n",id3);   
        sc.close();
    }
}
 
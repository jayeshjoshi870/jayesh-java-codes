import java.util.Scanner; 
public class p13{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        /*boolean isTrue;
        System.out.printf("enter the value of isTrue (true/false):");
        isTrue = sc.nextBoolean();
        if(isTrue == true){
            System.out.printf("the value is true \n"); 
            if (isTrue == false){
                System.out.printf("the value is false\n");
            }
            else{
                System.out.printf("the value is not false\n");
            }
        } else 
            {
            System.out.printf("the value is false\n");
        }*/
       boolean isStudent = true, isSeniorCitizen = true;
       int age,rate =100;
       System.out.printf("enter the value of is student(true/false): ");
       isStudent=sc.nextBoolean();
       System.out.printf("enter the value of age:");
       age=sc.nextInt();
       if(isStudent ==true){
        System.out.printf("the value is true give 10percent discount \n");
        rate = rate -100;
        System.out.printf("the rate is :%d \n", rate);
        if(age>=60){
            System.out.printf("the value is true give 20percent discount \n");
            rate = rate -200;
            System.out.printf("the rate is :%d \n", rate);
        }
        else if(isSeniorCitizen){   
            System.out.printf("the value is not true give 10percent discount \n");
        }
       }else{
        System.out.printf("the value is false give 5percent discount \n");  
    }
        sc.close();
    }
}
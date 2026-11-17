import java.util.Scanner;
public class p18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       Double FIRST_WEIGHT,FINAL_WEIGHT;
       int CHOICE;
       System.out.printf("weight conversion program\n");
       System.out.println("choice 1:-is kgs to lbs(pounds)\n");
       System.out.println("choice 2:-is lbs(pounds) to kgs\n");
       System.out.printf("enter your choice of operation: ");
       CHOICE = sc.nextInt();
       if(CHOICE==1){
        System.out.printf("weight convert kgs into pounds\n");
        System.out.printf("enter the weight:");
        FIRST_WEIGHT=sc.nextDouble();
        FINAL_WEIGHT=FIRST_WEIGHT*2.20462;
        System.out.printf("the final weight in pound(lbs) is:- %.2f \n",FINAL_WEIGHT);
       }else if(CHOICE == 2){
        System.out.printf("weight convert pounds(lbs) into kgs\n");
        System.out.printf("enter the weight:");
        FIRST_WEIGHT=sc.nextDouble();
        FINAL_WEIGHT=FIRST_WEIGHT*0.453592;
        System.out.printf("the final weight in kgs is:- %.2f\n ",FINAL_WEIGHT);
       }else{
        System.out.println("enter the correct choice");
       }
       sc.close();
    }
}
 

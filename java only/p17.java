import java.util.Scanner;
public class p17 {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        String name;
        System.out.printf("Enter your name: ");
        name=sc.nextLine();
        System.out.printf("Enter your email: ");
        String email=sc.nextLine();
        if(email.contains("@")){
            String username =email.substring(0,email.indexOf("@"));
        String domain=email.substring(email.indexOf("@")+1);
        System.out.printf("Username: %s\nDomain: %s\n", username, domain);  
        }else{
            System.out.printf("NAME: %s \n",name);
        }
        sc.close();
    }
}
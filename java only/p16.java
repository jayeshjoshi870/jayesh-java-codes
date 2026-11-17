public class p16{

    public static void main(String[]args){

        String email ="jayesh@gmail.com";
       /*String username =email.substring (0,5);
        String domain =email.substring(6,16);*/
        String username=email.substring(0,email.indexOf("@"));
        String domain=email.substring(email.indexOf("@")+1);
        System.out.printf("your value are :%s and domain is :%s\n",username,domain);
    }
}
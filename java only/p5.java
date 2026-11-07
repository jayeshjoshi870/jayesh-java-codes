import java.util.Scanner;
public class p5 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        double total;
        char currency= '$';
        System.out.print("what items would you like to buy?:");
        item =sc.nextLine();
        System.out.print("what is the price of each items?:");
        price =sc.nextDouble();
        System.out.print("how many items would you like to buy ?:");
        quantity =sc.nextInt();
        total= price*quantity;
        System.out.println("the total cost of the items is :"+ total);
        System.out.println("item:"+item);
        System.out.println("price:"+ currency + price);
        System.out.println("quantity:"+quantity);
        System.out.println("total:"+ currency + total);
        sc.close();
    }
    
}

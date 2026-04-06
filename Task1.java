import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        double discount = 0;

        if (value > 5000) {
            discount = value * 0.20;
        } 
        else if (value >= 2000) { 
            discount = value * 0.10;
        } 
        else {
            discount = 0;
        }

        double finalAmount = value - discount; 
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalAmount);
    }
}

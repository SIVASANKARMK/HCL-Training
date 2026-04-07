import java.util.*;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter mileage (km/l): ");
        double mileage = sc.nextDouble();

        System.out.print("Enter fuel price (per litre): ");
        double fuelPrice = sc.nextDouble();

        double totalLitres = distance / mileage;
        double totalCost = totalLitres * fuelPrice;
        System.out.println("Total fuel needed: " + totalLitres + " litres");
        System.out.println("Total cost of the trip: " + totalCost);
    }
}

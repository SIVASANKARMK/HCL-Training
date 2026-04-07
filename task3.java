import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "admin123";
        int attempts = 0;

        while (true) {
            System.out.print("Enter password: ");
            String input = sc.nextLine();

            if (input.equals(correctPassword)) {
                System.out.println("Access Granted");
                break; 
            } else {
                if (attempts == 3) {
                    System.out.println("Blocked");
                    break; 
                }
            }
        }
        sc.close();
    }
}
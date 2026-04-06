class class1 {
    // Methods inside the class
    public void add(int x, int y) {
        System.out.println("Addition: " + (x + y));
    }

    public void subtract(int x, int y) {
        System.out.println("Subtraction: " + (x - y));
    }

    public void multiply(int x, int y) {
        System.out.println("Multiplication: " + (x * y));
    }
}

public class operators {
    public static void main(String[] args) {
        // 1. Create the object
        class1 obj = new class1();

        // 2. Call the methods using the object
        obj.add(10, 5);
        obj.subtract(20, 8);
        obj.multiply(4, 3);
    }
}

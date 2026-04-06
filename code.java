import java.util.*;
class hclcode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float unit = sc.nextFloat();
        if(unit >0 && unit <= 100) {
            System.out.println("0");
        }
        else if (unit >= 101 && unit <= 200) {
            System.out.println(unit * 0.8);
        }
        else if(unit >= 201 && unit <= 300) {
            System.out.println(unit * 1.5);
        }
        else {
            System.out.println(unit * 3);
        }

    }
}
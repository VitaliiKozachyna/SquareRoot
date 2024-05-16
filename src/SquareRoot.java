import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.println("Square root of " + num + " equals " + Math.sqrt(num));
    }
}

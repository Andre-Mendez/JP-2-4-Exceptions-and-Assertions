package assertions;

import java.util.Scanner;

public class AssertEx {
    //program that will convert a double to an int
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double x = input.nextDouble();
        input.close();

        assert x < 2_147_483_647.0 : "Number too large to convert to integer";

        System.out.println("Value of x: " + x);
        int y = (int) x;

        System.out.println(y);
    }
}

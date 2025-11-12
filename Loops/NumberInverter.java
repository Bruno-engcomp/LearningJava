import java.util.Scanner;
public class NumberInverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, original, inverted, rest;

        System.out.print("Enter a number:");
        n = input.nextInt();
        original = n;
        inverted = 0;

        while(n > 0)
        {
            rest = n % 10;
            inverted = inverted * 10 + rest;
            n /= 10;
        }
        System.out.printf("The original number is %d and the inverted number is %d", original, inverted);
    }
}

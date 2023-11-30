import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter a binary number: ");
                String binaryInput = scanner.next();
                int decimalResult = binaryToDecimal(binaryInput);
                System.out.println("Decimal equivalent: " + decimalResult);
                break;

            case 2:
                System.out.println("Enter a decimal number: ");
                int decimalInput = scanner.nextInt();
                String binaryResult = decimalToBinary(decimalInput);
                System.out.println("Binary equivalent: " + binaryResult);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    private static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}
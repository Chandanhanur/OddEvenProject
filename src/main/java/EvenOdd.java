/**
 * Program to check whether a given number is Even or Odd.
 */
public class EvenOdd {

    /**
     * Checks if a number is even.
     * @param number integer input
     * @return true if even, false otherwise
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Checks if a number is odd.
     * @param number integer input
     * @return true if odd, false otherwise
     */
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    /**
     * Returns "Even" or "Odd" string based on the number.
     * @param number integer input
     * @return "Even" or "Odd"
     */
    public static String check(int number) {
        return isEven(number) ? "Even" : "Odd";
    }

    /**
     * Main entry point to run the program.
     */
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("          Even or Odd Checker            ");
        System.out.println("=========================================");

        if (args != null && args.length > 0) {
            for (String arg : args) {
                try {
                    int num = Integer.parseInt(arg.trim());
                    System.out.println("Number: " + num + " -> " + check(num));
                } catch (NumberFormatException e) {
                    System.err.println("Invalid integer: " + arg);
                }
            }
        } else {
            System.out.println("No command-line arguments provided. Running default tests:");
            int[] testNumbers = {0, 1, 2, 7, 10, -3, -8};
            for (int num : testNumbers) {
                System.out.println("Number: " + num + " -> " + check(num));
            }
        }
    }
}


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int module3 = 3;
        final int module5 = 5;
        int first = scanner.nextInt();
        int last = scanner.nextInt();
        String nextPrint = "";
        boolean isDiv3 = false;
        boolean isDiv5 = false;

        for (int i = first; i <= last; i++) {
            isDiv3 = i % module3 == 0;
            isDiv5 = i % module5 == 0;

            if (isDiv3 && isDiv5) {
                nextPrint = "FizzBuzz";
            } else if (isDiv3) {
                nextPrint = "Fizz";
            } else if (isDiv5) {
                nextPrint = "Buzz";
            } else {
                nextPrint = String.valueOf(i);
            }
            System.out.println(nextPrint);
        }
    }
}
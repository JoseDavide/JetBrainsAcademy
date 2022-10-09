import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int values = scanner.nextInt();
        int current;
        int ship = 0, fix = 0, reject = 0;
        for (int i = 0; i < values; i++ ) {
            current = scanner.nextInt();
            if (current == 0) ship++;
            else if (current > 0) fix++;
            else if (current < 0) reject++;
        }
        System.out.println(ship + " " + fix + " " + reject);
    }
}
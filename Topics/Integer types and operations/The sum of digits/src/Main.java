import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int sum = 0;

        do {
            sum += number % 10;
            number = number / 10;
        }
        while (number > 0);
        System.out.println(sum);
    }
}
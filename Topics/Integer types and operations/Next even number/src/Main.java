import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstNumber = scanner.nextInt();
        if (firstNumber % 2 == 0) {
            System.out.println(firstNumber + 2);
        } else {
            System.out.println(firstNumber + 1);
        }

    }
}
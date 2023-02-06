import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int i = 1;
        while (i <= a) {
            if (Math.pow(i, 0.5) == (int) Math.pow(i, 0.5)) {
                System.out.println(i);
            }
            i++;
        }
    }
}
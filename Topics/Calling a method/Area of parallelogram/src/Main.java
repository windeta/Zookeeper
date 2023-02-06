import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // call the method here
        Scanner scanner = new Scanner(System.in);
        int hight = scanner.nextInt();
        int lenght = scanner.nextInt();
//        double a=Math.pow(2,3);
//        System.out.println(a);

        countAreaOfParallelogram(lenght, hight);
    }

    // Do not change code below   
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
//        int students = 0;
        ArrayList<Integer> students=new ArrayList<>();
        int desks=0;

        do {
            students.add(scanner.nextInt());

        } while (scanner.hasNext());
        for (int i: students) {
            if(i%2==0){
                desks+=i/2;
            }else {
                desks+=(i/2+1);
            }
        }

        System.out.println(desks);
//        if (students % 2 == 0) {
//            System.out.println(students / 2);
//        }
//        else{
//            System.out.println(students / 2+1);
//        }
    }
}
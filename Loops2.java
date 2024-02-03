import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        //display digits of a number;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        while (num>0) {
            System.out.println(num%10);
            count++;
            num/=10;
        }


        System.out.println(count);



        scanner.close();


    }
}

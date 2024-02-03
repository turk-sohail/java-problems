import java.util.Scanner;

public class Fibbinachi {
    public static void main(String[] args) {
        //arithmatic sequence
        System.out.println("Enter the three numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        int term = a;
        for(int i = 0;i<n;i++){
            System.out.print(term + ",");
            term+=d;
        }




        scanner.close();

    }
}

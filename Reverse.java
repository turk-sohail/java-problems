import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = n;
        int rev = 0;
        while(n>0){
            int x = n%10;
            rev = (rev*10) + x;
            n/=10;
        }

        if(p == rev){
            System.out.println("Number is plaindrome");
        }

        System.out.println(rev);




        scanner.close();

    }
}

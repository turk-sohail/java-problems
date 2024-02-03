import java.util.Scanner;

public class LoopsPro {
    public static void main(String[] args) {
        //reverse a number;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int rev = 0,x,sum = 0,total = n;

        while(n>0){
            x = n%10;
            sum+=x*x*x;
            n/=10;
        }

        if(sum==total){
            System.out.println("Number is armstrong");
        }

        //System.out.println(rev);

        



        scanner.close();
    }
}

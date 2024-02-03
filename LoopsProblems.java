import java.util.Scanner;

public class LoopsProblems{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //multiplication table;
        // for(int i = 1;i<=10;i++){
        //     System.out.println(number + " X " + i + " = " + (number*i));
        // }


        //sum of n numbers;

        // int sum = 0;
        // for(int i=1;i<=n;i++){
        //     sum+=i;
        // }
        // System.out.println(sum);
        
            // printing factorial of  numbers

        int factorial = 1;
        
        for(int i=1;i<=n;i++){
            factorial*=i;
        }

        System.out.println(factorial);

        






    










        scanner.close();





    }
}
import java.util.Scanner;

public class ReverseInWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x ;
        int rev = 0;
        String revString = "";

        while(n>0){
           x  = n % 10; 
           rev = (rev*10)+x;
           revString+=x;
           n/=10;
        }

        // while(rev>0){
        //   int r = rev%10;
        //   revString+=r;
        //   rev/=10;
        // }

        for(int i=revString.length()-1;i>=0;i--){
            char c = revString.charAt(i);
            switch (c) {
                case '0':System.out.print("Zero ");
                    break;
                case '1':System.out.print("One ");
                    break;
                case '2':System.out.print("Two ");
                    break;
                case '3':System.out.print("Three ");
                    break;
                case '4':System.out.print("Four ");
                    break;
                case '5':System.out.print("Five ");
                    break;
                case '6':System.out.print("Six ");
                    break;
                case '7':System.out.print("Seven ");
                    break;
                case '8':System.out.print("Eight ");
                    break;
                case '9':System.out.print("Nine ");
                    break;
                    

            
                default:
                    break;
            }
        }





        scanner.close();
    }


}

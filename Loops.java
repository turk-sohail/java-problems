import java.util.*;
public class Loops {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] n = new int[4];
    
    
    for(int i=0;i<4;i++){
        n[i] = scanner.nextInt();
    }

    for(int x:n){
        System.out.print(" "+(x*x));
    }




    scanner.close();

    }
}

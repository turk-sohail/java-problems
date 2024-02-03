import java.util.Scanner;

public class ArraysProject {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         int key = scanner.nextInt();
        // int num[] = new int[5];
        // num[0] = 3;
        // num[1] = 36;
        // num[2] = 33;
        // num[3] = 13;
        // num[4] = 44;
        // // for(int n:num){
        // //     System.out.print(n + " ");
        // // }
        // // System.out.println("");
        // // int j[] = new int[4];
        // // for(int i:j){
        // //     System.out.print(i);
        // // }

        // //printing reverse of an array;

        //     // for(int i=num.length-1;i>=0;i--){
        //     //     System.out.println(num[i]);
        //     // }

        // //finding sum of all elements in arary
        // int sum = 0;
        // for(int i=0;i<num.length;i++){
        //     sum +=num[i];
        // }

        // System.out.println(sum);
        int x[] = {2,3,4,6,7,8,9,13,19,25};

        //printing sum of all element in array

        // int sum = 0;
        // for(int i=0;i<x.length;i++){
        //     sum+=x[i];
        // }

        // System.out.println(sum);



        //finding an element in array

        //linear search
        // for(int i =0;i<x.length;i++){
        //     if(x[i] == key){
        //         System.out.println("key at index "+i);
        //         System.exit(0);
        //     }
        // }

        // System.out.println("Key does not exist");


        //Performing binary search
        // int f=0,m,l=9;

        // while(f<=l){
        //     m = (f+l)/2;

        //     if(key == m){
        //         System.out.println("Key is found");
        //         System.exit(0);
        //     }else if(key<m){
        //         l = x[m] - 1 ;
        //     }else{
        //         f = x[m] + 1;
        //     }
        // }

        // System.out.println("key does not exist");

        // System.out.println(12/5);


        //finding second max in array;
        // int max = x[0];
        // int secondMax = x[0];

        // for(int i = 0;i<x.length;i++){
        //     if(x[i]>max){
        //         max = x[i];
        //     }
            
        // }


        // System.out.println(max);


        //finding elements in array

        // int max = x[0];
        // for(int i=0;i<x.length;i++){
        //     if(x[i]>max){
        //         max = x[i];
        //     }
        // }

        // System.out.println("Max is "+max);

        //linear search
        for(int i=0;i<x.length;i++){
            if(key== x[i]){
                System.out.println("Key is found at index "+i);
                System.exit(0);
            }
        }

        System.out.println("Key does not exist");

















    }
    
    
}

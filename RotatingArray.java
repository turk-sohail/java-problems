public class RotatingArray {
    public static void main(String[]   args) {

        //left rotation of array
        int[] A = {2,4,5,7,8,9,15};
        
        // for (int i : A) {
        //     System.out.print(" "+i);
        // }
        
        // int x = A[0];

        // for(int i =1;i<A.length;i++){
        //     A[i-1] = A[i];
        // }
        // A[A.length-1] = x;
        // System.out.println();

        // for (int i : A) {
        //     System.out.print(" "+i);
        // }

        //right rotation of array

        //[2,3,4,5]
        //1 goes --> direction,2 all move right,3 make space remove ending(5) store in temp
        //4 loop over and shift index of el to right 5 space left at begin store temp inside

        for (int i : A) {
            System.out.print(i + " ");
        }
        /* temp = 5;i=
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         */

        int temp = A[A.length-1];
        for(int i = A.length-2;i>=0;i--){
            A[i+1] = A[i];
        }
        A[0] = temp;

        System.out.println();

        for (int i : A) {
            System.out.print(i+ " ");
        }














        





    }
}

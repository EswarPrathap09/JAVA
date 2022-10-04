import java.util.Scanner;
public class Arrays {
    public static String toString(String[] a){
        if (a==null)
            return null;
        int iMax=a.length-1;
        if(iMax == -1)
            return"[]";
        StringBuilder b = new StringBuilder();
        b.append('[');
        for(int i=0;;i++){
            b.append(a[i]);
            if (i==iMax)
                return b.append(']').toString();
            b.append(",");
        }
    }

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        //int[]ros = new int [5];
        //ros[0]=1;
        //System.out.println(ros[0]);

        /*
        int [] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.print(Arrays.toString(arr));

        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        //For-Each LOOP
        for (int num : arr){
            System.out.println(num+  " ");
        }
        */

        //2D-ARRAYS

        int [][] ans = new int [3][3];


        /*int[][] ans2D = {

                {1,2,3},
                {4,5,6},
                {7,8,9},

                // it can also be represented as
                {1,2,3}
                {4,5}
                {6,7,8,9}

        };*/

        for (int row = 0; row <ans.length;row++){
            for (int col =0;col< ans[row].length;col++){
                 ans[row][col]=in.nextInt();
            }
        }
        for (int row = 0; row <ans.length;row++){
            for (int col =0;col< ans[row].length;col++){
                System.out.print(ans[row][col]);
            }
            System.out.println();
        }
        //System.out.println(ans[1]);
    }
}

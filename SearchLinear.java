public class SearchLinear {
    /*
    Linear Search works in a way it starts from index "0" and search for the required
    object and search for that particular item if the item is found at particular place it stops
    its searching.
    */

    public static void main(String[]args){
        int []nums={12,78,90,89,34,56,89,11};
        int target = 89;
        System.out.println(LinearSearch(nums,target));

    }
    //search in the array
    static int LinearSearch(int[]arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index=0;index<arr.length;index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}

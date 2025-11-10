public class Insertionsort {
    // worst case O(n^2) Stable sort
    // best case O(n)
    public static void sort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]>arr[j]){

                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
    
    public static void reverseSort(int[] arr) {
                for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]<arr[j]){

                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else{
                    break;
                }
            }
        }
    } 


    public static void Sort_no_swap(int[] arr) { // swap logic is used so better
    for (int i = 1; i < arr.length; i++) {
        int key = arr[i];
        int j = i - 1;
        
        // Move elements of arr[0..i-1] that are greater than key
         // to one position ahead of their current position
        // shift larger elements to the right
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        // insert key at correct position
        arr[j + 1] = key;
    }
}

}

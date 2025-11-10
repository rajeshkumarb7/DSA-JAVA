public class SelectionSort {

    // O(n^2) unstable sort
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i; // initial min value of index is assume i 
            //select minimum value
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //swap 
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
            /* 
            | Loop        | Range                    | Why                                  |
            | ----------- | ------------------------ | ------------------------------------ |
            | Outer (`i`) | `0 → arr.length - 2`     | Last element auto-sorted             |
            | Inner (`j`) | `i + 1 → arr.length - 1` | Need to check all remaining elements |
            */
        public static void reverseSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i; // initial max value of index is assume i 
            //select maximum value
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            //swap 
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
    }

   
}
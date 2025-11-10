public class BubbleSort{
    // worstcase: O(n^2) Stablesort  
    // bestcase: O(n) if already sorted so use checkmark to avoid loop again and again
    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){ // ol:n-1 times run
            boolean swapped=false; //checkmark
            for(int j=0;j<arr.length-i;j++){  //innerloop: n-i time run because j compare with j+1 
                if(arr[j]>arr[j+1]){
                    swapped=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if (!swapped) { // if no swap so is already sorted so return or break the loop
                return;
            }

        }
    }


    public static void reverseSort(int[] arr) {
        for(int i=1;i<arr.length;i++){ // ol:n-1 times run
            boolean swapped=false; //checkmark
            for(int j=0;j<arr.length-i;j++){  //innerloop: n-i time run because j compare with j+1 
                if(arr[j]<arr[j+1]){
                    swapped=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if (!swapped) { // if no swap so is already sorted so return or break the loop
                return;
            }
        }
    }
}
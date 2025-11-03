public class BinarySearch {
    //best case :o(1)
    //worst case:o(logn)
    
    public static int find(int[] arr,int target){
        int start=0,end=arr.length-1;
        boolean asc=false;
        if(arr[start]<=arr[end]){
            asc=true;
        }
        while(start<=end){
                //int mid=(start+end)/2; avoid to use this because Risk of overflow
                    //ex: start=1253527847 and end=228427382 so start+end give bigger value int can't hold so not use it
                int mid = start + (end - start) / 2;
                if(asc){
                if(arr[mid]<target){
                    start=mid+1;
                }
                else if(arr[mid]>target){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
            else{
                if(arr[mid]>target){
                    start=mid+1;
                }
                else if(arr[mid]<target){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }

    //for check array elements contains or not
    public static boolean contains(int[] arr,int target){
        if(-1==(BinarySearch.find(arr, target))) // here we use search method reuse for contains avoid dublicate code
        {
            return false;
        }
        return true;
    }

    // for insert position
    public static int insertPosition(int[] arr,int target){
        int start=0,end=arr.length-1;
        boolean asc=false;
        if(arr[start]<=arr[end]){
            asc=true;
        }
        while(start<=end){
                int mid=(start+end)/2;
                if(asc){

                if(arr[mid]<target){
                    start=mid+1;
                }
                else if(arr[mid]>target){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
            else{

                if(arr[mid]>target){
                    start=mid+1;
                }
                else if(arr[mid]<target){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
        }
        return start;
    }

    //maximum elements in array
    public static int max_element(int[] arr){
        if(arr.length==0){
            return -999999999;
        }
        if(arr[0]>arr[arr.length-1]){
            return arr[0];
        }
        return arr[arr.length-1];
    }
    //minimum elements in array
    public static int min_element(int[] arr){
        if(arr.length==0){
            return -999999999;
        }
        if(arr[0]<arr[arr.length-1]){
            return arr[0];
        }
        return arr[arr.length-1];
    }
}

public class LinearSearch{
    // for linearsearch
    // best case:o(1) and worst case O(n)
    // for interger array linearsearch 
    public static int search(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
    // for 2D arraylinear search
        public static int[] search(int[][] arr,int target)
    {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
            {
                if(target==arr[i][j]){
                return new int[] {i,j};
            }
            }
            
        }
        return new int[] {-1,-1};
    }

    // for string charactor search
    public static int index(String s,char target)
    {
        for(int i=0;i<s.length();i++){
            if(target==s.charAt(i)){
                return i;
            }
        }
        return -1;
    }
    //last index method for string char index
        public static int lastIndex(String s,char target)
    {
        for(int i=s.length()-1;i>0;i--){
            if(target==s.charAt(i)){
                return i;
            }
        }
        return -1;
    }
    // for 1D arraylinear search for String
    public static int search(String[] s,String target)
    {
        for(int i=0;i<s.length;i++){
            if(target.equals(s[i])){
                return i;
            }
        }
        return -1;
    }

    // for 2D arraylinear search for String
        public static int[] search(String[][] arr,String target)
    {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
            {
                if(target==arr[i][j]){
                return new int[] {i,j};
            }
            }
            
        }
        return new int[] {-1,-1};
    }
    //for check array elements contains or not
    public static boolean contains(int[] arr,int target){
        if(-1==(LinearSearch.search(arr, target))) // here we use search method reuse for contains avoid dublicate code
        {
            return false;
        }
        return true;
    }

    // for check 2D array elements contains or not
    public static boolean contains(int[][] arr,int target){

        int[] a=LinearSearch.search(arr, target);
        if(a[0]==-1) 
        {
            return false;
        }
        return true;
    }
    // for check 1D String array elements contains or not
    public static boolean contains(String[] arr,String target){

        int a=LinearSearch.search(arr, target);
        if(a==-1) 
        {
            return false;
        }
        return true;
    }

        // for check 2D String array elements contains or not
    public static boolean contains(String[][] arr,String target){

        int[] a=LinearSearch.search(arr, target);
        if(a[0]==-1) 
        {
            return false;
        }
        return true;
    }

    //other methods
    
    //maximum elements in array
    public static long max_element(int[] arr){
        int t=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(t<arr[i]){
                t=arr[i];
            }
        }
        return (long) t;
    }
     //minimum elements in array
    public static long min_element(int[] arr){
        int t=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(t>arr[i]){
                t=arr[i];
            }
        }
        return (long) t;
    }
}

import java.util.Arrays;

public class Demo_BinarySearch {
    public static void main(String[] args) {
        System.out.println("main demo method for Binary search");
        int arr[]={1,2,90,6,4,7,54,-50,42,53,8,4,9,3,8}; //array
        // for binary search array must be in order should follow ascending or desending so here sorted for understanding purpose 
        Arrays.sort(arr); // arr is sorted using Arrays class method in ascending order

        int[] arr2={89,67,43,32,12,9,8,5,3,1,0,-4,-3,-23,-34,-324};  //decreaseing
        int[] arr3=Arrays.copyOf(arr2,arr2.length); // this way take copy of arr2 and not use like arr3=arr2 is same refernce so change in one array affect another
        Arrays.sort(arr3); //[-324, -34, -23, -4, -3, 0, 1, 3, 5, 8, 9, 12, 32, 43, 67, 89] // increasing
        System.out.println("Array of arr2 : "+Arrays.toString(arr2));
        System.out.println("Array of arr3 : "+Arrays.toString(arr3));

        int key=-23;
        System.out.println("in ARR2 Binary search for key is: "+key+" is :"+BinarySearch.find(arr2,key));
        System.out.println("this key contains is : "+BinarySearch.contains(arr2, key));

        System.out.println("in ARR3 Binary search for key is: "+key+" is :"+BinarySearch.find(arr3,key));
        System.out.println("this key contains is : "+ BinarySearch.contains(arr3, key));
        System.out.println("in ARR3 Binary search for value is: "+key+" is insert position is : "+BinarySearch.insertPosition(arr3,key));
        key=6;
        System.out.println("in ARR3 Binary search for value is: "+key+" is insert position is : "+BinarySearch.insertPosition(arr3,key));
        System.out.println("in ARR2 Binary search for value is: "+key+" is insert position is : "+BinarySearch.insertPosition(arr2,key));
        

        
        //other methods
        //maximum element in array
        System.out.println("maximum element in Arr2: "+BinarySearch.max_element(arr2));
        //minimum element in array
        System.out.println("Minimum element in Arr2: "+BinarySearch.min_element(arr2));

    }
    /*
     * sample output
     * main demo method for Binary search
        Array of arr2 : [89, 67, 43, 32, 12, 9, 8, 5, 3, 1, 0, -4, -3, -23, -34, -324]
        Array of arr3 : [-324, -34, -23, -4, -3, 0, 1, 3, 5, 8, 9, 12, 32, 43, 67, 89]
        in ARR2 Binary search for key is: -23 is :13
        this key contains is : true
        in ARR3 Binary search for key is: -23 is :2
        this key contains is : true
        in ARR3 Binary search for value is: -23 is insert position is : 3
        in ARR3 Binary search for value is: 6 is insert position is : 9
        in ARR2 Binary search for value is: 6 is insert position is : 7
        maximum element: 89
        Minimum element: -324
     */

    
}
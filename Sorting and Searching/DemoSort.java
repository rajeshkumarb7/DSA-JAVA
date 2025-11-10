import java.util.Arrays;

public class DemoSort {
    public static void main(String[] args) {
        
        int[] arr={1,324,53,13,5,823,34,75,9876,1,23,3,53,65,3,2,-23,-2,-3,-2223,-22,-32};
        /*
        System.out.println("demo for Selection sort");
        System.out.println("before sort of arr :"+""+Arrays.toString(arr));
        SelectionSort.sort(arr);
        System.out.println("After sort of arr :"+""+Arrays.toString(arr));
        SelectionSort.reverseSort(arr);
        System.out.println("After reversesort of arr :"+""+Arrays.toString(arr));
        System.out.println("_______________________________________");
        
        arr= new int[]{1,324,53,13,5,823,34,75,9876,1,23,3,53,65,3,2,-23,-2,-3,-2223,-22,-32};
        System.out.println("demo for Bubble sort");
        System.out.println("before sort of arr :"+""+Arrays.toString(arr));
        BubbleSort.sort(arr);
        System.out.println("After sort of arr :"+""+Arrays.toString(arr));
        BubbleSort.reverseSort(arr);
        System.out.println("After reversesort of arr :"+""+Arrays.toString(arr));
        System.out.println("_______________________________________");

        */
        arr= new int[]{1,324,53,13,5,823,34,75,9876,1,23,3,53,65,3,2,-23,-2,-3,-2223,-22,-32};
        System.out.println("demo for Insertion sort");
        System.out.println("before sort of arr :"+""+Arrays.toString(arr));
        Insertionsort.sort(arr);
        System.out.println("After sort of arr :"+""+Arrays.toString(arr));
        Insertionsort.reverseSort(arr);
        System.out.println("After reversesort of arr :"+""+Arrays.toString(arr));
        Insertionsort.Sort_no_swap(arr);
        System.out.println("After sort of arr without using swap :"+""+Arrays.toString(arr));
        System.out.println("_______________________________________");

        /*/
        arr= new int[]{1,324,53,13,5,823,34,75,9876,1,23,3,53,65,3,2,-23,-2,-3,-2223,-22,-32};
        System.out.println("demo for QUICK sort");
        System.out.println("before sort of arr :"+""+Arrays.toString(arr));
        SelectionSort.sort(arr);
        System.out.println("After sort of arr :"+""+Arrays.toString(arr));
        SelectionSort.reverseSort(arr);
        System.out.println("After reversesort of arr :"+""+Arrays.toString(arr));
        System.out.println("_______________________________________");

        arr= new int[]{1,324,53,13,5,823,34,75,9876,1,23,3,53,65,3,2,-23,-2,-3,-2223,-22,-32};
        System.out.println("demo for Bubble sort");
        System.out.println("before sort of arr :"+""+Arrays.toString(arr));
        SelectionSort.sort(arr);
        System.out.println("After sort of arr :"+""+Arrays.toString(arr));
        SelectionSort.reverseSort(arr);
        System.out.println("After reversesort of arr :"+""+Arrays.toString(arr));
        System.out.println("_______________________________________");

        */
    }

    
}
import java.util.Arrays;

public class Demo_LinearSearch {
    public static void main(String[] args) {
        System.out.println("main demo method");
        int arr[]={1,2,90,6,4,7,54,-50}; //array
        int arr2d [][]={{1,2,3},{4,6,8}};
        int a=6;
        var s="good";
        String[] s1d={"hello","good","welcome"};
        String[][] s2d={{"hello","welcome"},{"good","will","hunting"}};
        // var is a special type for auto type allacation only in compilition time

        int ans= LinearSearch.search(arr,a);
        System.out.println(ans);
        System.out.println(LinearSearch.contains(arr, a));

        System.out.println(Arrays.toString(LinearSearch.search(arr2d, a)));
        System.out.println(LinearSearch.contains(arr2d, a));

        //for string search
        System.out.println(LinearSearch.index(s,'o'));
        System.out.println(LinearSearch.lastIndex(s,'o')); 
        //for string 1d array
        System.out.println(LinearSearch.search(s1d, s));
        System.out.println(LinearSearch.contains(s1d, s));
        //for String 2d array
        System.out.println(Arrays.toString(LinearSearch.search(s2d, s)));
        System.out.println(LinearSearch.contains(s2d, s));

        //other methods
        //maximum element in array
        System.out.println(LinearSearch.max_element(arr));
        //minimum element in array
        System.out.println(LinearSearch.min_element(arr));

        
    }
}
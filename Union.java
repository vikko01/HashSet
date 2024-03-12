package HashSet;
import java.util.*;
public class Union {
    public static void main(String args[]) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        int n = arr1.length;
        int m = arr2.length;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n ; i++) {
            set.add(arr1[i]);
            
        }
        for(int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }

        for(Integer key : set) {
            System.out.print(key + " ");
        }
        System.out.println();
        System.out.println("number of elements in union array = " + set.size());
    }
}

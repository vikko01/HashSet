package HashSet;
import java.util.*;
public class CountDistintNum {
    public static void main(String[] args) {
        int arr[] = {4,3,2,5,6,7,3,4,2,1};
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        System.out.println("ans = " + set.size() );
    }
}

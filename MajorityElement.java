package HashMap;
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        int n = arr.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        // for(int i = 0; i < n; i++) {
        //     if(map.containsKey(arr[i])) {
        //         map.put(arr[i], map.get(arr[i])+1);
        //     } else {
        //         map.put(arr[i], 1);
        //     }
        // }

        // Set<Integer> keySet = map.keySet();
        // for(Integer key : keySet) {
        //     if(map.get(key) > n/3) {
        //         System.out.println(key);
        //     }
        // }


        // Approcach with less code
        for(int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

        }

        for(Integer key : map.keySet()) {
            if(map.get(key) > n/3) {
                System.out.println(key);
            }
        }
    }
}

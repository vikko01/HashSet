package HashMap;
import java.util.*;

public class LinkHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("India", 200);
        map.put("US", 150);
        map.put("Canada", 100);


        System.out.println(map);

        HashMap<String , Integer> map2 = new HashMap<>();
        map2.put("India", 200);
        map2.put("US", 150);
        map2.put("Canada", 100);

        System.out.println(map2);

    }

}

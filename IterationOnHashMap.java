package HashMap;
import java.util.HashMap;
import java.util.Set;
public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India", 150);
        map.put("China", 210);
        map.put("Indonesia", 79);
        map.put("Nepal", 100);

        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("values = " + k + " , "  + "keys = " + map.get(k));
        }
    }
}

package HashMap;
import java.util.HashMap;
public class Basics {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        // put function
        map.put("India", 100);
        map.put("China", 150);
        map.put("Indonesia", 50);
        map.put("US", 60);

        System.out.println(map);

        // get function
        int population = map.get("India");
        System.out.println(population);

        // containsKey function
        System.out.println(map.containsKey("India")); //true
        System.out.println(map.containsKey("bharat")); //false

        map.remove("India");
        System.out.println(map);

        System.out.println(map.size());

        map.clear();
        System.out.println(map.size());


    }
}

package HashMap;
import java.util.*;


public class Treemap {
    public static void main(String[] args) {
       
        TreeMap<String, Integer> thm = new TreeMap<>();
        thm.put("India", 200);
        thm.put("China", 250);
        thm.put("Canada", 150);
        thm.put("Agra", 50);

        System.out.println(thm);
    }
}

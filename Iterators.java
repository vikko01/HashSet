package HashSet;
import java.util.*;
public class Iterators {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Mathura");
        hs.add("Bhopal");
        hs.add("Agra");
        System.out.println(hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Mathura");
        lhs.add("Bhopal");
        lhs.add("Agra");

        System.out.println(lhs);

        TreeSet<String> ths = new TreeSet<>();

        ths.add("Mathura");
        ths.add("Bhopal");
        ths.add("Agra");

        System.out.println(ths);




        // using Iterator function

        // Iterator<String> itr = lhs.iterator();
        // while(itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        // ussing enhanced for loop

        // for(String city : lhs) {
        //     System.out.println(city);
        // }
    }
}

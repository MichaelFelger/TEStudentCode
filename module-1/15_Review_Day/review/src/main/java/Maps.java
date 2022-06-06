import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("A", 1);
        myMap.put("B", 2);
        myMap.put("C", 3);

        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.printf("(%s, %s)\n", entry.getKey(), entry.getValue());
        }

        System.out.println("===========");
        for (String key : myMap.keySet()) {
            System.out.printf("(%s, %s)\n", key, myMap.get(key));
        }

        Integer myInt = 4;
        System.out.println(myInt.getClass());


    }

}

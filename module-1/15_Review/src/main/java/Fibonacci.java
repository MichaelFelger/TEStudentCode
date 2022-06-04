import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {

    }

    public static List<Integer> fibList(int nth) {
        List<Integer> results = new ArrayList<>();
        results.add(0);
        if (nth > 1) {
            results.add(1);
        }
        for (int i = 2; i < nth; i++) {
            results.add(results.get(i-1) + results.get(i-2));

        }
        return results;
    }


}

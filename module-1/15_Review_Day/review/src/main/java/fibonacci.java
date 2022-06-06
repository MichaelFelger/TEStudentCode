import java.util.ArrayList;
import java.util.List;

public class fibonacci {

    public static void main(String[] args) {
//        System.out.println(fibList(1));
//        System.out.println(fibList(2));
//        System.out.println(fibList(3));
//        System.out.println(fibList(9));
        fibr(5);
    }

    public static List<Integer> fibList(int nth) {
        List<Integer> results = new ArrayList<>();
        results.add(0);
        if (nth > 1) {
            results.add(1);
            for(int i = 2; i < nth; i++) {
                results.add(results.get(i-1) + results.get(i-2));
            }
        }
        return results;
    }

    public static int fibr(int nth) {
        System.out.println("fibr was called");
        if (nth == 1) return 0;
        if (nth == 2) return 1;

        return fibr(nth-1) + fibr(nth-2);
    }

}

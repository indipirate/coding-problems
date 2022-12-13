import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {

        Map<Integer, Long> req = a.stream().collect(Collectors.groupingBy(d -> d, HashMap::new, Collectors.counting()));

        return req.keySet().stream().filter(k -> req.get(k) == 1).findFirst().get();

    }

    public static void main(String[] args) {
        int lonely = lonelyinteger(Stream.of(1, 2, 3, 4, 11, 4, 3, 2, 1).collect(Collectors.toList()));
        System.out.println(lonely);
    }
}

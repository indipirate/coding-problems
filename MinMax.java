import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMax {


    public static void main(String[] args) {
        findMaxMin(Stream.of(256741038, 623958417, 467905213, 714532089, 938071625).collect(Collectors.toList()));
    }

    private static void findMaxMin(List<Integer> arr) {
        Long min = Long.MAX_VALUE;
        Long max = Long.MIN_VALUE;

        for (Integer value : Collections.unmodifiableList(arr)) {
            List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>(arr);
            copyOnWriteArrayList.remove(value);
            Long sum = copyOnWriteArrayList.stream().map(i -> i.longValue()).reduce(0l, (a, b) -> a + b);
            if (sum > max) {
                max = sum;
            }
            if (sum < min) {
                min = sum;
            }
        }
        System.out.println(min + " " + max);
    }
}

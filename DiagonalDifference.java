import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DiagonalDifference {

    public static void main(String[] args) {

        List<List<Integer>> input = Stream.of(
                Stream.of(1, 2, 3).collect(Collectors.toList()),
                Stream.of(4, 5, 6).collect(Collectors.toList()),
                Stream.of(9, 8, 9).collect(Collectors.toList())
        ).collect(Collectors.toList());
        int res = diagonalDifference(input);
        System.out.println(res); // 15 - 17
    }

    public static int diagonalDifference(List<List<Integer>> arr) {

        int rd = 0;
        int ld = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j) ld += arr.get(i).get(j);
                if (i + j == arr.size() - 1) rd += arr.get(i).get(j);
            }
        }
        return Math.abs(ld - rd);

    }
}

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class NoOfDoorsOpen {
    static int noOfOpenDoors(Long N) {
        // true closed, false open
//        Map<Long,Boolean> doors = new HashMap<>();
        List<Boolean> doors = LongStream.range(0, N ).mapToObj(x -> true).collect(Collectors.toList());
        System.out.println("Initial doors : "+ doors);
        for (int i = 1; i <= N; i++) {
            alterDoors(doors, i, 0, N);
        }
//       for(int i=1; i<=N; i++){
//            for(var e: doors.entrySet()){
//                if(e.getKey() % i == 0) e.setValue(!e.getValue());
//            }
//       }
        System.out.println(doors);
        return (int) doors.stream().filter(e -> !e).count();
    }

    private static void alterDoors(List<Boolean> doors, int iteration, int doorNumber, Long totalDoors) {
        System.out.println("iteration: "+ iteration + ",doorNumber: "+ doorNumber);
        if (doorNumber == totalDoors-1) return;

        alterDoors(doors,iteration,doorNumber+1,totalDoors);
        System.out.println("After recursion call: iteration: "+ iteration + ",doorNumber: "+ doorNumber);
        if (doorNumber % iteration == 0) doors.set(doorNumber, !doors.get(doorNumber));

    }

    public static void main(String[] args) {
        System.out.println(noOfOpenDoors(2l));
    }
}

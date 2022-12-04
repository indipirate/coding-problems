import java.util.Arrays;

public class SortIntegers {

    static int[] sort(int[] arr){
        System.out.println("Before sorting : ");
        print(arr);
        for(int i =0; i< arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] =  arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After sorting : ");
        print(arr);
        return arr;
    }

    static void print(int a[]){
        Arrays.stream(a).forEach(x -> System.out.print(x + ","));
        System.out.println();
    }

    public static void main(String[] args) {
        sort(new int[]{12,5,6,11});
    }
}

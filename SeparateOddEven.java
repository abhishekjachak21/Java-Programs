import java.util.*;
import java.util.stream.Collectors;

public class SeparateOddEven {
    public static void main(String[] args) {
        // Input list
        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 51);

        // Partitioning even and odd numbers
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        // Extract even and odd lists
        List<Integer> evenNumbers = partitioned.get(true);
        List<Integer> oddNumbers = partitioned.get(false);

        // Output
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}

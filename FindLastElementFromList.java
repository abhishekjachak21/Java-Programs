import java.util.*;

public class FindLastElementFromList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        if (names.isEmpty()) System.out.println("List is empty!");
        else {
            String last = names.get(names.size() - 1);
            System.out.println("Last element (normal way): " + last);
        }
    }
}

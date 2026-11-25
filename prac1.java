import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Create an immutable list (Java 9+)
public class prac1{
        public static void main(String[] args) {
                List<String> fruits = List.of("Apple", "Banana", "Avocado", "Cherry");

                // Filter items starting with "A" and convert to uppercase
                List<String> aFruits = fruits.stream()
                        .filter(f -> f.startsWith("A"))
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());

                // Convert a list into a Map (Key: Fruit Name, Value: Length)
                Map<String, Integer> fruitLengths = fruits.stream()
                        .collect(Collectors.toMap(fruit -> fruit, String::length));

                // Print the results
                System.out.println("Fruits starting with 'A' in uppercase: " + aFruits);
                System.out.println("Fruit lengths: " + fruitLengths);
        }
}




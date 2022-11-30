import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapNumber {
    static Map<String, Integer> numbers = new HashMap<>();

    public static void addNumbers(String key) {
        Random random = new Random();
        int randomInt = random.nextInt(1000);
        if (!numbers.containsKey(key) && !numbers.containsValue(randomInt)) {
            numbers.put(key, randomInt);
        } else {
            throw new IllegalArgumentException("Имеются совпадения");
        }
    }
    public static void numbersInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
            stringBuilder.append(entry.getKey()).append(" ---> ").append(entry.getValue()).append("\n");
        }
        System.out.println(stringBuilder);
    }
}

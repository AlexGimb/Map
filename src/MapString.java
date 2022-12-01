import java.util.*;

public class MapString {
    private static final Random RANDOM = new Random();
    private final Map<Integer, String> mapInt = new LinkedHashMap<>();

    public MapString() {
        for (int i = 0; i < 5; i++) {
            mapInt.put((i), "Test" + RANDOM.nextInt(1000));
        }
        System.out.println(mapInt.entrySet());
    }
}
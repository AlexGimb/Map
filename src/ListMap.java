import java.util.*;

public class ListMap {
    private static final Random RANDOM = new Random();
    private final Map<String, List<Integer>> listMap = new HashMap<>();

    public ListMap() {
        for (int i = 0; i < 5; i++) {
            listMap.put(String.valueOf(i), generateList());
        }
    }

    private List<Integer> generateList() {
        List<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listInt.add(RANDOM.nextInt(1000));
        }
        return listInt;
    }

    public Set<Map.Entry<String, List<Integer>>> getOriginalListMap() {
        return listMap.entrySet();
    }

    public Map<String, Integer> transform() {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : listMap.entrySet()) {
            int sum = 0;
            for (Integer number : entry.getValue()) {
                sum = number;
            }
            result.put(entry.getKey(), sum);
        }
        System.out.println(result.entrySet());
        return result;
    }

}

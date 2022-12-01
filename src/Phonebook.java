import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Phonebook {
    private static final HashMap<String,String> phonebooks = new HashMap<>();

    public static void bookInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : phonebooks.entrySet()) {
            stringBuilder.append(entry.getKey()).append(" - ").append(entry.getValue()).append("\n");
        }
        System.out.println(stringBuilder);
    }
    public HashMap<String, String> getPhonebooks() {
        return phonebooks;
    }


}

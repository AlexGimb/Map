import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Phonebook {
    private String name;
    private String number;
    static HashMap<String,String> phonebooks = new HashMap<>();

    public Phonebook(String name, String number) {
        this.name = name;
        this.number = number;
        phonebooks.put(name, number);
    }

    public static void bookInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : phonebooks.entrySet()) {
            stringBuilder.append(entry.getKey()).append(" - ").append(entry.getValue()).append("\n");
        }
        System.out.println(stringBuilder);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public HashMap<String, String> getPhonebooks() {
        return phonebooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phonebook phonebook = (Phonebook) o;
        return Objects.equals(number, phonebook.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}

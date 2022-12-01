public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.getPhonebooks().put("Жорик", "89257897865");
        phonebook.getPhonebooks().put("Димасик", "89257897224");
        phonebook.getPhonebooks().put("Юля", "89257897866");
        phonebook.getPhonebooks().put("Настя", "89257897817");
        phonebook.getPhonebooks().put("Аня", "89257897800");

        Phonebook.bookInfo();

        System.out.println("-------------------------------------------------------------------------------------");

        MapNumber.addNumbers("Первый");
        MapNumber.addNumbers("Второй");
        MapNumber.addNumbers("Третий");
        MapNumber.addNumbers("Четвертый");
        MapNumber.addNumbers("Пятый");
        MapNumber.addNumbers("Шестой");
        MapNumber.addNumbers("Седьмой");
        MapNumber.addNumbers("Восьмой");
        MapNumber.addNumbers("Девятый");
        MapNumber.addNumbers("Десятый");

        MapNumber.numbersInfo();

        System.out.println("-------------------------------------------------------------------------------------");

        ListMap listMap = new ListMap();
        listMap.transform();
        System.out.println();

        System.out.println("-------------------------------------------------------------------------------------");

        MapString mapString = new MapString();
    }
}
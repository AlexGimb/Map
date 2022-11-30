public class Main {
    public static void main(String[] args) {
        new Phonebook("Олег", "89147651223");
        new Phonebook("Михаил", "89147658222");
        new Phonebook("Анатолий", "89017651209");
        new Phonebook("Вова", "89017651233");
        new Phonebook("Андрюха", "89017651211");
        Phonebook.phonebooks.put("Жорик", "89257897865");
        Phonebook.phonebooks.put("Димасик", "89257897224");
        Phonebook.phonebooks.put("Юля", "89257897866");
        Phonebook.phonebooks.put("Настя", "89257897817");
        Phonebook.phonebooks.put("Аня", "89257897800");

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
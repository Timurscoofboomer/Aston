import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {

        if (phoneBook.get(lastName) == null) {
            phoneBook.put(lastName, new ArrayList<>());
        }
        phoneBook.get(lastName).add(phoneNumber);
    }

    public void get(String lastName) {

        ArrayList<String> phones = phoneBook.get(lastName);

        if (phones == null) {
            System.out.println(lastName);
            System.out.println("Нет в списке");
            return;
        }
        System.out.println(lastName);
        System.out.println(phones);
    }

    /* проверка

    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();

        book.add("Иванов", "111");
        book.add("Иванов", "222");
        book.add("Петров", "333");

        book.get("Иванов");
        book.get("Петров");
        book.get("Смирнов");

    }
*/
}


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sergjavacode.PhoneBook;
import ru.sergjavacode.PhoneBookEntry;

public class PhoneBookTest {
    static PhoneBook phoneBook = new PhoneBook();

    @BeforeAll
    public static void beforeAll() {
        Assertions.assertEquals(1, phoneBook.add("Коля", "26-25-26"));
        Assertions.assertEquals(2, phoneBook.add("Юля", "56-78-99"));
        Assertions.assertEquals(3, phoneBook.add("Катя", "26-29-26"));
    }


    @Test
    public void addTest() {
        Assertions.assertEquals(4, phoneBook.add("Толя", "56-98-26"));
        Assertions.assertEquals(5, phoneBook.add("Аня", "98-77-39"));
        Assertions.assertEquals(6, phoneBook.add("Тоня", "55-25-32"));
    }

    @Test
    public void findByNumberTest() {
        Assertions.assertTrue("Юля".equals(phoneBook.findByNumber("56-78-99")));
        Assertions.assertTrue("Катя".equals(phoneBook.findByNumber("26-29-26")));
        Assertions.assertTrue("Коля".equals(phoneBook.findByNumber("26-25-26")));
    }

    @Test
    public void findByNameTest(){
        Assertions.assertTrue("56-78-99".equals(phoneBook.findByName("Юля")));
        Assertions.assertTrue("26-29-26".equals(phoneBook.findByName("Катя")));
        Assertions.assertTrue("26-25-26".equals(phoneBook.findByName("Коля")));
    }
    @Test
    public void printAllNamesTest(){
        phoneBook.printAllNames().stream().forEach(System.out::println);
    }

}

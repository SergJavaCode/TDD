import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sergjavacode.PhoneBook;

public class PhoneBookTest {
    PhoneBook phoneBook=new PhoneBook();
    @Test
    public void addTest(){
        Assertions.assertEquals(1,phoneBook.add("Коля","26-25-26"));
        Assertions.assertEquals(2,phoneBook.add("Юля","56-78-99"));
        Assertions.assertEquals(2,phoneBook.add("Коля","26-29-26"));
    }

    @Test
    public void findByNumberTest(){
        Assertions.assertTrue("Юля".equals(phoneBook.findByNumber("56-78-99")));
        Assertions.assertTrue("Коля".equals(phoneBook.findByNumber("26-29-26")));
        Assertions.assertFalse("Коля".equals(phoneBook.findByNumber("26-25-26")));
    }

}

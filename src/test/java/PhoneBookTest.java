import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.sergjavacode.PhoneBook;

public class PhoneBookTest {
    @Test
    public void addTest(){
        PhoneBook phoneBook=new PhoneBook();
        Assertions.assertEquals(1,phoneBook.add("Коля","26-25-26"));
        Assertions.assertEquals(2,phoneBook.add("Юля","56-78-99"));
        Assertions.assertEquals(2,phoneBook.add("Коля","26-29-26"));
    }


}

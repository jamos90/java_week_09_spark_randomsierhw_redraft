import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    Person person;

    @Before
    public void setUp(){
        person = new Person();
        person.addNames("James");
        person.addNames("Alice");
        person.addNames("Jess");
        person.addNames("Kate");
    }

    @Test
    public void hasNames(){
        assertEquals(4,person.nameCount());
    }

    @Test
    public void canGetRandomName(){
        assertEquals("James", person.randomName());
    }

    @Test
    public void canGetTwoRandomNames(){
        assertEquals("James, Jess",person.twoRandomNames());
    }
}

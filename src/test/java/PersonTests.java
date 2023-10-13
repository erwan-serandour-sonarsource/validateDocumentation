import org.example.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTests {
  Person person;

  @BeforeEach
  void setUp(){
    person = new Person(24, "erwan");
  }

  @Test
  void testSayHello(){
    person.sayHello();
  }
}

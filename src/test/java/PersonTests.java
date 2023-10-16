import org.example.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

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

  @Test
  void testAge(){
    assertEquals(person.age(),24);
  }
}

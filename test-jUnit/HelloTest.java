import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloTest {
  @Test
  public void printsHello() {
    Hello hello = new Hello();
    assertEquals("Hello World!", hello.greet("Hello World!"));
  }
}

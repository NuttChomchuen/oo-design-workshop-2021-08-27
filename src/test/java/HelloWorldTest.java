import HelloWorld.HelloWorld;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloNuttaporn(){
        HelloWorld helloWorld = new HelloWorld();

        String actualResult = helloWorld.greeting("Nuttaporn");

        assertEquals("Hello Nuttaporn", actualResult);
    }
}

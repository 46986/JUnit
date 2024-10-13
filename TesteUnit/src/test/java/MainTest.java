import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void somaTest() {
        int actualValue = 2+2;
        Main main = new Main();
        int expectedValue = main.soma(2, 2);
        assertEquals(actualValue, expectedValue);
    }
}
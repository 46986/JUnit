import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AnnotationTest {
    private ArrayList<String> testList;

    @BeforeAll
    public static void onceExecutedBeforeAll() {
        System.out.println("@BeforeAll: onceExecutedBeforeAll");
    }

    @BeforeEach
    public void executedBeforeEach() {
        testList = new ArrayList<>();
        System.out.println("@BeforeEach: executedBeforeEach");
    }

    @AfterAll
    public static void onceExecutedAfterAll() {
        System.out.println("@AfterAll: onceExecutedAfterAll");
    }

    @AfterEach
    public void executedAfterEach() {
        testList.clear();
        System.out.println("@AfterEach: executedAfterEach");
    }

    @Test
    public void OneItemCollection() {
        testList.add("oneItem");
        assertEquals(1, testList.size());
        System.out.println("@Test: OneItemCollection");
    }

    @Test
    public void EmptyCollection() {
        assertTrue(testList.isEmpty());
        System.out.println("@Test: EmptyCollection");
    }
}
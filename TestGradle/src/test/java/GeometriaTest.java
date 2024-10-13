import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Geometria;
import org.junit.jupiter.api.Test;

public class GeometriaTest {

    private final Geometria geometria = new Geometria();

    @Test
    public void testAreaCaso1() {
        assertEquals(15, geometria.area(3, 5));
    }

    @Test
    public void testPerimetroCaso1() {
        assertEquals(16, geometria.perimetro(3, 5));
    }

    @Test
    public void testAreaCaso2() {
        assertEquals(40, geometria.area(5, 8));
    }

    @Test
    public void testPerimetroCaso2() {
        assertEquals(26, geometria.perimetro(5, 8));
    }

    @Test
    public void testAreaCaso3() {
        assertEquals(8, geometria.area(2, 4));
    }

    @Test
    public void testPerimetroCaso3() {
        assertEquals(12, geometria.perimetro(2, 4));
    }

    @Test
    public void testIsTrianglePossivel() {
        assertEquals(1, geometria.isTriangle(3, 4, 5));
    }

    @Test
    public void testIsTriangleImpossivel() {
        assertEquals(0, geometria.isTriangle(1, 2, 3)); // Lados que não formam um triângulo
    }
}
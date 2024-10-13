import org.example.Media;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MediaTest {
    private Media media;

    @BeforeEach
    public void setup() {
        media = new Media();
    }

    @Test
    public void testMediaDigitosComUmNumeroPositivo() {
        assertEquals(4.0, media.mediaDigitos(1234), 0.001);
    }

    @Test
    public void testMediaDigitosComUmNumeroNegativo() {
        assertEquals(4.0, media.mediaDigitos(-1234), 0.001);
    }

    @Test
    public void testMediaDigitosComUmNumeroDeUmDigito() {
        assertEquals(5.0, media.mediaDigitos(5), 0.001);
    }

    @Test
    public void testMediaDigitosComNumeroZero() {
        assertEquals(0.0, media.mediaDigitos(0), 0.001);
    }

    @Test
    public void testMediaDigitosComUmNumeroGrande() {
        assertEquals(3.0, media.mediaDigitos(123456789), 0.001);
    }
}
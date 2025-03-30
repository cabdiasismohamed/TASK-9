package conversion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @BeforeEach
    void setUp() {
        assertEquals(85.0, Converter.convert("USD", "EUR", 100), 0.01);
    }

    @AfterEach
    void tearDown() {
        assertEquals(85.0, Converter.convert("USD", "EUR", 100), 0.01);
    }

  
}
package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {
    GasMileage gasMileage;

    @BeforeEach
    void setUp(){
        gasMileage = new GasMileage();
    }

    @Test
    void testThatWeHaveCreatedGasMileage(){
        assertNotNull(gasMileage);
    }



}
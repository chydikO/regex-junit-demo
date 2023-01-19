package org.itstep;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathLibTest {

    @Test
    void testAdd() {
        int actual = MathLib.add(2, 3);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

}

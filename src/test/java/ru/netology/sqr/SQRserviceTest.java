package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SQRserviceTest {
    @Test
    public void shouldcalc() {
        SQRservice service= new SQRservice();
        int actual = service.calculate(200,300);
        int expected = 3;
        assertEquals(expected, actual);}
}

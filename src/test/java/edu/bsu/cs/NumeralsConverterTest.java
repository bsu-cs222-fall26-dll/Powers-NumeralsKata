package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumeralsConverterTest {
    @Test
    public void goodnumbersTest(){
        NumeralsConverter numeraltest= new NumeralsConverter();
        String numeral=numeraltest.converttoNumerals(3000);
        Assertions.assertEquals("MMM",numeral);

    }
}

package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumeralsConverterTest {
    @Test
    public void goodnumber3000Test(){
        NumeralsConverter numeraltest= new NumeralsConverter();
        String numeral=numeraltest.converttoNumerals(3000);
        Assertions.assertEquals("MMM",numeral);
    }
    @Test
    public void goodnumber1234Test(){
        NumeralsConverter numeraltest= new NumeralsConverter();
        String numeral=numeraltest.converttoNumerals(1234);
        Assertions.assertEquals("MCCXXXIV",numeral);
    }
    @Test
    public void goodnumber2479Test(){
        NumeralsConverter numeraltest= new NumeralsConverter();
        String numeral=numeraltest.converttoNumerals(2479);
        Assertions.assertEquals("MMCDLXXIX",numeral);
    }
}

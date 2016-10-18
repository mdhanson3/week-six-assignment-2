package com.daehosting.temperatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by student on 10/11/16.
 */
public class TemperatureConversionsTest {


    @org.junit.Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("The celsius to Fahrenheit conversion failed", celsiusToFahrenheitResult, BigDecimal.valueOf(32));
    }

    @org.junit.Test
    public void getTemperatureConversionsFtoC() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals("The Fahrenheit to Celsius conversion failed", fahrenheitToCelsiusResult, BigDecimal.valueOf(0));
    }

    @org.junit.Test
    public void getWindChillInCelsius() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillInCelsiusResult = service.windChillInCelsius(BigDecimal.valueOf(0), BigDecimal.valueOf(5));
        assertEquals("The Fahrenheit to Celsius conversion failed", BigDecimal.valueOf(-4.09), windChillInCelsiusResult );
    }

}
/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @version 2013.10.06
 * Unit Testing Temperature class
 */

import org.junit.* ;
import static org.junit.Assert.* ;

public class TemperatureTest {

  // Add multiple tests to check all functions of
  // {@Code Temperature} class.

  @Test
  //Test cases for getUnits()
  public void testGetUnits() {
    
    //test case for Celcius
    System.out.println("Testing if getUnits() gets the correct value for Celcius... ");
    Temperature celciusTestCase = new Temperature(15, Temperature.CELCIUS);
    assertTrue(celciusTestCase.getUnits() == Temperature.CELCIUS);
    Temperature celciusTestCase2 = new Temperature(celciusTestCase);
    assertTrue(celciusTestCase2.getUnits() == Temperature.CELCIUS);
    
    //test case for Fahrenheit
    System.out.println("Testing if getUnits() gets the correct value for Fahrenheit... ");
    Temperature fahrenheitTestCase = new Temperature(15, Temperature.FAHRENHEIT);
    assertTrue(fahrenheitTestCase.getUnits() == Temperature.FAHRENHEIT);
    Temperature fahrenheitTestCase2 = new Temperature(fahrenheitTestCase);
    assertTrue(fahrenheitTestCase2.getUnits() == Temperature.FAHRENHEIT);
    
    //test case for Kelvin
    System.out.println("Testing if getUnits() gets the correct value for Kelvin... ");
    Temperature kelvinTestCase = new Temperature(15, Temperature.KELVIN);
    assertTrue(kelvinTestCase.getUnits() == Temperature.KELVIN);
    Temperature kelvinTestCase2 = new Temperature(kelvinTestCase);
    assertTrue(kelvinTestCase2.getUnits() == Temperature.KELVIN);
    
  }

  @Test
  //Test cases for getValue() in Celcius
  public void testGetValueCelcius() {
  
    //nominal test case in Celcius
    System.out.println("Testing if getValue gets the correct value for a nominal case using Celcius... ");
    Temperature nominalTestCase = new Temperature(15, Temperature.CELSIUS);
    assertTrue(nominalTestCase.getValue() == 15);
    Temperature nominalTestCase2 = new Temperature(nominalTestCase);
    assertTrue(nominalTestCase2.getValue() == 15);
   
    //negative test case in Celcius
    System.out.println("Testing if getValue gets the correct value for a negative case using Celcius... ");
    Temperature negativeTestCase = new Temperature(-15, Temperature.CELSIUS);
    assertTrue(negativeTestCase.getValue() == -15);
    Temperature negativeTestCase2 = new Temperature(negativeTestCase);
    assertTrue(negativeTestCase2.getValue() == -15);
   
    //zero value test case in Celcius
    System.out.println("Testing if getValue gets the correct value for a zero value case using Celcius... ");
    Temperature zeroTestCase = new Temperature(0, Temperature.CELSIUS);
    assertTrue(zeroTestCase.getValue() == 0);
    Temperature zeroTestCase2 = new Temperature(zeroTestCase);
    assertTrue(zeroTestCase2.getValue() == 0);
   
    //max double value test case in Celcius
    System.out.println("Testing if getValue gets the correct value for a max double value case using Celcius... ");
    Temperature maxDoubleTestCase = new Temperature(Double.MAX_VALUE, Temperature.CELSIUS);
    assertTrue(maxDoubleTestCase.getValue() == Double.MAX_VALUE);
    Temperature maxDoubleTestCase2 = new Temperature(maxDoubleTestCase);
    assertTrue(maxDoubleTestCase2.getValue() == Double.MAX_VALUE);
    
    //min double value test case in Celcius
    System.out.println("Testing if getValue gets the correct value for a min double value case using Celcius... ");
    Temperature minDoubleTestCase = new Temperature(Double.MIN_VALUE, Temperature.CELSIUS);
    assertTrue(minDoubleTestCase.getValue() == Double.MIN_VALUE);
    Temperature minDoubleTestCase2 = new Temperature(minDoubleTestCase);
    assertTrue(minDoubleTestCase2.getValue() == Double.MIN_VALUE);
    
  }

  @Test
  //Test cases for changeUnits()
  //check if we need to test getValue as well as getUnit() (should be automatic)
  //maybe change lines to check for both constructors
  public void testChangeUnits() {
    
    //test for changing between Celcius and Kelvin
    System.out.println("Testing if changeUnits() changes correctly between Celcius and Kelvin... ");
    Temperature cToKTestCase = new Temperature(15, Temperature.CELCIUS);
    cToKTestCase.changeUnits(Temperature.KELVIN);
    assertTrue(cToKTestCase.getUnits() == Temperature.KELVIN /*&& cToKTestCase.getValue() == */);
    Temperature cToKTestCase2 = new Temperature(cToKTestValue);
    assertTrue(cToKTestCase2.getUnits() == Temperature.KELVIN /*&& cToKTestCase.getValue() == */);''
    
    //test for changing between Celcius and Fahrenheit
    System.out.println("Testing if changeUnits() changes correctly between Celcius and Fahrenheit... ");
    Temperature cToFTestCase = new Temperature(15, Temperature.CELCIUS);
    cToFTestCase.changeUnits(Temperature.FAHRENHEIT);
    assertTrue(cToFTestCase.getUnits() == Temperature.FAHRENHEIT /*&& cToFTestCase.getValue() == */);
    Temperature cToFTestCase2 = new Temperature(cToFTestValue);
    assertTrue(cToFTestCase2.getUnits() == Temperature.FAHRENHEIT /*&& cToFTestCase.getValue() == */);
    
    //test for changing between Kelvin and Fahrenheit
    System.out.println("Testing if changeUnits() changes correctly between Kelvin and Fahrenheit... ");
    Temperature kToFTestCase = new Temperature(15, Temperature.KELVIN);
    kToFTestCase.changeUnits(Temperature.FAHRENHEIT);
    assertTrue(kToFTestCase.getUnits() == Temperature.FAHRENHEIT /*&& kToFTestCase.getValue() == */);
    Temperature kToFTestCase2 = new Temperature(kToFTestValue);
    assertTrue(kToFTestCase2.getUnits() == Temperature.FAHRENHEIT /*&& kToFTestCase.getValue() == */);
    
    //test for changing between Kelvin and Celcius
    System.out.println("Testing if changeUnits() changes correctly between Kelvin and Celsius... ");
    Temperature kToCTestCase = new Temperature(15, Temperature.KELVIN);
    kToCTestCase.changeUnits(Temperature.CELCIUS);
    assertTrue(kToCTestCase.getUnits() == Temperature.CELCIUS /*&& kToCTestCase.getValue() == */);
    Temperature kToCTestCase2 = new Temperature(kToCTestValue);
    assertTrue(kToCTestCase2.getUnits() == Temperature.CELCIUS /*&& kToCTestCase.getValue() == */);
    
    //test for changing between Fahrenheit and Kelvin
    System.out.println("Testing if changeUnits() changes correctly between Fahrenheit and Kelvin... ");
    Temperature fToKTestCase = new Temperature(15, Temperature.FAHRENHEIT);
    fToKTestCase.changeUnits(Temperature.KELVIN);
    assertTrue(fToKTestCase.getUnits() == Temperature.KELVIN /*&& fToKTestCase.getValue() == */);
    Temperature fToKTestCase2 = new Temperature(fToKTestValue);
    assertTrue(fToKTestCase2.getUnits() == Temperature.KELVIN /*&& fToKTestCase.getValue() == */);
    
    //test for changing between Fahrenheit and Celcius
    System.out.println("Testing if changeUnits() changes correctly between Fahrenheit and Celsius... ");
    Temperature fToCTestCase = new Temperature(15, Temperature.FAHRENHEIT);
    fToCTestCase.changeUnits(Temperature.CELSIUS);
    assertTrue(fToCTestCase.getUnits() == Temperature.CELCIUS /*&& fToCTestCase.getValue() == */);
    Temperature fToCTestCase2 = new Temperature(fToCTestValue);
    assertTrue(fToCTestCase2.getUnits() == Temperature.CELCIUS /*&& fToCTestCase.getValue() == */);
    
  }
}

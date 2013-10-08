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
  //Test cases for getValue() in Celcius
  public void testGetValueCelcius(){
    //nominal test case in Celcius
    System.out.println("Testing if getValue gets the correct value for a nominal case using Celcius... ");
    Temperature nominalTestCase = new Temperature (15, Temperature.CELSIUS);
    assertTrue(nominalTestCase.getValue() == 15);
    Temperature nominalTestCase2 = new Temperature(nominalTestCase);
    assertTrue(nominalTestCase2.getValue() == 15);
    //negative test case in Celcius
    System.out.println("Testing if getValue gets the correct value for a negative case using Celcius... ");
    Temperature negativeTestCase = new Temperature (-15, Temperature.CELSIUS);
    assertTrue(negativeTestCase.getValue() == -15);
    Temperature negativeTestCase2 = new Temperature(negativeTestCase);
    assertTrue(negativeTestCase2.getValue() == -15);
    //zero value test case in Celcius
    System.out.println("Testing if getValue gets the correct value for a zero value case using Celcius... ");
    Temperature zeroTestCase = new Temperature (0, Temperature.CELSIUS);
    assertTrue(zeroTestCase.getValue() == 0);
    Temperature zeroTestCase2 = new Temperature(zeroTestCase);
    assertTrue(zeroTestCase2.getValue() == 0);
  }

  //@Test
  //public void .... (){
    
  //}
}

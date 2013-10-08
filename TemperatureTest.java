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
  public void testGetValue(){
    //nominal test case
     System.out.println("Testing if getValue gets the correct value... ");
     Temperature nominalTestCase = new Temperature (15, Temperature.CELSIUS);
     assertTrue(nominalTestCase.getValue() == 15);
     Temperature nominalTestCaseConverted = new Temperature(nominalTestCase);
     assertTrue(nominalTestCaseConverted.getValue() == 15);
  }

  //@Test
  //public void .... (){
    
  //}
}

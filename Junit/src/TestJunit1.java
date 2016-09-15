
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sheldon
 */
public class TestJunit1 {
    
   String message = "Robert";	
   Calculator calculator = new Calculator();
   
   
   @Test
   public void testPrintMSG() {
      System.out.println("Inside testPrintMSG()");
      assertEquals(message,calculator.printMSG());
   }
}

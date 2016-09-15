import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit2 {

   int a = 24;
   int b = 6;
   Calculator calculator = new Calculator();
 
   @Test
   public void testAdd() {
      System.out.println("Inside testAdd()");
      assertEquals(message,messageUtil.salutationMessage());
   }
}
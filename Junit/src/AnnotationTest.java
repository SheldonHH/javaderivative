
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest {

    @Test
    public void testAdd() {
        fail("Not yet implemented");
    }

    @Test
    public void testSubstract() {
        fail("Not yet implemented");
    }

    @Test
    public void testMultiply() {
        fail("Not yet implemented");
    }

    @Test(expected = ArithmeticException.class)
    public void testDivide() {
        assertEquals(4, new Calculator().divide(2, 0));
    }

    @Test(timeout = 2000)
    public void testWhile() {
        while(true) {
            System.out.println("run forever");
        }
    }

    @Ignore
    @Test(timeout = 3000)
    public void testReadFile() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

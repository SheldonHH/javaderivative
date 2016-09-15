import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;

public class ErrorAndFailureTest {

    @Test
    public void testAdd() {
        assertEquals(5, new Calculator().add(3, 3));
    }

    @Test
    public void testSubstract() {
        fail("Not yet implemented");
    }

    @Test
    public void testMultiply() {
        fail("Not yet implemented");
    }

    @Test
    public void testDivide() {
        assertEquals(3, new Calculator().divide(6, 0));
    }

}

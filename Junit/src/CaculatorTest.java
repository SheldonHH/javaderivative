
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;

public class CaculatorTest {

    @Test
    public void test() {
        fail("Not yet implemented");
    }

    @Test
    public void testAdd() {
        assertEquals(6, new Calculator().add(3, 3));
    }

    @Test
    public void testSubstract() {
        assertEquals(2, new Calculator().substract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(4, new Calculator().multiply(2, 2));
    }

    @Test
    public void testDivlide() {
        assertEquals(4, new Calculator().multiply(2, 2));
    }

}

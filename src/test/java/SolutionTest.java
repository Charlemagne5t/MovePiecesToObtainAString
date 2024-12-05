import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        String start = "_L__R__R_";
        String target = "L______RR";

        Assert.assertTrue(new Solution().canChange(start, target));
    }
}

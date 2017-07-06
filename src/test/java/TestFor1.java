

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by user on 2017/6/29.
 */
public class TestFor1 {
    @Test
    public void testcase1(){
        Assert.assertTrue(false);
        System.out.println("testcase1");
    }
    @Test
    public void testcase2(){
        Assert.assertTrue(true);
        System.out.println("testcase1");
    }
}

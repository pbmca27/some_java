//package hello;

import org.junit.Test;

import static org.junit.Assert.fail;

public class hellotest {

    @Test
    public void testNothing() {
	pass("hello pratyay");
    }


    @Test
    public void testWillAlwaysFail() {
        fail("An error message");
    }


}

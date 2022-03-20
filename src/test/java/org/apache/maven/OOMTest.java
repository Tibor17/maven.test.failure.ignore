package org.apache.maven;

import org.junit.Test;

import static java.lang.Thread.sleep;

public class OOMTest {
    @Test
    public void test() throws Exception {
        if (Boolean.getBoolean("failTests")) {
            org.junit.Assert.fail();
        }

        for (int i = 0; i < 128; i++) {
            Singleton.getInstance().addNewArray();
            System.out.println(i);
            sleep( 10L );
        }
    }
}

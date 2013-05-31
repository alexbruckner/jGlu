package jGlu;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * User: alexb
 * Date: 31/05/13
 * Time: 12:49
 */
public class JGluTest {

    @Test
    public void checkJGluClassInClassPath() {
        String className = "jGlu.JGlu";
        Class<?> jGluClass = null;
        try {
            jGluClass = Class.forName(className);
        } catch (ClassNotFoundException e) {
            // ignore
        }
        Assert.assertNotNull(jGluClass, String.format("Expected %s to be in the classpath%n", className));
    }

}

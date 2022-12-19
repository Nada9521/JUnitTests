package JUnitTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTest {
    /**
     * 1-Condition on Operating system
     * 2-Condition on particular JRE
     **/
    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void conditionalOnWindows() //Si je mets .MAC ça marche pas
    {
        System.out.println("Execute this test only in WINDOWS machine");

    }
    @Test
    @EnabledOnJre(JRE.JAVA_19)
    public void conditionalOnJRE()
    {
        System.out.println("Execute this test only for Java 17");

    }
}

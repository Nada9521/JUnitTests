package JUnitTests;

import JUnitClasses.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssertionsTest {
    Calculator calc;

    @BeforeEach
    public void init() {
        calc = new Calculator();
    }

    @Test
    public void asserEqualsTest() {
        int sum = calc.add(2, 2);
        Assertions.assertEquals(4, sum, "Test failed as expected value is not equal to actual value");

    }

    @Test
    public void asserNotEqualsTest() {
        int sum = calc.add(2, 2);
        Assertions.assertNotEquals(8,sum,"Test failed as expected value is not equal to actual value");
    }
    @Test
    public void asserArrayEqualsTest() {
        Assertions.assertArrayEquals(new int[] {1,2,3},new int[] {1,2,3});
    }
    @Test
    public void asserNullTest() {
        String nullString=null;
        String notnullString="junit5";
        //Assertions.assertNull(notnullString);
        Assertions.assertNotNull(notnullString);
    }
    @Test
    public void asserTrueTest() {
        Boolean truevalue=true;
        boolean falsevalue=false;
        Assertions.assertTrue(truevalue);

    }
    @Test
    public void FalseTest() {
        Boolean truevalue=true;
        boolean falsevalue=false;
        Assertions.assertFalse(falsevalue);
    }
}

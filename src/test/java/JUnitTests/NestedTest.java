package JUnitTests;

import JUnitClasses.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTest {

    Calculator calc;
    @BeforeEach
    public  void init()
    {
        calc=new Calculator();
    }
    @Nested
    class addPostiveNumbers
    {
        @Test
        public void addSmallPositiveNumbers()
        {
            int sum=calc.add(2,3);
            System.out.println(sum);
        }
        @Test
        public void addBigPositiveNumbers()
        {
            int sum=calc.add(2000,3000);
            System.out.println(sum);
        }
    }
    @Nested
    class addNegativeNumbers
    {
        @Test
        public void addSmallNegativeNumbers()
        {
            int sum=calc.add(-2,-3);
            System.out.println(sum);
        }
        @Test
        public void addBigNegativeNumbers()
        {
            int sum=calc.add(-2000,-5000);
            System.out.println(sum);
        }
    }
    @Nested
    class addZeroNumbers
    {
        @Test
        public void addPositiveZeroNumbers()
        {
            int sum=calc.add(0,0);
            System.out.println(sum);
        }
        @Test
        public void addNegativeZeroNumbers()
        {
            int sum=calc.add(-0,-0);
            System.out.println(sum);
        }
    }

}

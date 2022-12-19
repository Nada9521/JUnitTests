package JUnitTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeoutsTest {
    @Test
    @Timeout(5000)
    //fail car 5<5000
    public void timeoutTest() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Test Passes with in the time");
    }
    @Test
    @Timeout(5)
    public void timeoutTest1() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Test Passes with in the time");
    }
    @Test

    public void timeoutTest2() throws InterruptedException {

        System.out.println("Test Passes with in the time");
        //dans ce cas fail executiontime>duraction
        Assertions.assertTimeout(Duration.ofSeconds(5),  ()->delaySeconds(6));
    }
    private void delaySeconds(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

}

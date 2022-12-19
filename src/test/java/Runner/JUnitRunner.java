package Runner;
import JUnitTests.AssertionsTest;
import JUnitTests.NestedTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
@RunWith(JUnitPlatform.class)
//@SelectPackages("JUnit5Tests")
//@SelectClasses({AnnotationsTest.class})
@SelectClasses({AssertionsTest.class, NestedTest.class})
public class JUnitRunner {

}


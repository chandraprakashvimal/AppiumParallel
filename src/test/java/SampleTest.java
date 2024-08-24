import org.testng.annotations.Test;
import pageEvents.CalculatorEvents;

public class SampleTest extends BaseTest {

    @Test
    public void myFirstTest() throws InterruptedException {
        CalculatorEvents calculatorEvents = new CalculatorEvents(getDriver());
        calculatorEvents.firstMethod();
    }
}

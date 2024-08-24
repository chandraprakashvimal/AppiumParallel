import org.testng.annotations.Test;
import pageEvents.CalculatorEvents;

public class SampleTest2 extends BaseTest {

    @Test
    public void mySecondTest() throws InterruptedException {
        CalculatorEvents calculatorEvents = new CalculatorEvents(getDriver());
        calculatorEvents.secondMethod();
    }
}

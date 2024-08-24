import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public ThreadLocal<AndroidDriver> driver = new ThreadLocal<>();

    public AndroidDriver getDriver() {
        return this.driver.get();
    }

    public void setDriver(AndroidDriver driver) {
        this.driver.set(driver);
    }

    @BeforeMethod
    @Parameters({"deviceName", "platformVersion", "portNumber"})
    public void initiateDriver(String deviceName, String platformVersion, String portNumber) throws MalformedURLException {
        System.out.println("Thread id:"+Thread.currentThread().getId());
        System.out.println("Thread name:"+Thread.currentThread().getName());
        startAppiumServer(portNumber);
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setPlatformVersion(platformVersion);
        options.setDeviceName(deviceName);
        options.setAutomationName("UiAutomator2");
        options.setAppActivity("com.android.calculator2.Calculator");
        options.setAppPackage("com.android.calculator2");
        setDriver(new AndroidDriver(new URL("http://127.0.0.1:"+portNumber), options));

    }

    public void startAppiumServer(String portNumber){
        AppiumDriverLocalService service;
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1");
        builder.usingPort(Integer.parseInt(portNumber));
        service=AppiumDriverLocalService.buildService(builder);
        service.start();
        System.out.println("Server is started");
    }

    @AfterMethod
    public void afterM(){
        getDriver().quit();

    }
}

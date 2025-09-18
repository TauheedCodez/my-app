import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp6 {
	
	public static void main(String args[])
    {
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\TAUHEED\\Desktop\\chromedriver-win64\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Launch Website
        driver.get("https://www.linkedin.com/in/tauheed-siddiqui-b098b931b/");
    }
}
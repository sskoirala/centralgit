import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Facebook login page
        driver.get("https://www.facebook.com/");

        // Enter email/phone and password
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("your_email_or_phone");
        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys("your_password");
        passwordInput.submit();

        // Wait for the login process to complete
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Verify that the login was successful by checking the page title
        String pageTitle = driver.getTitle();
        if (pageTitle.equals("Facebook")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed.");
        }

        // Close the browser
        driver.quit();
    }
}

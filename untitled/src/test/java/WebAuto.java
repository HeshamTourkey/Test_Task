import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

    public class WebAuto {
        public String product_locator = "//img[@alt='Combination Pliers']";
        public String AddToCart_Locator = "//button[@data-test='add-to-cart']";
        public String Cart_Locator = "//a[@data-test='nav-cart']";
        public String ProceedToCheckOut_Locator = "//button[@data-test='proceed-1']";
        public String loginEmail_Locator = "//input[@data-test='email']";
        public String loginPassword_Locator = "//input[@data-test='password']";

        public String Email = "tou8ki@gmail.com";
        public  String Password = "123456789";

        @Test
        public void open_chrome (){
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://practicesoftwaretesting.com");
            driver.findElement(By.xpath(product_locator)).click();
            driver.findElement(By.xpath(AddToCart_Locator)).click();
            driver.findElement(By.xpath(Cart_Locator)).click();
            driver.findElement(By.xpath(ProceedToCheckOut_Locator)).click();
            driver.findElement(By.xpath(loginEmail_Locator)).sendKeys(Email);
            driver.findElement(By.xpath(loginPassword_Locator)).sendKeys(Password);



            driver.close();


        }
    }

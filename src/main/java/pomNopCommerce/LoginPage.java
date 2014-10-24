package pomNopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void userCanLoginWithValidCredentials(String email, String password) {
        driver.findElement(By.className("ico-login")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("Email")).sendKeys("email");
        driver.findElement(By.id("Password")).sendKeys(" password");
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[1]")).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

}
   /* public void ForgotPassword(String email) {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[4]")).click();
        driver.findElement(By.id("email")).sendKeys("email");
        driver.findElement(By.name("send-email")).click();

*/















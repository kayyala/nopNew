package pomNopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by lenovo on 23/10/2014.
 */
public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    //user can register with mandatory fields
    // public void gotoRegister(String firstName, String lastName, String email, String password, String confirmPassword) {
    public void gotoRegister(){
        driver.findElement(By.xpath("")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("thasli");
        driver.findElement(By.id("LastName")).sendKeys("maheen");
        driver.findElement(By.name("Email")).sendKeys("thaslimaheen@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("hello1");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("hello1");
        driver.findElement(By.id("register-button")).click();
    }
    public void clickOnContinue(){
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).click();
    }
}



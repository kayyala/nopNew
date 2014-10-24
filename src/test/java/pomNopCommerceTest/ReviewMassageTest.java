package pomNopCommerceTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pomNopCommerce.*;

import java.util.concurrent.TimeUnit;

public class ReviewMassageTest {
    protected WebDriver driver;

@Before
    public void openBrowser(){driver= new FirefoxDriver();

    driver.get("http://demo.nopcommerce.com/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();

}

@After
    public void stopBrowser(){
    driver.quit();

}

 @Test
    public void verifyReviewMessage() {

     RegisterPage reg = new RegisterPage(driver);
     reg.gotoRegister();
    // reg.clickOnContinue();
     Assert.assertEquals(driver.findElement(By.tagName("body")).getText(), "Welcome, Please Sign In!");


     LoginPage login = new LoginPage(driver);
     login.userCanLoginWithValidCredentials("thaslimaheen@gmail.com","Hello1");

     HomePage home = new HomePage(driver);
     home.gotoBookPage();

     BookPage books = new BookPage(driver);
     books.selectProduct();
     books.gotoProductDetailsPage();

     ProductDetailsPage details = new ProductDetailsPage(driver);
     details.gotoAddReview();
     details.gotoProductReviewPage();

     ProductReviewPage review = new ProductReviewPage(driver);
     review.enterReviewDetails();
     review.submitReview();
     review.gotoReviewResultPage();

     ReviewResultPage result = new ReviewResultPage(driver);
     result.getMessage();


}






    }


package pomNopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductReviewPage extends BasePage {

    public ProductReviewPage(WebDriver driver) {
        super(driver);
    }

    public void enterReviewDetails() {
        driver.findElement(By.id("AddProductReview_Title")).sendKeys("Thasli");
        driver.findElement(By.id("AddProductReview_ReviewText")).sendKeys("This book is very useful");
       // driver.findElement(By.id("addproductrating_4")).click();
        driver.findElement(By.xpath("//*[@id=\"review-form\"]/form/div[3]/input")).click();
    }

    public void submitReview() {
        driver.findElement(By.xpath("//*[@id=\"review-form\"]/form/div[3]/input")).click();
    }
    public ReviewResultPage gotoReviewResultPage(){
        return new ReviewResultPage(driver);
    }

}

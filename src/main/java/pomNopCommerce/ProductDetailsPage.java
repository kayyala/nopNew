package pomNopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage  extends BasePage{


    public ProductDetailsPage (WebDriver driver){

        super(driver);
    }


    public void gotoAddReview(){
        driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[5]/div[2]/a[1]")).click();
    }
    public ProductReviewPage gotoProductReviewPage(){
        return new ProductReviewPage(driver);
    }
}

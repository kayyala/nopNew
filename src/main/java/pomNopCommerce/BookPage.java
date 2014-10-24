package pomNopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BookPage extends BasePage {


    public BookPage(WebDriver driver) {
        super(driver);
    }

public void selectProduct(){ driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[2]")).click();}

public ProductDetailsPage gotoProductDetailsPage(){return new ProductDetailsPage(driver);
}}
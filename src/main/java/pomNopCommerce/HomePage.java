package pomNopCommerce;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public  HomePage (WebDriver driver){
        super(driver);
    }

    public BookPage gotoBookPage(){
        return new BookPage(driver);

    }

}

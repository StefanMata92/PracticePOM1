package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage {

    public PracticePage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;
    WebElement goToLoginPage;


    public WebElement getGoToLoginPage() {
        return driver.findElement(By.linkText("Test Login Page"));
    }

    // ----------------------

    public void ClickOnLoginPage () {
        getGoToLoginPage().click();
    }

}

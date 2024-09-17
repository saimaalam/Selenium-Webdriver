package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePasswordButton= By.id("form_submit");
    public ForgotPasswordPage(WebDriver driver){
        this.driver=driver;
    }
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void clickRetrievePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
    }
}

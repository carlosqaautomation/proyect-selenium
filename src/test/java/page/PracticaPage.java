package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticaPage extends BasePage{

    @FindBy(id = "user-name")
    public WebElement txtUserName;
    @FindBy(id = "password")
    public WebElement txtPassword;
    @FindBy(id = "login-button")
    public WebElement btnLogin;
    public PracticaPage() {
        super(driver);
    }
    public void writeUserName(String text){
        writeToElememt(txtUserName,text);
    }
    public void writePassword(String text){
        writeToElememt(txtPassword,text);
    }
    public void clickLogin(){
        clickElement(btnLogin);
    }
}

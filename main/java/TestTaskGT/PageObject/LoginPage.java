package TestTaskGT.PageObject;

import org.openqa.selenium.By;

import static DriverUtills.Utills.getDriver;

/**
 * Created by ihor on 04.01.17.
 */
public class LoginPage {
    private By userEMail=By.id("userEmail");
    private By userPass=By.id("userPass");
    private By rememberMe=By.cssSelector("label[class=\"icon f_checkbox inlblk vtop selected\"]");
    private By logInButton=By.id("se_userLogin");


    public void eMailInput(String eMail){
        getDriver().findElement(userEMail).sendKeys(eMail);
    }

    public void passwordInput(String pass){
        getDriver().findElement(userPass).sendKeys(pass);
    }

    public void checkRememberMe(){
        getDriver().findElement(rememberMe).click();
    }

    public void loginClick(){
        getDriver().findElement(logInButton).click();
    }
}

package testTaskGT.PageObject;

import org.openqa.selenium.By;

import static utils.Utills.getDriver;

public class RegisterForm {
    private By enterEmail = By.id("userEmailRegister");
    private By enterPassword = By.id("userPassRegister");
    private By checkBox = By.cssSelector("label[class=\"icon f_checkbox inlblk vtop\"]");
    private By registerButton = By.id("register");


    public void emailInput(String eMail) {
        getDriver().findElement(enterEmail).sendKeys(eMail);
    }

    public void passInput(String pass) {
        getDriver().findElement(enterPassword).sendKeys(pass);
    }

    public void clickCheckBox() {
        getDriver().findElement(checkBox).click();
    }

    public void clickOnRegisterButtom() {
        getDriver().findElement(registerButton).click();
    }

}

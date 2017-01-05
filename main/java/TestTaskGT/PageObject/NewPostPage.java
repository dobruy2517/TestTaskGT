package TestTaskGT.PageObject;

import org.openqa.selenium.By;

import static DriverUtills.Utills.getDriver;

/**
 * Created by ihor on 04.01.17.
 */
public class NewPostPage {
    private By registerNewUser = By.id("register_tab");

    public void registerTab(){
        getDriver().findElement(registerNewUser).click();
    }
}

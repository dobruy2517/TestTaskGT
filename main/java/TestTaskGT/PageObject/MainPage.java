package TestTaskGT.PageObject;

import org.openqa.selenium.By;

import static DriverUtills.Utills.getDriver;

/**
 * Created by ihor on 04.01.17.
 */
public class MainPage {
    private By clickOnCreatePost = By.cssSelector("#postNewAdLink span");
    public void open(){
        getDriver().get("https://www.olx.ua");
    }
    public void createPost(){
        getDriver().findElement(clickOnCreatePost).click();
    }
}

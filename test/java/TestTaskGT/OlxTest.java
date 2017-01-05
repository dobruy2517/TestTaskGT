package TestTaskGT;

import TestTaskGT.PageObject.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static DriverUtills.Utills.getDriver;

/**
 * Created by ihor on 04.01.17.
 */
public class OlxTest {

    MainPage mainPage = new MainPage();
    NewPostPage newPostPage = new NewPostPage();
    RegisterForm registerForm = new RegisterForm();
    LoginPage loginPage = new LoginPage();
    CreatePostPage createPostPage = new CreatePostPage();

    @Before
    public void preCond() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("chromedriver").getFile());
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        getDriver().manage().window().maximize();
    }

    @After
    public void postCond(){
        getDriver().close();
    }


    @Test
    public void olxCreatePostTest() throws InterruptedException {
        mainPage.open();
        mainPage.createPost();
        loginPage.eMailInput("dobruy2517@gmail.com");
        loginPage.passwordInput("password");
        loginPage.checkRememberMe();
        loginPage.loginClick();
        createPostPage.inputHeader("Junior Automation QA Engineer");
        createPostPage.rubricDropdownMenu();
        createPostPage.clickJobButton();
        createPostPage.clickOnTypeOfJob();
        createPostPage.dropdownMenu();
        createPostPage.chooseStatus();
        createPostPage.inputDescription("Creation automation scripts");
        createPostPage.dropdownMenuOfTypeOfJob();
        createPostPage.fullTimeJob();
        createPostPage.employmentTypeMenu();
        createPostPage.chooseFullDay();
        createPostPage.inputAdress("Ки");
        createPostPage.chooseLocaion();
        createPostPage.inputName("Igor");
        createPostPage.inputPhoneNumber("+38(096)957-82-46");
        createPostPage.clickSaveButton();
        Assert.assertEquals("Ваше объявление принято!", createPostPage.isPostCreated());
    }
}

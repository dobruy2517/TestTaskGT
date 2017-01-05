package TestTaskGT.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static DriverUtills.Utills.getDriver;

/**
 * Created by ihor on 04.01.17.
 */
public class CreatePostPage {
    private By headOfPost = By.id("add-title");
    private By rubric = By.cssSelector("#targetrenderSelect1-0 dt a");
    private By job = By.cssSelector("#cat-6>span.cat-icon-6");
    private By kindOfJob = By.xpath("//*[@id=\"category-6\"]/div[2]/div[2]/div/ul/li[14]/a");
    private By seaching = By.id("targetid-offer-seek");
    private By inProgress = By.xpath("//*[@id=\"targetid-offer-seek\"]/dd/ul/li[3]/a");
    private By description = By.name("data[description]");
    private By typeOfJob = By.id("targetparam131");
    private By scroll = By.id("category-6");
    private By fullTime = By.xpath("//*[@id=\"targetparam131\"]/dd/ul/li[2]/a");
    private By employmentType = By.id("targetparam135");
    private By fullDay = By.xpath("//*[@id=\"targetparam135\"]/dd/ul/li[2]/a");
    private By location = By.id("mapAddress");
    private By personName = By.id("add-person");
    private By phoneNumber = By.id("add-phone");
    private By saveButton = By.id("save");
    private By city = By.cssSelector("#autosuggest-geo-ul>li>a[class=\"inactive tdnone title block c000 brtop-5 nowrap search-choose geo-suggest-li\"]>strong");
    private By isTextPresent = By.cssSelector("#body-container>div>div>p");


    public void inputHeader(String header) {
        getDriver().findElement(headOfPost).sendKeys(header);
    }

    public void rubricDropdownMenu() {
        getDriver().findElement(rubric).click();
    }

    public void clickJobButton() throws InterruptedException {
        Thread.sleep(1000);
        getDriver().findElement(job).click();
    }

    public void clickOnTypeOfJob() {
        Actions action = new Actions(getDriver());
        action.moveToElement(getDriver().findElement(scroll)).moveToElement(getDriver().
                findElement(kindOfJob)).click().build().perform();
    }

    public void dropdownMenu() throws InterruptedException {
        Thread.sleep(1000);
        getDriver().findElement(seaching).click();
    }

    public void chooseStatus() {
        getDriver().findElement(inProgress).click();
    }

    public void inputDescription(String desc) {
        getDriver().findElement(description).sendKeys(desc);
    }

    public void dropdownMenuOfTypeOfJob() throws InterruptedException {
        getDriver().findElement(typeOfJob).click();
    }

    public void fullTimeJob() throws InterruptedException {
        Thread.sleep(3000);
        getDriver().findElement(fullTime).click();
    }

    public void employmentTypeMenu() {
        getDriver().findElement(employmentType).click();
    }

    public void chooseFullDay() throws InterruptedException {
        Thread.sleep(1000);
        getDriver().findElement(fullDay).click();
    }

    public void inputAdress(String adress) {
        getDriver().findElement(location).sendKeys(adress);
    }

    public void chooseLocaion() throws InterruptedException {
//        Thread.sleep(5000);
        WebDriverWait wait  = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(city));
        Actions action = new Actions(getDriver());
        action.moveToElement(getDriver().findElement(city)).click().build().perform();
    }

    public void inputName(String name) {
        getDriver().findElement(personName).sendKeys(name);
    }

    public void inputPhoneNumber(String number) {
        getDriver().findElement(phoneNumber).sendKeys(number);
    }

    public void clickSaveButton() {
        ((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        getDriver().findElement(saveButton).click();
    }

    public String isPostCreated() throws InterruptedException {
        Thread.sleep(5000);
        return getDriver().findElement(isTextPresent).getText();
    }
}

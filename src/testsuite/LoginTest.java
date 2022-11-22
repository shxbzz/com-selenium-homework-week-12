package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UtilityMain;

public class LoginTest extends UtilityMain {

    String baseUrl = "https://demo.nopcommerce.com/ ";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        clickOnElement(By.linkText("Log in"));

        //This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        //Find the welcome text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextMessageElement.getText();

        //validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        clickOnElement(By.linkText("Log in"));
        //Type email to send email
        sendTextToElement(By.id("Email"), "shubhtest1@gmail.com");
        //Find the password field element
        sendTextToElement(By.name("Password"), "ShubhTest123");

        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        String expectMessage = "Log out";

        //Find the login button and click on it

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        String actualMessage = actualTextMessageElement.getText();


        //validate actual and expected message
        Assert.assertEquals("No such text passed", expectMessage, actualMessage);


    }

    @Test
    public void verifyErrorMessage() {
        clickOnElement(By.linkText("Log in"));
        //Type email to send email
        sendTextToElement(By.id("Email"), "test12345@gmail.com");
        //Find the password field element
        sendTextToElement(By.name("Password"), "test12345");
        //click on login tab
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));


        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        //Find the welcome text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualMessage = actualTextMessageElement.getText();

        //validate actual and expected message
        Assert.assertEquals("No msg found", expectedMessage, actualMessage);

    }

    @After
    public void testDown() {
        closeBrowser();
    }


}

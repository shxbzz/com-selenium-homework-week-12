package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UtilityMain;

public class RegisterTest extends UtilityMain {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //Click on register link
        clickOnElement(By.linkText("Register"));
        sendTextToElement(By.xpath("//a[contains(text(),'Register')]"), "Register");

        String expectedMessage = "Register";
        //Find the text element and  get the text
        WebElement actualTextMessage = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String actualMessage = actualTextMessage.getText();


        //validate actual message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //Click on Register Link
        clickOnElement(By.linkText("Register"));

        //Select gender radio button
        clickOnElement(By.id("gender-male"));

        //Enter First name
        sendTextToElement(By.id("FirstName"), "Shubhang");

        //Enter Last name
        sendTextToElement(By.id("LastName"), "Tiwari");

        //Select Day Month and Year
        clickOnElement(By.name("DateOfBirthDay"));
        sendTextToElement(By.name("DateOfBirthDay"), "31");
        clickOnElement(By.name("DateOfBirthMonth"));
        sendTextToElement(By.name("DateOfBirthMonth"), "10");
        clickOnElement(By.name("DateOfBirthYear"));
        sendTextToElement(By.name("DateOfBirthYear"), "2001");

        //Enter email address
        sendTextToElement(By.id("Email"), "shubhtest1@gmail.com");

        //Enter password
        sendTextToElement(By.id("Password"), "ShubhTest123");

        //Enter Confirm password
        sendTextToElement(By.id("ConfirmPassword"), "ShubhTest123");

        //Click on REGISTER button
        clickOnElement(By.name("register-button"));

        //Find the text element and get the text
        String expectedMessage = "Your registration completed";


        //Find the welcome text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = actualTextMessageElement.getText();

        //validate actual and expected message
        Assert.assertEquals("Your registration completed", expectedMessage, actualMessage);
    }

    @After
    public void testDown() {

        //closeBrowser();
    }


}

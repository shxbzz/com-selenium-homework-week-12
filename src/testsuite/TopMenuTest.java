package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UtilityMain;

public class TopMenuTest extends UtilityMain {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        // Click on computers
        clickOnElement(By.linkText("Computers"));

        String expectedMessage = "Computers";


        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to computer page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // Click on computers
        clickOnElement(By.linkText("Electronics"));

        String expectedMessage = "Electronics";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Electronic page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        // Click on computers
        clickOnElement(By.linkText("Apparel"));

        String expectedMessage = "Apparel";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Apparel ')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Apparel page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        // Click on computers
        clickOnElement(By.linkText("Digital downloads"));

        String expectedMessage = "Digital downloads";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads ')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Digital downloads page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        // Click on computers
        clickOnElement(By.linkText("Books"));

        String expectedMessage = "Books";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Books ')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Books page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        // Click on computers
        clickOnElement(By.linkText("Jewelry"));

        String expectedMessage = "Jewelry";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Jewelry ')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Books page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToGiftCardPageSuccessfully() {
        // Click on computers
        clickOnElement(By.linkText("Gift Cards"));

        String expectedMessage = "Gift Cards";

        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Gift Cards ')]"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Gift Cards page", expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
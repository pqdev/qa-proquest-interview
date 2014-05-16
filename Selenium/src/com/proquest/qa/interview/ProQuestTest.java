package com.proquest.qa.interview;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * TODO:
 *   Your tasks are to complete the below using the Selenium WebDriver API.
 *
 *   Please put your code at the `// TODO: Start here` (found below)
 *
 *   Your goal of this exercise, is to make a compilable, runnable, and passing jUnit test using
 *   Selenium.  The test must also be idempotent!
 *   ===================================================================================
 *  public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://proquest.com/ "
        String tagName = "";
 
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("asdf")).getTagName();
        System.out.println(tagName);
        driver.close();
        System.exit(0);
 *   1. driver.get(" http://proquest.com/ ");
 *   2. webElement d1=driver.FindElement(By.name( "dissertation asap"));
 *   3. driver.findElement(By.LinkText( "Dissertations ASAP") );
 *   4. Assert.assertEquals(text,""1861 - Present"); 
 *   5. driver.find_element_by_link_text(‘International News’);
 *       driver.findElement(By.LinkText("Italiano"));
 *   6. driver.findElement(By.LinkText("Careers");
 *   7. driver.findElement(By.id("openposition")).click();
 *   8. Fill out the form
 *    a. driver.findElement(By.Id("location").sendkeys( "Ann Arbor, MI");
 *    b. driver.findElement(By.Id("asgj").sendkeys( "this will not be found");
 *   9. driver.findElement(By.id("click")).click();
 *   10. String bodyText = driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue("No Jobs are found", bodyText.contains(text));
 *   11. driver.navigate().back();
 *   12. Fill out the form
 *     a. driver.findElement(By.Id("location").sendkeys( "Ann Arbor, MI");
 *     b. driver.findElement(By.Id("sdfg").sendkeys( "software test engineer");
 *     c. assertTrue(Page.getAlljobs().contains("Reason: Software test engineer");
 *   ===================================================================================
 *
 *   Bonus Points!
 *   + Use Only CSS Selectors
 */
public class ProQuestTest {
    WebDriver driver;

    @Test
    public void testProQuestUsingSelenium() {
        // TODO: Start here.
    }
}

package com.proquest.qa.interview;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * TODO:
 *   Your tasks are to complete the below using the Selenium WebDriver API.
 *
 *   Please put your code at the `// TODO: Start here` (found below)
 *
 *   Your goal of this exercise, is to make a compilable, runnable, and passing jUnit test using
 *   Selenium.  The test must also be idempotent!
 *   ===================================================================================
 *   1. Navigate to http://proquest.com/ using your browser of choice
 *   2. Using the search bar found at the top, search for "dissertation"
 *   3. Navigate to the result titled "ProQuest Dissertation and Theses Dissemination" by clicking the link
 *   4. Using jUnit, assert that the first item in the key facts list is "Multidisciplinary"
 *   5. Click the "News" link at the top
 *   6. Select "Italiano" from the language dropdown on the left.
 *   7. Click the "Careers" link in the top navigation bar.
 *   8. Click the "Open Positions" button
 *   9. Fill out the form
 *    a. Set location to "Ann Arbor, MI"
 *    b. Set Description Keywords to "this will not be found"
 *   10. Click the Search button
 *   11. Validate that no jobs are found
 *   12. Go back one page
 *   13. Fill out the form
 *     a. Set location to "Any"
 *     b. Set Description Keywords to "software test engineer"
 *     c. Validate that AT LEAST one job appears
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

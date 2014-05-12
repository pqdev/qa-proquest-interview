package com.proquest.qa.interview;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * TODO:
 *   Your tasks are to complete the below using the Selenium WebDriver API.
 *   ===================================================================================
 *   1. Navigate to http://proquest.com/ using your browser of choice
 *   2. Using the search bar found at the top, search for "dissertation asap"
 *   3. Navigate to the result titled "Dissertations ASAP" by clicking the link
 *   4. Using jUnit, assert that the coverage dates for this product is "1861 - Present"
 *   5. Click the "International News" link at the top, then click "Italiano"
 *   6. Click the "Careers" link in the top navigation bar.
 *   7. Click the "Open Positions" button
 *   8. Fill out the form
 *    a. Set location to "Ann Arbor, MI"
 *    b. Set Description Keywords to "this will not be found"
 *   9. Click the Search button
 *   10. Validate that no jobs are found
 *   11. Go back one page
 *   12. Fill out the form
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

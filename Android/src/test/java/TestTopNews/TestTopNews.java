package TestTopNews;

import PageFactoryHome.TopStories;
import UiPages.UiMenus;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



/**
 * Created by sarowar on 1/30/17.
 */
public class TestTopNews extends Base {

    @Test
    public void CanGoToTopNews() throws InterruptedException {
        removeGooglePlayServicewindow();


        TopStories topst = new TopStories(ad);

        topst.topStoriesLink1.click();
        topst.clickSavedIcon.click();
        sleepFor(2);
        topst.clickMenuIcon.click();

        topst.topStoriesLink2.click();
        topst.clickSavedIcon.click();
        sleepFor(2);
        topst.clickMenuIcon.click();

        topst.topStoriesLink3.click();
        topst.clickSavedIcon.click();
        sleepFor(2);
        topst.clickMenuIcon.click();

        topst.topStoriesLink4.click();
        topst.clickSavedIcon.click();
        sleepFor(2);
        topst.clickMenuIcon.click();




    }


}

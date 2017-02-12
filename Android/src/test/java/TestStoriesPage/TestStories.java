package TestStoriesPage;

import TopstoriesPage.Stories;
import UiPages.UiMenus;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by sarowar on 1/30/17.
 */
public class TestStories extends Base {

    @Test
    public void CanGoToTopStories() throws InterruptedException{

        /*
        Stories topStories = new Stories(ad);

        removeGooglePlayServicewindow();
        topStories.clickMenuIcon.click();
        topStories.clickTopStoriesLink.click();
        topStories.GoToTopStoriesDetailsPage();

        */
        removeGooglePlayServicewindow();

        UiMenus ui = PageFactory.initElements(ad, UiMenus.class);
        ui.getTopStoriesPage().GoToTopStoriesDetailsPage();

    }
}

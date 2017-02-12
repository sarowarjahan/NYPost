package AllMenus;
import PageFactoryHome.MainMenus;
import common.Base;
import org.testng.annotations.Test;


/**
 * Created by sarowar on 1/29/17.
 */
public class TestAllMenus extends Base{

    @Test(priority = 1)
    public void TestTopStories()throws InterruptedException{

        removeGooglePlayServicewindow();
        MainMenus menulLinks = new MainMenus(ad);

        menulLinks.clickMenuIcon.click();
        menulLinks.topStoriesLink.click();

        menulLinks.clickMenuIcon.click();
        menulLinks.savedArticlesLink.click();

        menulLinks.clickMenuIcon.click();
        menulLinks.newsLink.click();

        menulLinks.clickMenuIcon.click();
        menulLinks.metroLink.click();

        menulLinks.clickMenuIcon.click();
        menulLinks.pageSixLink.click();
        menulLinks.clickMenuIcon.click();

        ad.scrollTo("FASHION");

        menulLinks.sprotsLink.click();

        menulLinks.clickMenuIcon.click();
        menulLinks.businessLink.click();

        menulLinks.clickMenuIcon.click();
        menulLinks.opinionLink.click();

        menulLinks.clickMenuIcon.click();
        menulLinks.entertainmentLink.click();

        menulLinks.clickMenuIcon.click();
        menulLinks.fashionLink.click();
    }


}

package TestNewsPage;

import NewsPage.News;
import UiPages.UiMenus;
import common.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by sarowar on 1/30/17.
 */
public class TestNews extends Base {

    @Test
    public void CanIGotoNewsPage()throws InterruptedException{
        removeGooglePlayServicewindow();
        News newsobj = new News(ad);
        UiMenus ui = PageFactory.initElements(ad, UiMenus.class);
        ui.getNewsPage().ClickOnNewsLink();
    }
}

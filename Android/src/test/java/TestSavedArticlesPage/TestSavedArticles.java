package TestSavedArticlesPage;

import NewsPage.News;
import SavedArticlesPage.SavedArticles;
import UiPages.UiMenus;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by sarowar on 1/30/17.
 */
public class TestSavedArticles extends Base {

    @Test
    public void CanIGotoAtriclesPage()throws InterruptedException{

        removeGooglePlayServicewindow();

        SavedArticles articlesobj = new SavedArticles(ad);
        articlesobj.clickMenuIcon.click();
        articlesobj.newsLink.click();
        articlesobj.ClickNewsForSave();

        UiMenus ui = PageFactory.initElements(ad, UiMenus.class);
        ui.getSavedArticlesPage().ClickOnSaveArticlesLink();
    }
}

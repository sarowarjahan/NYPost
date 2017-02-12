package UiPages;

import NewsPage.News;
import SavedArticlesPage.SavedArticles;
import TopstoriesPage.Stories;
import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by sarowar on 1/30/17.
 */
public class UiMenus extends Base {

    @FindBy(how = How.XPATH, using = "//android.view.View[1]/android.widget.ImageButton[1]")
    public static WebElement clickMenuIcon;

    @FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.RelativeLayout[1]")
    public static WebElement topStoriesLink;

    @FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.RelativeLayout[2]")
    public static WebElement savedArticlesLink;

    @FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.RelativeLayout[3]")
    public static WebElement newsLink;

    public Stories getTopStoriesPage(){
        clickMenuIcon.click();
        topStoriesLink.click();
        return new Stories(ad);
    }

    public News getNewsPage(){
        clickMenuIcon.click();
        newsLink.click();
        return new News(ad);
    }

    public SavedArticles getSavedArticlesPage(){
        clickMenuIcon.click();

        savedArticlesLink.click();
        return new SavedArticles(ad);
    }
}

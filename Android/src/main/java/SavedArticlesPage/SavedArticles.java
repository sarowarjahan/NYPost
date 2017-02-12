package SavedArticlesPage;

import common.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sarowar on 1/30/17.
 */
public class SavedArticles extends Base {

    WebDriver pageObjectDriver;

    @FindBy(how = How.XPATH, using = "//android.view.View[1]/android.widget.ImageButton[1]")
    public static WebElement clickMenuIcon;

    @FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[2]/android.widget.ListView[1]/android.widget.RelativeLayout[3]")
    public static WebElement newsLink;

    @FindBy(how = How.XPATH, using = "//android.support.v7.widget.LinearLayoutCompat[1]/android.widget.TextView[1]")
    public static WebElement clickSavedIcon;


    public void ClickNewsForSave()throws  InterruptedException{

        for(int i=1; i<=3; i++){
            if(i<=3) {
                clickByXpath("//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[" + i + "]");
                clickSavedIcon.click();
                sleepFor(2);
                clickMenuIcon.click();
            }
        }

    }

    public void ClickOnSaveArticlesLink()throws InterruptedException{

        for(int i=1; i<=3; i++){
            if(i<=3) {
                clickByXpath("//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[" + i + "]");
                clickMenuIcon.click();
            }else if(i == 8){
               // ad.scrollTo("Senate Republicans");
                clickByXpath("//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[" + i + "]");
                clickMenuIcon.click();
            }else if(i>8){
                clickByXpath("//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[" + i + "]");
                clickMenuIcon.click();
            }
        }
    }

    public SavedArticles(WebDriver ad){
        this.pageObjectDriver = ad;
        PageFactory.initElements(ad,this);
    }
}

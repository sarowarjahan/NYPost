package TopstoriesPage;

import common.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sarowar on 1/30/17.
 */
public class Stories extends Base {

    WebDriver pageObjectDriver;

    @FindBy(how = How.XPATH, using = "//android.view.View[1]/android.widget.ImageButton[1]")
    public static WebElement clickMenuIcon;

    public void clickTopStories1(){
        clickByXpath("//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[1]");
        clickMenuIcon.click();
    }
    public void clickTopStories2(){
        clickByXpath("//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[2]");
        clickMenuIcon.click();
    }
    public void clickTopStories3(){
        clickByXpath("//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[3]");
        clickMenuIcon.click();
    }
    public void clickTopStories4(){
        clickByXpath("//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[4]");
        clickMenuIcon.click();
    }

    public void GoToTopStoriesDetailsPage()throws InterruptedException{
        clickTopStories1();
        clickTopStories2();
        clickTopStories3();
        clickTopStories4();
    }

    public Stories(WebDriver ad){
        this.pageObjectDriver = ad;
        PageFactory.initElements(ad,this);
    }

}

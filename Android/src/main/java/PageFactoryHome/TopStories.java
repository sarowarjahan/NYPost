package PageFactoryHome;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by sarowar on 1/30/17.
 */
public class TopStories extends Base {

    WebDriver pageObjectDriver;

    @FindBy(how = How.XPATH, using = "//android.view.View[1]/android.widget.ImageButton[1]")
    public static WebElement clickMenuIcon;

    @FindBy(how = How.XPATH, using = "//android.support.v7.widget.LinearLayoutCompat[1]/android.widget.TextView[1]")
    public static WebElement clickSavedIcon;



    @FindBy(how = How.XPATH, using = "//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[1]")
    public static WebElement topStoriesLink1;

    @FindBy(how = How.XPATH, using = "//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[2]")
    public static WebElement topStoriesLink2;

    @FindBy(how = How.XPATH, using = "//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[3]")
    public static WebElement topStoriesLink3;

    @FindBy(how = How.XPATH, using = "//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[4]")
    public static WebElement topStoriesLink4;

    public TopStories(WebDriver ad){
        this.pageObjectDriver = ad;
        PageFactory.initElements(ad,this);
    }


}



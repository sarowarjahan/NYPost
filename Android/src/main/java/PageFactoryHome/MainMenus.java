package PageFactoryHome;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by sarowar on 1/29/17.
 */
public class MainMenus extends Base {

    WebDriver pageObjectDriver;

    @FindBy(how = How.XPATH, using = "//android.view.View[1]/android.widget.ImageButton[1]")
    public static WebElement clickMenuIcon;

    @FindBy(how = How.XPATH, using = "//android.widget.ListView[1]/android.widget.RelativeLayout[1]")
    public static WebElement topStoriesLink;

    @FindBy(how = How.XPATH, using = "//android.widget.ListView[1]/android.widget.RelativeLayout[2]")
    public static WebElement savedArticlesLink;

    @FindBy(how = How.XPATH, using = "//android.widget.ListView[1]/android.widget.RelativeLayout[3]")
    public static WebElement newsLink;

    @FindBy(how = How.XPATH, using = "//android.widget.ListView[1]/android.widget.RelativeLayout[4]")
    public static WebElement metroLink;

    @FindBy(how = How.XPATH, using = "//android.widget.ListView[1]/android.widget.RelativeLayout[5]")
    public static WebElement pageSixLink;

    @FindBy(how = How.XPATH, using = "//android.widget.ListView[1]/android.widget.RelativeLayout[6]")
    public static WebElement sprotsLink;

    @FindBy(how = How.XPATH, using = "//android.widget.ListView[1]/android.widget.RelativeLayout[7]")
    public static WebElement businessLink;

    @FindBy(how = How.XPATH, using = "//android.widget.ListView[1]/android.widget.RelativeLayout[8]")
    public static WebElement opinionLink;



    @FindBy(how = How.XPATH, using = "//android.widget.ListView[1]/android.widget.RelativeLayout[9]")
    public static WebElement entertainmentLink;

    @FindBy(how = How.XPATH, using = "//android.widget.ListView[1]/android.widget.RelativeLayout[10]")
    public static WebElement fashionLink;

    public MainMenus(WebDriver ad){
        this.pageObjectDriver = ad;
        PageFactory.initElements(ad,this);
    }
}

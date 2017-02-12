package NewsPage;

import common.Base;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sarowar on 1/30/17.
 */
public class News extends Base {

    WebDriver pageObjectDriver;

    @FindBy(how = How.XPATH, using = "//android.view.View[1]/android.widget.ImageButton[1]")
    public static WebElement clickMenuIcon;

    /*
    public List<WebElement> getAllNews(){
        List<WebElement> allNewslist = new ArrayList<WebElement>();
        allNewslist = ad.findElements(By.xpath("//android.support.v7.widget.RecyclerView[1]/"));
        return allNewslist;
    }
*/
    public void ClickOnNewsLink()throws InterruptedException{

        for(int i=1; i<=7; i++){
            if(i<= 5) {
                clickByXpath("//android.widget.RelativeLayout[" + i + "]");
                clickMenuIcon.click();
            }else if(i == 6){
                ad.scrollTo("Senate Republicans");
                clickByXpath("//android.widget.RelativeLayout[" + i + "]");
                clickMenuIcon.click();
            }else if(i>6){
                clickByXpath("//android.widget.RelativeLayout[" + i + "]");
                clickMenuIcon.click();
            }
        }
    }

    public News(WebDriver ad){
        this.pageObjectDriver = ad;
        PageFactory.initElements(ad,this);
    }
}

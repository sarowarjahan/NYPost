package PageFactoryDataSearch;

import common.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sarowar on 1/29/17.
 */
public class SearchItems extends Base {

    WebDriver pageObjectDriver;

    @FindBy(how = How.XPATH, using = "//android.widget.TextView[1]")
    public static WebElement searchInput;

    @FindBy(how = How.XPATH, using = "//android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]")
    public static WebElement clickSearchIcon;

    @FindBy(how = How.XPATH, using = "//android.view.View[1]/android.widget.ImageButton[1]")
    public static WebElement backSearchIcon;




    public void searchFor(String item){
        searchInput.sendKeys(item, Keys.ENTER);
    }

    public void clearSearchInput() {
        searchInput.clear();
    }

    public SearchItems(WebDriver driver) {
        this.pageObjectDriver=driver;
        PageFactory.initElements(driver, this);
    }

}

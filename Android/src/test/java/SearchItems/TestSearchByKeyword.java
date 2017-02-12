package SearchItems;

import PageFactoryDataSearch.SearchItems;
import common.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


/**
 * Created by sarowar on 1/29/17.
 */
public class TestSearchByKeyword extends Base {

    @Test
    public void searchUsingKeyword() throws InterruptedException {
        removeGooglePlayServicewindow();

        SearchItems searchelement = new SearchItems(ad);
        searchelement.clickSearchIcon.click();

        searchelement.searchFor("Education");
        searchelement.backSearchIcon.click();
       // searchelement.clearSearchInput();


//        sleepFor(2);
//        pressEnterKey("//android.widget.TextView[1]","Trump");


    }

}

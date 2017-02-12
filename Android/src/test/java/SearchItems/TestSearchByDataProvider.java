package SearchItems;

import common.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageFactoryDataSearch.SearchItems;


/**
 * Created by sarowar on 1/29/17.
 */
public class TestSearchByDataProvider extends Base {

    //One Data Driven Option to supply search.data from Data Provider
    @DataProvider(name = "items")
    public Object[][] createData(){
        return new Object[][]{
                {"Books"} ,
                {"Baby"} ,
                {"Computer"},

        };
    }

    @Test(dataProvider = "items")
    public void searchUsingDataProvider(String data)throws InterruptedException{

        removeGooglePlayServicewindow();

        //initialize Search page factory
        SearchItems searchelement = new SearchItems(ad);
        searchelement.clickSearchIcon.click();
        searchelement.searchInput.sendKeys(data, Keys.ENTER);
        searchelement.backSearchIcon.click();
        sleepFor(1);
        //searchInput.clear();
    }
}

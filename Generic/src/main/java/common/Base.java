package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by mrahman on 05/08/16.
 */
public class Base {


        //if this is android os or iOS.
        //What is the version of android and iOS
        //if it is real device or Emulator/Simulator
        //where app is located

            public static AppiumDriver ad = null;
            public String OS = null;
            public String deviceName = null;
            public String deviceType = null;
            public String appType = null;
            public String version = null;
            public File appDirectory = null;
            public File findApp = null;
            public DesiredCapabilities cap = null;


            @Parameters({"OS","appType","deviceType", "deviceName","version"})
            @BeforeMethod
            public void setUp(String OS,String appType,String deviceType,String deviceName,
                              String version)throws IOException,InterruptedException{

                if(OS.equalsIgnoreCase("ios")){
                    if(appType.contains("iPhone")){
                        appDirectory = new File("iOS/src/app");
                        findApp = new File(appDirectory,"UICatalog6.1.app.zip");
                        if(deviceType.equalsIgnoreCase("RealDevice")){
                            cap = new DesiredCapabilities();
                            cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
                            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
                            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                            cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                            ad = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                            ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                        }else if (deviceType.equalsIgnoreCase("Simulator")){
                            cap = new DesiredCapabilities();
                            cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
                            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                            cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                            ad = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                            ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        }


                    }else if(appType.equalsIgnoreCase("iPad 2")){
                        appDirectory = new File("iOS/src/app");
                        findApp = new File(appDirectory,"UICatalog6.1.app.zip");
                        if(deviceType.contains("RealDevice")){
                            cap = new DesiredCapabilities();
                            cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
                            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                            cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                            ad = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                            ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                        }else if (deviceType.equalsIgnoreCase("Simulator")){
                            cap = new DesiredCapabilities();
                            cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
                            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                            cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                            ad = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                            ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                        }
                    }

                }else if(OS.contains("Android")){
                    if(appType.contains("Phone")){
                        appDirectory = new File("src/app");
                        findApp = new File(appDirectory,"NYP.apk");
                        if(deviceType.equalsIgnoreCase("RealDevice")){
                            cap = new DesiredCapabilities();
                            cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
                            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                            cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                            ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                            ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                        }else if (deviceType.equalsIgnoreCase("Emulator")){

                            cap = new DesiredCapabilities();
                            cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
                            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                            cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                            ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                            ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        }

                    }else if(OS.equalsIgnoreCase("Tablets")){
                        if(deviceType.equalsIgnoreCase("RealDevice")){
                            cap = new DesiredCapabilities();
                            cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
                            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                            cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                            ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                            ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                        }else if (deviceType.equalsIgnoreCase("Emulator")){

                            cap = new DesiredCapabilities();
                            cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
                            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                            cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                            ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                            ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        }
                    }
                }
            }

            @AfterMethod
            public void cleanUpApp(){
                ad.quit();
            }

        public void clickByCss(String locator) {
            ad.findElement(By.cssSelector(locator)).click();
        }

        public void clickByXpath(String locator) {
            ad.findElement(By.xpath(locator)).click();
        }

        public void typeByCss(String locator, String value) {
            ad.findElement(By.cssSelector(locator)).sendKeys(value);
        }
        public void typeByCssNEnter(String locator, String value) {
            ad.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        }

        public void typeByXpath(String locator, String value) {
            ad.findElement(By.xpath(locator)).sendKeys(value);
        }


        public void pressEnterKey(String locator,String value){
            ad.findElement(By.xpath(locator)).sendKeys(Keys.ENTER);
        }

        public void takeEnterKeys(String locator) {
            ad.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
        }

        public void clearInputField(String locator){
            ad.findElement(By.cssSelector(locator)).clear();
        }
        public List<WebElement> getListOfWebElementsById(String locator) {
            List<WebElement> list = new ArrayList<WebElement>();
            list = ad.findElements(By.id(locator));
            return list;
        }
        public List<String> getTextFromWebElements(String locator){
            List<WebElement> element = new ArrayList<WebElement>();
            List<String> text = new ArrayList<String>();
            element = ad.findElements(By.cssSelector(locator));
            for(WebElement web:element){
                text.add(web.getText());
            }

            return text;
        }
        public List<WebElement> getListOfWebElementsByCss(String locator) {
            List<WebElement> list = new ArrayList<WebElement>();
            list = ad.findElements(By.cssSelector(locator));
            return list;
        }
        public List<WebElement> getListOfWebElementsByXpath(String locator) {
            List<WebElement> list = new ArrayList<WebElement>();
            list = ad.findElements(By.xpath(locator));
            return list;
        }
        public String  getCurrentPageUrl(){
            String url = ad.getCurrentUrl();
            return url;
        }
        public void navigateBack(){
            ad.navigate().back();
        }
        public void navigateForward(){
            ad.navigate().forward();
        }
        public String getTextByCss(String locator){
            String st = ad.findElement(By.cssSelector(locator)).getText();
            return st;
        }
        public String getTextByXpath(String locator){
            String st = ad.findElement(By.xpath(locator)).getText();
            return st;
        }
        public String getTextById(String locator){
            return ad.findElement(By.id(locator)).getText();
        }
        public String getTextByName(String locator){
            String st = ad.findElement(By.name(locator)).getText();
            return st;
        }

        public List<String> getListOfString(List<WebElement> list) {
            List<String> items = new ArrayList<String>();
            for (WebElement element : list) {
                items.add(element.getText());
            }
            return items;
        }

        public void selectOptionByVisibleText(WebElement element, String value) {
            Select select = new Select(element);
            select.selectByVisibleText(value);
        }
        public void sleepFor(int sec)throws InterruptedException{
            Thread.sleep(sec * 1000);
        }
        public void mouseHoverByCSS(String locator){
            try {
                WebElement element = ad.findElement(By.cssSelector(locator));
                Actions action = new Actions(ad);
                Actions hover = action.moveToElement(element);
            }catch(Exception ex){
                System.out.println("First attempt has been done, This is second try");
                WebElement element = ad.findElement(By.cssSelector(locator));
                Actions action = new Actions(ad);
                action.moveToElement(element).perform();

            }

        }
        public void mouseHoverByXpath(String locator) {
            try {
                WebElement element = ad.findElement(By.xpath(locator));
                Actions action = new Actions(ad);
                Actions hover = action.moveToElement(element);
            } catch (Exception ex) {
                System.out.println("First attempt has been done, This is second try");
                WebElement element = ad.findElement(By.cssSelector(locator));
                Actions action = new Actions(ad);
                action.moveToElement(element).perform();
            }
        }
        public void okAlert(){
            Alert alert = ad.switchTo().alert();
            alert.accept();
        }
        public void cancelAlert(){
            Alert alert = ad.switchTo().alert();
            alert.dismiss();
        }

        public void iframeHandle(WebElement element){
            ad.switchTo().frame(element);
        }
        public void goBackToHomeWindow(){
            ad.switchTo().defaultContent();
        }

        public void getLinks(String locator){
            ad.findElement(By.linkText(locator)).findElement(By.tagName("a")).getText();
        }

        public void takeScreenShot()throws IOException {
            File file = ((TakesScreenshot)ad).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("screenShots.png"));
        }

        public void waitUntilClickAble(By locator){
            WebDriverWait wait = new WebDriverWait(ad, 10);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        }
        public void waitUntilVisible(By locator){
            WebDriverWait wait = new WebDriverWait(ad, 10);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }
        public void waitUntilSelectable(By locator){
            WebDriverWait wait = new WebDriverWait(ad, 10);
            boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
        }
        public void upLoadFile(String locator,String path){
            ad.findElement(By.cssSelector(locator)).sendKeys(path);
        }
        public void clearInput(String locator){
            ad.findElement(By.cssSelector(locator)).clear();
        }
        public void keysInput(String locator){
            ad.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
        }

        public String getTitle(){return ad.getTitle();}


        public boolean isElementPresentByXPATH(String path){
            if(ad.findElement(By.xpath(path)).isDisplayed()){
                return true;
            }else return false;
        }

        public void removeGooglePlayServicewindow() throws InterruptedException {
                //System.out.println("App is launched");
                waitUntilVisible(By.xpath("//android.widget.FrameLayout[1]"));
                clickByXpath("//android.widget.LinearLayout[3]/android.widget.Button[1]");
        }

        public void scrollDownMenu(){
                TouchAction action = new TouchAction(ad);
                action.press(0, 500).waitAction(200).moveTo(0, 200).release().perform();

        }

    }

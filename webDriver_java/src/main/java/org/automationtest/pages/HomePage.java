package org.automationtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver webDriver;
    private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public LoginPage clickFormAuthentication(){
        clickLink("formAuthenticationLink");
        return new LoginPage(webDriver);
    }
    public void clickLink(String linktext){
        webDriver.findElement(By.linkText(linktext)).click();
    }
    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(webDriver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(webDriver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(webDriver);
    }
    public AlertsPage clickJavaScriptAlerts(){

        clickLink("JavaScript Alerts");
        return new AlertsPage(webDriver);
    }
    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(webDriver);
    }
    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(webDriver);
    }
    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(webDriver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(webDriver);
    }

    public DynamicLoadingPage clickDynamicLoading() {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(webDriver);
    }
}
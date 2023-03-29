package org.automationtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    private WebDriver webDriver;

    public KeyPressesPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void enterText(String text){
        webDriver.findElement(inputField).sendKeys(text);
    }
    public String getResult(){
        return webDriver.findElement(resultText).getText();
    }
    public void enterPi(){
        enterText(Keys.chord(Keys.ALT, "p"));
    }

}
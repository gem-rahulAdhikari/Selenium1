package com.selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class axes {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ra.adhikari\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver obj=new ChromeDriver();
        String baseUrl = "https://www.apple.com/in/";
        obj.get(baseUrl);
        WebElement openlink = obj.findElement(By.xpath("//div[@class='unit-wrapper']//child::a[@href='/in/iphone-13-pro/']"));
        openlink.click();

        WebElement searchbutton= obj.findElement(By.xpath("//a[@id='ac-gn-link-search']"));
        searchbutton.click();
        WebElement searchbox= obj.findElement(By.xpath("//div[contains(@class,'ac-gn')]//child::input[@id='ac-gn-searchform-input']"));
        searchbox.sendKeys("AirPods");
        searchbox.sendKeys(Keys.RETURN);

    }
}

package com.selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.awt.SystemColor.text;

public class Main {

    public static  void main(String[] args) throws InterruptedException {
	// write your code here
       // System.out.print("hello");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ra.adhikari\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver obj=new ChromeDriver();
        obj.get("https://www.amazon.in");
        //WebElement searchBox= obj.findElement(By.id("twotabsearchtextbox"));
       // searchBox.sendKeys("books");

       /* WebElement searchBox = obj.findElement(By.id("twotabsearchtextbox"));  //xpath:  //input[@id="twotabsearchtextbox"]
        searchBox.sendKeys("books");
        WebElement search = obj.findElement(By.id("nav-search-submit-button"));
        search.click();

        WebElement title = obj.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span"));
        String titleName = title.getText();
        System.out.println("Book title: "+titleName);*/
        System.out.println("successfully done");

        WebElement inp_tag=obj.findElement(By.xpath("//div[@id='nav-search']//child::input[1]"));

        inp_tag.sendKeys("books");
        //driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

        //Thread.sleep(20000);
        WebElement search=obj.findElement(By.xpath("//input[@id='nav-search-submit-button']"));//search

        search.click();
//first book
        WebElement title = obj.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span"));
        String titleName = title.getText();
        System.out.println("Book title: "+titleName);
    }
}

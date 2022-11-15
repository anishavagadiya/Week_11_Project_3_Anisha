package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver", "webdriver.chrome.driver");
        WebDriver driver = new ChromeDriver();

        //open url
        driver.get(baseUrl);

        //Print title of the page
        String title = driver.getTitle();
        System.out.println("page title is: " + title);

        //Print current Url
        System.out.println("current url: " + driver.getCurrentUrl());

        //Print page source
        System.out.println("Page source is: " + driver.getPageSource());

        //Enter Email to Email field
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("tomsmith"); //type the email
        //Enter the password to Password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword");

        //close the browser
        driver.quit();


    }

}

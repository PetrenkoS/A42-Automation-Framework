import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Homework17 extends BaseTest {

    private WebElement viewAllBtn;

    @Test
    public void addSongToPlayList() {

        String song = "Dark Days";
        login ("anna.stonaieva@testpro.io", "te$t$tudent");

        WebElement searchField = driver.findElement(By.cssSelector("[type='search']"));
        searchField.click();
        searchField.clear();
        searchField.sendKeys(song);

        WebElement viewAllBtn = driver.findElement(By.cssSelector("[data-test='view-all-songs-btn']"));
        viewAllBtn.click();

        List<WebElement> songResults = driver.findElements(By.cssSelector("#songResultsWrapper .song-item"));
        songResults.get(0).click();

        WebElement addToBtn = driver.findElement(By.cssSelector("[data-test='add-to-btn']"));
        addToBtn.click();

        WebElement listNameField = driver.findElement(By.cssSelector("data-test='new-playlist-name'"));
        listNameField.click();
        listNameField.clear();
        listNameField.sendKeys ("My Playlist");
        new Actions(driver)
                .keyDown(Keys.ENTER)
                .perform();
        WebElement successBanner = driver.findElement(By.cssSelector(".success.show"));
        Assert.assertTrue(successBanner.isDisplayed());
    }
}

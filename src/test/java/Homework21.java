import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework21 extends BaseTest {


    @Test
    public void renamePlaylist() {
        //GIVEN:
        login("anna.stonaieva@testpro.io", "te$t$tudent");

        choosePlaylist();
        contextClickChoosePlaylist();
        enterPlaylistName();
        Assert.assertTrue(doesPlaylistExist());
    }


    //WHEN:
    public void choosePlaylist() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(3)"))).click();
    }


    public void contextClickChoosePlaylist() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".playlist:nth-child(3)")));
        WebElement playlistElement = driver.findElement(By.cssSelector(".playlist:nth-child(3)"));
        new Actions(driver).contextClick(playlistElement).perform();
        wait.until(
                        ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[data=testid^='playlist-context-menu-edit']")))
                .click();
    }

    public void enterPlaylistName() {
        WebElement playlistInputField = driver.findElement(By.cssSelector("input[name='name']"));
        playlistInputField.sendKeys("Alternative Playlist");
        playlistInputField.sendKeys(Keys.ENTER);
    }

    //THEN:
    public boolean doesPlaylistExist() {
        WebElement playlistElement = driver.findElement(By.cssSelector(".class='playlist'"));
        return playlistElement.isDisplayed();

    }
}

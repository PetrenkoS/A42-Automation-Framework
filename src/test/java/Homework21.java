import io.netty.util.Attribute;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Instant;

public class Homework21 extends {

    private Attribute<Object> driver;

    @Test
    public void renamePlaylist() {
        //GIVEN:
        login();
        choosePlaylist();
        contextClickChoosePlaylist();
        enterPlayListname();
        Assert.assertTrue(doesPlaylistExist());

        //WHEN:
        public void choosePlaylist() {
        wait.util(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(3)"))).click();
        }
        public void choosePlaylist() {
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".playlist:nth-child(3)")));
            WebElement playlistElement = driver.findElement(By.cssSelector(".playlist:nth-child(3)")));
            action.contextClick(playlistElement).perform();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[data=testid^='playlist-context-menu-edit']"))).click();

            public void enterPlaylistName() {
                WebElement playlistInputField = driver.findElement (By.cssSelector("input[name='name']"));
                playlistInputField.sendKeys(value:"Alternative Playlist");
                playlistInputField.sendKeys(Keys.ENTER);
            }
            //THEN:
        public boolean doesplaylistExist() {
                WebElement playlistElement = driver.findElement(By.cssSelector(".class='playlist')");
                return playlistElement.isDisplayed();

            }
        }


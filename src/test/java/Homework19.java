import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest  {

    @Test
    public void Login() {

        //GIVEN:
        login("anna.stonaieva@testpro.io", "te$tStudent");
    }

    //WHEN:
        public void openPlaylist() {
            WebElement Playlist = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".playlist:nth-child(3)"));
            Playlist.click();

        }
//THEN:
        public void deletePlaylist() {
        WebElement deletePlaylistButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-delete-playlist"));
        deletePlaylistButton.click();
        }
    }


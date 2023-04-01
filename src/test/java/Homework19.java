import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest  {

    @Test
    public void Login() {

        login("anna.stonaieva@testpro.io", "te$tStudent");
    }
        public void openPlaylist() throws InterruptedException {
            WebElement Playlist = driver.findElement(By.cssSelector(".playlist:nth-child(3)"));
            Playlist.click();
            Thread.sleep(1000);
        }

        public void deletePlaylist() throws InterruptedException {
        WebElement deletePlaylistButton = driver.findElement(By.cssSelector(".btn-delete-playlist"));
        deletePlaylistButton.click();
        Thread.sleep(1000);
    }


}

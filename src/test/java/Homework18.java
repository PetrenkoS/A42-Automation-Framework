import org.openqa.selenium.WebElement;

public class Homework18 extends BaseTest {

    @Test
    public static void playSong() {

        login(email:"anjusha35@gmail.com", password:"te$tStudent");

        WebElement PlayControlPanel = driver.findElement(By.cssSelector(".player-controls"));
        new Actions(driver)
                .moveToElenent(playControlPanel)
        perform();
        WebElement playBtn = findElement(By.cssSelector("[data-testid='play-btn']"));
        playBtn = click();
        Thread.sleep(millis:5000);
        WebElement pauseBtn = driver.findElement(By.cssSelector("[data-testid='pause-btn]"));
        Assert.assertTrue = (pauseBtn.isDisplayed());

    }
}

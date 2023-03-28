import org.openqa.selenium.chrome.ChromeDriver;

public class Homework17 extends BaseTest {

    @Test
    public void addSongToPlaylist() throws InterruptedException {

        String newSongAddedNotificationText = "Added 1 song into";

        navigateToPage();
        provideEmail(anna.stonaieva @testpro.io);
        providePassword("te$t$tudent");
        clickSubmit();
        searchSong(songTitleKeyword:"Dark Days");
        clickViewAllSearchResult();
        selectFirstSongResult();
        clickAddToBtn();
        choosePlayList();
        Assert.assertTrue(getNotificationText().contains(newSongAddedNotificationText));
    }
}

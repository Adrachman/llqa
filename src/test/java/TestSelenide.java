import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestSelenide extends BaseTest {
    public final static String BASE_URL = "https://appleinsider.ru/";
    public final static String SET = "Чем iPhone 13 отличается от iPhone 12";
    private final static String EXPECTED_WORD = "iphone-13";

    @Test
    public void checkHref() {
        Assert.assertTrue(new MainPage(BASE_URL)
                .search(SET)
                .getHrefFromFirstArticle()
                .contains(EXPECTED_WORD));
    }
}

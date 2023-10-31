import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement searchButton = $x("//form/input[@name=\"s\"]");

    public MainPage(String url) {
        Selenide.open(url);
    }

    /**
     * Поиск информации по значению
     * @param searchString
     */
    public SearchedPage search(String searchString) {
        searchButton.setValue(searchString);
        searchButton.sendKeys(Keys.ENTER);
        return new SearchedPage();
    }

}

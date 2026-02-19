import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {

    @Test
    void selenideSearchTest () {

        //Открыть хром
        open("https://www.google.com/");

        //Принять куки
     //   $("[id=L2AGLb]").pressEnter();

        //Ввести в поиск selenide
        $("[name=q]").setValue("selenide").pressEnter();

        //Найти в результатах результат по URL (Валится из-за капчи)
        $("[id=search]").shouldHave(text("https://selenide.org"));

    }
}
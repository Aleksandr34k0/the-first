import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BoxTest {

    @BeforeAll
    static void beforeAll() {
       Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
       // Configuration.timeout = 5000; // default 4000
    }

    @Test
    void successfulSearchTest() {
        Configuration.browserSize = "1920x1080";
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Zyko");
        $("#userEmail").setValue("34ko@ov.com");
        $("#currentAddress").setValue("Russia");
        $("#permanentAddress").setValue("Moskov");
        $("#submit").click();


        $("[id=search]").shouldHave(text("https://ru.selenide.org"));
    }



}

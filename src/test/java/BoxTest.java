import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BoxTest {

    @Test
    void successfulSearchTest() {
        open("https://demoqa.com/text-box");
        $("[id=userName]").setValue("3Yko");
        $("[id=userEmail]").setValue("3434@maill.ru");
        $("[id=currentAddress]").setValue("Russia");
        $("[id=permanentAddress]").setValue("Moscow");

        $("[id=submit]").click();


        $("[id=search]").shouldHave(text("https://ru.selenide.org"));
    }



}

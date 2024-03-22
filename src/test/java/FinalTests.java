import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class FinalTests {
@BeforeAll
static void before(){
    Configuration.pageLoadStrategy = "eager";
    Configuration.browserSize = "1980x1080";
    Configuration.holdBrowserOpen = true;
}

    @Test
            void FinalTest() {

        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Vano");
        $("#lastName").setValue("Vanov");
        $("#userEmail").setValue("Vano@maiiill.com");
        $("#userNumber").setValue("89607001600");
        $("#currentAddress").setValue("Russia, Moscow");

        $("#genterWrapper").$(byText("Female")).click();
        $("#genterWrapper").$(byText("Male")).click();

        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").$(byText("1995")).click();
        $(".react-datepicker__month-select").$(byText("July")).click();
        $(".react-datepicker__month").$(byText("21")).click();

        $("#subjectsInput").setValue("Arts").pressEnter();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $(".css-19bqh2r").click();


        $(byText("Sports")).click();
        $(byText("Music")).click();
        $(byText("Music")).click();

        $("#uploadPicture").uploadFromClasspath("photo_2024-03-22_14-43-40.jpg");


        $("#state").click();
        $(byText("NCR")).click();

        $("#city").click();
        $(byText("Noida")).click();

$("#submit").click();


$(".modal-content").shouldHave(text("Thanks for submitting the form"));


        $(".table-responsive").shouldHave(text("Vano Vanov"));
        $(".table-responsive").shouldHave(text("Vano@maiiill.com"));
        $(".table-responsive").shouldHave(text("Male"));
        $(".table-responsive").shouldHave(text("8960700160"));
        $(".table-responsive").shouldHave(text("21 July,1995"));
        $(".table-responsive").shouldHave(text("Maths"));
        $(".table-responsive").shouldHave(text("Sports"));
        $(".table-responsive").shouldHave(text("Russia, Moscow"));
        $(".table-responsive").shouldHave(text("NCR Noida"));


$("#closeLargeModal").click();



    }
}

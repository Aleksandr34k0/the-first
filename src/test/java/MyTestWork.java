import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MyTestWork {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
    }


    @Test
    void successfulSearchTest() {

        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Zyko");
        $("#lastName").setValue("Melnikov");
        $("#userEmail").setValue("34ko@ov.com");
        $("#userNumber").setValue("89607160000");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").click();
        $(byText("2000")).click();
        $(".react-datepicker__month-select").click();
        $(byText("June")).click();
        $(".react-datepicker__day--021").click();

       // $("#dateOfBirthInput").setValue("21 Mar 2000").pressEnter();

        $("#currentAddress").setValue("Russia, Tver");
        $(byText("Other")).click();
        $("#genterWrapper").$(byText("Male")).click();
        $(byText("Sports")).click();
        $(byText("Music")).click();
        $("#subjectsInput").setValue("Arts").pressEnter();

        $("#state").click();
        $(byText("NCR")).click();

        $("#city").click();
        $(byText("Delhi")).click();



       // $("#uploadPicture").uploadFromClasspath("photo_2024-03-18_15-04-19.jpg");

        $("#submit").click();


        //    $(".modal-content [id=name]").shouldHave(text("Zyko Melnikov"));
        $(".modal-body").shouldHave(text("Zyko Melnikov"),text("34ko@ov.com"),text("Male"));



    }

}

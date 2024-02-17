package guruqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.*;
public class GITSelenideActions {

        @BeforeAll
        static void beforeAll () {
        Configuration.pageLoadStrategy = "eager";
         //Configuration.holdBrowserOpen = true;
        // Configuration.baseUrl = "";
    };
        @Test
       void gitSelenideActions(){
         open("https://the-internet.herokuapp.com/drag_and_drop");
            $("#column-a").shouldHave(text("A"));
            $("#column-b").shouldHave(text("B"));
           actions().dragAndDrop($("#column-a"),$("#column-b")).perform();
           $("#column-a").shouldHave(text("B"));
           $("#column-b").shouldHave(text("A"));
        };
    @Test
    void gitdragAndDrop(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
            $("#column-a").shouldHave(text("A"));
            $("#column-b").shouldHave(text("B"));
            $("#column-a").dragAndDrop(to($("#column-b")));
            $("#column-a").shouldHave(text("B"));
            $("#column-b").shouldHave(text("A"));
        }
    @AfterEach
    void afterEach(){
        Selenide.closeWebDriver();
    };
    }

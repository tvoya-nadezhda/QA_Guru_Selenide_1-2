package guruqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.files.DownloadActions.click;

public class GitHubSolutions {@BeforeAll
static void beforeAll() {
    Configuration.pageLoadStrategy = "eager";
     Configuration.holdBrowserOpen = true;
    // Configuration.baseUrl = "";
};
    @Test
    void gitHubSolutionsTest(){

        open("https://github.com/");
        $$(".HeaderMenu-link").findBy(text("Solutions")).hover();
        $("#solutions-for-heading").sibling(0).$(byText("Enterprise")).click();
        $("._2j0fmugLb1FgYz6KPuB91w").$(byText("Accept")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform."));
    }
}

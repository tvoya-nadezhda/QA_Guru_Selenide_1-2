package guruqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideHome {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
       // Configuration.holdBrowserOpen = true;
       // Configuration.baseUrl = "";
    };
@Test
    void selenideHomeTest(){

    open("https://github.com/selenide/selenide");
    $("#wiki-tab").click();
    $("#wiki-pages-box > div > div.js-wiki-sidebar-toggle-display > ul > li.Box-row.wiki-more-pages-link > button").click();
    $("#wiki-pages-box").$(byText("SoftAssertions")).click();
    $(".markdown-body").shouldHave(text("@ExtendWith({SoftAssertsExtension.class})\n" +
            "class Tests {\n" +
            "  @Test\n" +
            "  void test() {\n" +
            "    Configuration.assertionMode = SOFT;\n" +
            "    open(\"page.html\");\n" +
            "\n" +
            "    $(\"#first\").should(visible).click();\n" +
            "    $(\"#second\").should(visible).click();\n" +
            "  }\n" +
            "}")
        );
    }
}


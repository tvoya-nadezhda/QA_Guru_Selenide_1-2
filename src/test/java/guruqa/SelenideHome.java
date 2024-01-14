package guruqa;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class selenide_1 {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        //Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://github.com/";
    };
@Test
    void selenideHomeTest(){

    // Откройте страницу Selenide в Github
    open("selenide/selenide");
    // Перейдите в раздел Wiki проекта

    // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
    //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

   //$();

    }

}


package guruqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import pages.RegistrationPage;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PageObjectsReg extends TestBase{
    RegistrationPage registrationPage = new RegistrationPage();

        @Test
        void succesRegTest() {
            registrationPage.openPage()
            .setFirstName ("anna")//Вводим имя
            .setLastName("Ivanova") //Вводим Фамилию
            .setUserEmail("tast@email.fig")//email
            .setGenter("Female")//объявляем миру, что  Анна - женщина)
            .setUserNumber("9001112233")//Вводлим номер
            .setDateOfBirth( "09", "March",  "1900");
            $("#subjectsInput").setValue("his") .sendKeys(Keys.ARROW_DOWN, Keys.ENTER);//Выбираем историю, как интерес
            $("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label").click();//Прокликиваем галочку
            $("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(2) > label").click();//Прокликиваем галочку
            $("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(3) > label").click();//Прокликиваем галочку
            $("#uploadPicture").uploadFromClasspath("pic.png"); //Загружаем картинку
            $("#currentAddress").setValue("112233, Ulica kuricy, dom Petuha, kvartira Ciplenka, 4 zvonka");//Вводим адрес
            $("#react-select-3-input").setValue("NCR").sendKeys(Keys.ENTER);//Выбираем штат
            $("#react-select-4-input").setValue("Noida").sendKeys(Keys.ENTER);//Выбираем город
            $("#submit").click();
//проверки
            $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
            $(".table").shouldHave(text("tast@email.fig"));
            $(".table").shouldHave(text("Female"));
            $(".table").shouldHave(text("9001112233"));
            $(".table").shouldHave(text("09 March,1900"));
            $(".table").shouldHave(text("History"));
            $(".table").shouldHave(text("Sports, Reading, Music"));
            $(".table").shouldHave(text("pic.png"));
            $(".table").shouldHave(text("NCR Noida"));
        }
}

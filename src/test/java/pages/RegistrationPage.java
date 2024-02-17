package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {
  private SelenideElement firstNameInput = $("#firstName"),
           lastNameInput = $("#lastName"),
           userEmailInput=$("#userEmail"),
           genderWrapper =$("#genterWrapper"),
           userNumberInput =$("#userNumber"),
          calendarInput = $("#dateOfBirthInput")
    ;
    CalendarComponent calendarComponent = new CalendarComponent();
   public  RegistrationPage openPage(){ open("/automation-practice-form/");//открываем нужную страницу
      executeJavaScript("$('#fixedban').remove()"); //скрываем рекламу
      executeJavaScript("$('footer').remove()");//Скрываем футер
       return this;
   };

   public RegistrationPage  setFirstName (String value){
      firstNameInput.setValue(value);
       return this;
   };

   public RegistrationPage setLastName (String value) {
     lastNameInput.setValue(value);
       return this;
        };
    public RegistrationPage  setUserEmail(String value){
        userEmailInput.setValue(value);
        return this;

    };
    public RegistrationPage  setGenter(String value){
    genderWrapper.$(byText(value)).click();
        return this;
        };
    public RegistrationPage setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    };
    public RegistrationPage setDateOfBirth(String day, String month, String year){
        calendarInput.click();
calendarComponent.setDate(day, month, year);
        return this;}
    ;
//public RegistrationPage checkResalt(String key, String value){
}

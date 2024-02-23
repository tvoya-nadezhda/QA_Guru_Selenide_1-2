package guruqa;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;


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
            .setDateOfBirth( "09", "March",  "1900")
            .setSubject("history")
            .setHobbies("Music")
            .setPicture("pic.png")
            .setAddress("London, Kosoy Ptr. Dyryaviy kotel")
            .setState("NCR")
            .setCity("Noida")
            .submit();
//проверки
            registrationPage.checkResult("Student Name", "anna Ivanova")
                    .checkResult("Student Email", "tast@email.fig")
                    .checkResult("Gender", "Female")
                    .checkResult("Mobile", "9001112233")
                    .checkResult("Date of Birth", "09 March,1900")
                    .checkResult("Subjects", "history")
                    .checkResult("Hobbies", "Music")
                    .checkResult("Picture", "pic.png")
                    .checkResult("Address", "London, Kosoy Ptr. Dyryaviy kotel")
                    .checkResult("State and City", "NCR Noida");

        };
       @Test
    void minDataTest (){
           registrationPage.openPage()
                   .setFirstName ("Harry")//Вводим имя
                   .setLastName("Potter") //Вводим Фамилию
                   .setGenter("Male")
                   .setUserNumber("9112233495")
                   .submit();
           registrationPage.checkResult("Student Name", "Harry Potter")
                   .checkResult("Gender", "Male")
                   .checkResult("Mobile", "9112233495");
       };
       @Test void negativeTest(){
           registrationPage.openPage()
                   .submit();

           registrationPage.noResult();
       }



}

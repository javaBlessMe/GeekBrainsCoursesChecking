package ru.geekbrains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.geekbrains.main.CoursesPage;
import ru.geekbrains.main.LoginPage;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class LoginPageTest extends BaseTest {
       //private String headerText;
        @BeforeEach
        @Test
        public void authorizationTest(){
                String headerText;
                driver.get(BASE_URL+"/login");
       
                headerText = new LoginPage(driver)
                .inputLoginAndPassword("hao17583@bcaoo.com","hao17583")
                .PressLoginButton();
                assertThat(headerText,equalTo("Главная"));

        }

        @Test
        public void coursesTest(){
            boolean programQAlvl1,programQAlvl2;
            String listOfCourses =
                        new CoursesPage(driver)
                        .clickNavCourses()
                        .clickAllCourses()
                        .selectFreeCourses()
                        .selectQaCourses()
                        .getListOfCourses();

            assertTrue(listOfCourses.contains("Тестирование ПО. Уровень 1") &&
                                listOfCourses.contains("Тестирование ПО. Уровень 2"));

        }
}

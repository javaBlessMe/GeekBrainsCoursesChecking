package ru.geekbrains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.CoursesPage;
import ru.geekbrains.main.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

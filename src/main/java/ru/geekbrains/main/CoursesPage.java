package ru.geekbrains.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoursesPage extends Page {
    @FindBy(css = "nav > a:nth-child(1)")
    WebElement coursesNavButton;

    @FindBy(id="cour-link")
    WebElement allCourses;

    @FindBy(id = "filter-0")
    WebElement freeCourses;

    @FindBy(id = "filter-9")
    WebElement qaCourses;

    @FindBy(id = "courses-tab")
    WebElement listOfCourses;

    //@FindBy(css=" div:nth-child(22) > a > div.gb-course-card__description > div.gb-course-card__title-wrapper > span")

    public CoursesPage(WebDriver driver) {
        super(driver);
    }

    public CoursesPage clickNavCourses(){
        coursesNavButton.click();
        return this;
    }
    public  CoursesPage clickAllCourses(){
        allCourses.click();
        return this;
    }
    public CoursesPage selectFreeCourses(){
        freeCourses.click();
        return this;
    }
    public CoursesPage selectQaCourses(){
        qaCourses.click();
        return this;
    }

    public String getListOfCourses(){
        return listOfCourses.getText();
    }
}
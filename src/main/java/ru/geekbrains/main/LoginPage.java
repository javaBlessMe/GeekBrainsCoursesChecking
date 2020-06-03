package ru.geekbrains.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Page{
    //private WebDriver driver;

    @FindBy(id = "user_email")
    private WebElement loginField;

    @FindBy(id="user_password")
    private WebElement passwordField;

    @FindBy(css = "div:nth-child(7) > input")
    private WebElement enterButton;

    @FindBy(className = "gb-header__title")
    private WebElement header;

    public LoginPage(WebDriver driver) {
       super((driver));
    }

    public  LoginPage inputLoginAndPassword(String login,String password){
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        return this;
    }

    public String PressLoginButton(){
        enterButton.click();

        return header.getText();
    }
}

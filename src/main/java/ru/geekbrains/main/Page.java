package ru.geekbrains.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

    public abstract class Page {
        private WebDriver driver;

        public Page(WebDriver driver) {
            // this.driver = driver;
            PageFactory.initElements(driver,this);
        }
    }



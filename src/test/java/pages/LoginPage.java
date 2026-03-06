package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {


        public LoginPage() {


            PageFactory.initElements(Driver.getDriver(), this); //this will be help us get element
        }

        @FindBy(name = "username")
        public WebElement username;

        @FindBy(id = "wooden_spoon")
        public WebElement login;

        @FindBy(name = "password")
        public WebElement password;


    }


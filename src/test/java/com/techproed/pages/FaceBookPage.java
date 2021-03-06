package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPage {

    WebDriver driver; //bu sayfanin icinde locate edebilmem icin olusturdum bu sayfada

    //1. adim: parametre olarak WebDriver driver kullanabilecegim bir Constructor olusturmaliyim
    public FaceBookPage(WebDriver driver){

        //driver'i bu sayfada kontrol edebilmek icin bu sayfada da bir driver olusturmaliyim.
        //olusturacagim driver'i instance olarak olusturuyorum ki class'in heryerinde kullanabileyim.

        this.driver=driver;
        PageFactory.initElements(driver,this); //bu sayfadaki driver'imiza ilk degeri vermesi icin

    }

    @FindBy(id="email")
    public WebElement userTextBox;

    @FindBy(id="pass")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButton;
}

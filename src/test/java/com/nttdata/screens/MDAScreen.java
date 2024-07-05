package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MDAScreen extends PageObject {

    //Captamos los xPath
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement btnProducto;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement btnAumentarUnidad;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAgregarAlCarrito;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement btnCarrito;


    public void clickProducto(){

        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(btnProducto));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        btnProducto.click();

    }

    public void clickAumentarUnidad(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(btnAumentarUnidad));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        btnAumentarUnidad.click();
    }

    public void clickAgregarAlCarrito(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(btnAgregarAlCarrito));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        btnAgregarAlCarrito.click();
    }

    public void clickCarrito(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(btnCarrito));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        btnCarrito.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

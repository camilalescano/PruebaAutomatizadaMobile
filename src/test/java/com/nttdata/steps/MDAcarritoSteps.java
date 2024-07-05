package com.nttdata.steps;

import com.nttdata.screens.MDAScreen;
import net.thucydides.core.annotations.Step;

public class MDAcarritoSteps {

    MDAScreen mdaScreen;

    @Step("Click en producto")
    public void clickProducto(){
        mdaScreen.clickProducto();
    }

    @Step("Click en el + para aumentar las unidades")
    public void clickAumentarUnidad(){
        mdaScreen.clickAumentarUnidad();
    }

    @Step("Click en Agregar al Carrito")
    public void clickAgregarAlCarrito(){
        mdaScreen.clickAgregarAlCarrito();
    }

    @Step("Click en el carrito de compras")
    public void clickCarrito(){
        mdaScreen.clickCarrito();
    }
}

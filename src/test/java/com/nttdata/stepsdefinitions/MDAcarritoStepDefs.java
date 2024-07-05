package com.nttdata.stepsdefinitions;

import com.nttdata.steps.MDAcarritoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class MDAcarritoStepDefs {

    @Steps
    MDAcarritoSteps mdAcarritoSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        mdAcarritoSteps.clickProducto();
    }

    @When("agrego una unidad del producto Sauce Labs Backpack")
    public void agregoUnaUnidadDelProductoSauceLabsBackpack() {
        mdAcarritoSteps.clickAumentarUnidad();
        mdAcarritoSteps.clickAgregarAlCarrito();
        mdAcarritoSteps.clickCarrito();
    }

}




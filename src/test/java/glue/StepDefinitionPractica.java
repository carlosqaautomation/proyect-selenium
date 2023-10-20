package glue;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.CartPage;
import page.InventoryPage;
import page.PracticaPage;
import step.BaseSteps;

import java.util.List;
import java.util.Map;

public class StepDefinitionPractica {
    BaseSteps baseSteps = new BaseSteps();
    PracticaPage practicaPage = new PracticaPage();
    InventoryPage inventoryPage = new InventoryPage();

    CartPage cartPage = new CartPage();

    @Given("Ingreso a la pagina SauceDemo")
    public void ingreso_a_la_pagina_sauce_demo() {
        baseSteps.openBrowser();
    }
    @When("ingreso mis credenciales")
    public void ingreso_mis_credenciales(DataTable dataTable) {
        List<Map<String,String>> datas = dataTable.asMaps(String.class,String.class);
        for (Map<String,String> data: datas) {
            practicaPage.writeUserName(data.get("user"));
            practicaPage.writePassword(data.get("password"));
        }
    }
    @When("inicio sesion")
    public void inicio_sesion() {
        practicaPage.clickLogin();
    }
    @When("agrego un producto al carrito {string}")
    public void agrego_un_producto_al_carrito(String name) {
        inventoryPage.addProductCart(name);
    }
    @Then("valido que se cargo el producto al carrito")
    public void valido_que_se_cargo_el_producto_al_carrito() {
        inventoryPage.countDisplayed();
    }
    @When("ingreso al menu")
    public void ingreso_al_menu() {

    }
    @When("cierro sesion")
    public void cierro_sesion() {

    }
    @Then("valido estar en la vista login")
    public void valido_estar_en_la_vista_login() {

    }
    @Then("valido me carguen los productos")
    public void valido_lista_productos() {
        boolean data;
        if (inventoryPage.getLengthListProduct() > 0){
            data = true;
        } else {
            data = false;
        }
        Assert.assertTrue("lista de productos cargada",data);
    }

    @When("elimino el producto del carrito")
    public void elimino_producto_carrito() throws InterruptedException {
        Thread.sleep(3000);
        inventoryPage.goToCart();
        Thread.sleep(3000);
        cartPage.removeProduct();
    }

    @Then("valido que el carrito este vacio")
    public void valido_carrito_vacio() {
        Assert.assertTrue("carrito vacio",inventoryPage.cartEmpty());
    }


}

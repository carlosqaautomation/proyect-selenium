package glue;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.PracticaPage;
import step.BaseSteps;

import java.util.List;
import java.util.Map;

public class StepDefinitionPractica {
    BaseSteps baseSteps = new BaseSteps();
    PracticaPage practicaPage = new PracticaPage();

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
    @When("agrego un producto al carrito")
    public void agrego_un_producto_al_carrito() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("valido que se cargo el producto al carrito")
    public void valido_que_se_cargo_el_producto_al_carrito() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("ingreso al menu")
    public void ingreso_al_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("cierro sesion")
    public void cierro_sesion() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("valido estar en la vista login")
    public void valido_estar_en_la_vista_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("valido me carguen los productos")
    public void valido_lista_productos() {

    }

    @When("elimino el producto del carrito")
    public void elimino_producto_carrito() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("valido que el carrito este vacio")
    public void valido_carrito_vacio() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}

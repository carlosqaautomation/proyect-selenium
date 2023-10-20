@practica
Feature: Ejercicios de la practica
  Background:
    Given Ingreso a la pagina SauceDemo

  @caso-1
  Scenario: Login exitoso
    When ingreso mis credenciales
      | user          | password     |
      | standard_user | secret_sauce |
    And inicio sesion
    Then valido me carguen los productos

  @caso-2
  Scenario: Añadir producto al carrito
    When ingreso mis credenciales
      | user          | password     |
      | standard_user | secret_sauce |
    And inicio sesion
    And agrego un producto al carrito "Sauce Labs Onesie"
    Then valido que se cargo el producto al carrito

  @caso-3
  Scenario: Remover un producto del carrito
    When ingreso mis credenciales
      | user          | password     |
      | problem_user | secret_sauce |
    And inicio sesion
    And agrego un producto al carrito "Sauce Labs Onesie"
    And elimino el producto del carrito
    Then valido que el carrito este vacio

  @caso-4 @pendiente
  Scenario: Cerrar sesion exitoso
    When ingreso mis credenciales
      | user          | password     |
      | standard_user | secret_sauce |
    And inicio sesion
    And ingreso al menu
    And cierro sesion
    #Then valido estar en la vista login
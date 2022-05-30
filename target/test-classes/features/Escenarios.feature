@SaurceLabsWeb
Feature: proyecto de automatizacion web de saurcelabs

  @Caso1
  Scenario Outline: Realizar login correcto
    Given Abro el navegador
    When ingreso usuario y clave <usuario> <clave>
    Then Validar login correcto <mensaje>

    Examples:
      | usuario | clave | mensaje |
      | "standard_user" | "secret_sauce" | "PRODUCTS" |
      | "locked_out_user" | "secret_sauce" | "PRODUCTS" |
  @Caso2
  Scenario Outline: Realizar login Fallido
    Given Abro el navegador
    When ingreso usuario y clave <usuario> <clave>
    Then Validar login Fallido <mensaje>

    Examples:
      | usuario | clave | mensaje |
      | "standard_user" | "secret_sauce123" | "Epic sadface: Username and password do not match any user in this service" |
      | "standard_user" | "secret_sauce" | "Epic sadface: Username and password do not match any user in this service" |
  @Caso3
  Scenario Outline: Realizar login usuario bloqueado
    Given Abro el navegador
    When ingreso usuario y clave <usuario> <clave>
    Then Validar login bloqueado <mensaje>

    Examples:
      | usuario | clave | mensaje |
      | "locked_out_user" | "secret_sauce" | "Epic sadface: Sorry, this user has been locked out." |
      | "standard_user" | "secret_sauce" | "Epic sadface: Sorry, this user has been locked out." |
  @Caso4
  Scenario Outline: Cerrar Sesion exitosamente
    Given Abro el navegador
    When ingreso usuario y clave <usuario> <clave>
    And cierro sesion
    Then Validar si cerro sesion

    Examples:
      | usuario | clave |
      | "standard_user" | "secret_sauce" |
      | "locked_out_user" | "secret_sauce" |
  @Caso5
  Scenario Outline: Cerrar Sesion exitosamente y volver atras
    Given Abro el navegador
    When ingreso usuario y clave <usuario> <clave>
    And cierro sesion y vuelvo a atras
    Then Validar si cerro sesion

    Examples:
      | usuario | clave |
      | "standard_user" | "secret_sauce" |
      | "locked_out_user" | "secret_sauce" |
    @Caso6
    Scenario Outline: Realizar Compra Exitosa
      Given Abro el navegador
      When ingreso usuario y clave <usuario> <clave>
      And agrego al carrito y realizo compra <nombre> <apellido> <cPostal>
      Then Validar compra exitosa <mensaje>

      Examples:
        | usuario | clave | nombre|apellido|cPostal|mensaje |
        | "standard_user" | "secret_sauce" | "test"|"prueba"|"012102"|"THANK YOU FOR YOUR ORDER" |
        | "locked_out_user" | "secret_sauce" | "test"|"prueba"|"012102"|"THANK YOU FOR YOUR ORDER" |
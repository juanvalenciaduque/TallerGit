@tag
Feature: Login en Guru99
  Deseo loguearme en la pagina de Guru99

  @tag1
  Scenario: Login
    Given Deseo realizar un Fund Transfer
    When Ingreso con usuario y contrasenia
      | user       | password  |
      | mngr342463 | @AbUgYvY1 |
    And Consulto deposito de la cuenta payees
      | 95074 |
    And Ingreso con usuario y contrasenia
      | user       | password |
      | mngr342464 | YzumAvu  |
    And Consulto deposito de la cuenta payers
      | 95075 |
    And Ingreso a la opcion Fund Transfer
    And Diligencio los campos en Fund Transfer y presiono submit
      | PayersAccount | PayeesAccount | Amount | Description |
      |         95075 |         95074 |    100 | Prueba      |
    Then Consulto nuevo deposito de la cuenta payers
      | 95075 |
    And Verifico que el valor fue descontado correctamente en la cuenta Payers
    And Ingreso con usuario y contrasenia
      | user       | password  |
      | mngr342463 | @AbUgYvY1 |
    And Consulto nuevo deposito de la cuenta payees
      | 95074 |
    And Verifica que el valor fue agregado correctamente en la cuenta Payees

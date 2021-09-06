@tag
Feature: Login en Guru99
  Deseo loguearme en la pagina de Guru99

  @tag1
  Scenario: Login
    Given Deseo realizar un fund tranfer sin el campo Payees account no
    When Ingreso con usuario y contrasenia
      | user       | password  |
      | mngr347268 | @gErEhYv1 |
    When Ingreso a la opcion Fund Transfer
    And Diligencio los campos en Fund Transfer
      | PayersAccount | PayeesAccount | Amount | Description |
      |         93313 |               |    100 | Prueba      |
    Then Verifico el mensaje de Payees account No nulo
      | Payees Account Number must not be blank |

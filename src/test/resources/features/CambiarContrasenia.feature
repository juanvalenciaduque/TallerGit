@tag
Feature: Login en Guru99
  Deseo loguearme en la pagina de Guru99

  @tag1
  Scenario: Login
    Given Deseo modificar mi contrasenia y loguearme con ella
    When Ingreso con usuario y contrasenia
      | user       | password |
      | mngr347268 | gErEhYv  |
    And Ingreso a modificacion de contrasenia
    And Diligencio los campos en modificacion de contrasenia
      | OldPassword | NewPassword | ConfirmPassword |
      | gErEhYv     | @gErEhYv1   | @gErEhYv1       |
    And Ingreso con usuario y nueva contrasenia
      | user       | password  |
      | mngr347268 | @gErEhYv1 |
    Then Verifico el usuario
      | mngr347268 |

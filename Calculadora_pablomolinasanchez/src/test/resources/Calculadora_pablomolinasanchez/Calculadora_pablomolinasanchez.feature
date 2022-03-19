
@tag
Feature: Tengo una calculadora
  ¿Alguien quiere hacer alguna operación matemática, saber factorial o si es primo?

  @tag1
  Scenario Outline: Suma
    Given Quiero sumar <a> y <b>
    When Nosotros sumamos <a> y <b>
    Then El resultado final es <result>
   		| a | b | result | 
      | 1 | 1 |   2    | 
      | 2 | 2 |   4    |
   @tag2
  Scenario Outline: Resta
    Given Quiero resta <a> y <b>
    When Nosotros restamos <a> y <b>
    Then El resultado final es <result>
   		| a | b | result | 
      | 1 | 1 |   0    | 
      | 2 | 1 |   1    |
    @tag3
  Scenario Outline: Multiplicacion
    Given Quiero multiplicar <a> y <b>
    When Nosotros multiplicamos <a> y <b>
    Then El resultado final es <result>
   		| a | b | result | 
      | 1 | 7 |   7    | 
      | 2 | 3 |   6    |
    @tag4
  Scenario Outline: Dividimos
    Given Quiero dividir <a> y <b>
    When Nosotros dividimos <a> y <b>
    Then El resultado final es <result>
   		| a | b | result | 
      | 8 | 2 |   4    | 
      | 8 | 4 |   2    |
  @tag5
  Scenario: Primo
    Given Quiero saber si 3 es primo
    When Compruebo si 3 es primo
    Then True 
     @tag5
  Scenario: Factorial
    Given Quiero saber el factorial de 4
    When Compruebo el factorial de 4
    Then 24 

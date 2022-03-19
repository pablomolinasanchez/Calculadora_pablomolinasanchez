package Calculadora_pablomolinasanchez;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
	private double a,b;
    private double result;
    private Calculadora_pablomolinasanchez c;

    @Given("Quiero sumar <a> y <b>")
    public void quiero_Sumar() {
    	c=new Calculadora_pablomolinasanchez();
    }

    @When("Nosotros sumamos <a> y <b>")
    private double sumar(double a, double b, double result) {
    	this.a=a;
    	this.b=b;
    	result=a+b;
    	return result;
    }

     @Then("El resultado final es <result>")
        public void resultadoSuma() {
    	 assertEquals(c.suma(this.a, this.b),result);
        }
     
     
     @Given("Quiero restar <a> y <b>")
     public void quiero_restar() {
     	c=new Calculadora_pablomolinasanchez();
     }

     @When("Nosotros restamos <a> y <b>")
     private double restar(double a, double b, double result) {
     	this.a=a;
     	this.b=b;
     	result=a-b;
     	return result;
     }

      @Then("El resultado final es <result>")
         public void resultadoResta() {
     	 assertEquals(c.resta(this.a, this.b),result);
         }
      
      
      @Given("Quiero multiplicar <a> y <b>")
      public void quiero_Mult() {
      	c=new Calculadora_pablomolinasanchez();
      }

      @When("Nosotros multiplicamos <a> y <b>")
      private double mult(double a, double b, double result) {
      	this.a=a;
      	this.b=b;
      	result=a*b;
      	return result;
      }

       @Then("El resultado final es <result>")
          public void resultadoMult() {
      	 assertEquals(c.mult(this.a, this.b),result);
          }
       
       
       @Given("Quiero dividir <a> y <b>")
       public void quiero_Div() {
       	c=new Calculadora_pablomolinasanchez();
       }

       @When("Nosotros dividimos <a> y <b>")
       private double div(double a, double b, double result) {
       	if(b==0) {
			throw new ArithmeticException();
		}
       	this.a=a;
       	this.b=b;
       	result=a/b;
       	return result;
		
       }

        @Then("El resultado final es <result>")
           public void resultadoDiv() {
       	 assertEquals(c.divide(this.a, this.b),result);
           }
        
        
        @Given("Quiero saber el factorial de 4")
        public void quiero_Factorial() {
        	c=new Calculadora_pablomolinasanchez();
        }

        @When("Compruebo el factorial de 4")
        private int factorial() {
        	this.a=4;
        	int result=c.fact((int)this.a);
        	return result;
        }

         @Then("24")
            public void resultadoFactorial() {
        	 assertEquals(factorial(),24);
            }
         
         
         @Given("Quiero saber si 3 es primo")
         public void quiero_Primo() {
         	c=new Calculadora_pablomolinasanchez();
         }

         @When("Compruebo si 3 es primo")
         private boolean primo() {
         	this.a=3;
         	boolean result=c.esPrimo((int)this.a);
         	return result;
         }

          @Then("True")
             public void resultado() {
         	 assertEquals(primo(),true);
             }
}

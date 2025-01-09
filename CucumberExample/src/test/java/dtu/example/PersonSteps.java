package dtu.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;


public class PersonSteps {

    PersonService service = new PersonService();
    Person person;
    Exception exception;


    @Given("the default person has name {string} and address {string}")
    public void theDefaultPersonHasNameAndAddress(String string, String string2) throws PersonException {
        service.setPerson(new Person(string,string2));
    }


    @When("I call the person service")
    public void i_call_the_person_service() {
        person = service.getPerson();
    }

    @Then("i get the answer a person with name {string} address {string}")
    public void i_get_the_answer_a_person_with_name_address(String string, String string2) {
        assertEquals(new Person(string, string2), person);
    }

    @When("i update the person to {string} {string}")
    public void i_update_the_person_to(String string, String string2) {
        try{
            service.setPerson(new Person(string, string2));
        } catch (Exception e) {
            exception = e;

        }
    }

    @Then("I get the answer a person with the name {string} address {string}")
    public void iGetTheAnswerAPersonWithTheNameAddress(String string, String string2) {
        assertEquals(new Person(string, string2), person);
    }


    @Then("the update fails with PersonException and error {string}")
    public void theUpdateFailsWithPersonExceptionAndError(String string) {
        assertNotNull(exception);
        assertTrue(exception instanceof PersonException);
        assertEquals(string, exception.getMessage());
    }


    @When("I update the person to {string} {string}")
    public void iUpdateThePersonTo(String string, String string2){
        try{
            service.setPerson(new Person(string, string2));
        } catch (Exception e) {
            exception = e;

        }
    }
}
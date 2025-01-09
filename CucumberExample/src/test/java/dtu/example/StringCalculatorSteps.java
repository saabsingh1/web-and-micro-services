package dtu.example;

import static org.junit.Assert.assertEquals;

import StringCalculator.StringCalculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StringCalculatorSteps {

	StringCalculator sc = new StringCalculator();
	String numbers;
	String errorMessage;


	@Given("an empty string")
	public void anEmptyString() throws Exception {
		numbers = "";
	}

	@When("the empty string is passed to the add method")
	public void theEmptyStringIsPassedToTheAddMethod() throws Exception {
		sc.addInt(numbers);
	}

	@Then("the method should return 0")
	public void theMethodShouldReturn0() throws Exception {
		assertEquals(0, sc.addInt(numbers));
	}

	@Given("a number")
	public void aNumber() throws Exception{
		numbers = "1";
	}

	@When("the number is passed to the add method")
	public void theNumberIsPassedToTheAddMethod() throws Exception {
		sc.addInt(numbers);
	}


	@Then("the method should return the number")
	public void theMethodShouldReturnTheNumber() throws Exception {
		assertEquals(1, sc.addInt(numbers));
	}


	@Given("two numbers")
	public void twoNumbers() throws Exception {
		numbers = "1,2";
	}


	@When("the numbers are passed to the add method")
	public void theNumbersArePassedToTheAddMethod() throws Exception {
		sc.addInt(numbers);
	}


	@Then("the method should return the sum of the numbers")
	public void theMethodShouldReturnTheSumOfTheNumbers() throws Exception {
		assertEquals(3, sc.addInt(numbers));
	}


	@Given("multiple numbers are passed")
	public void multipleNumbersArePassed() throws Exception {
		numbers = "1,2,3,4,5";
	}

	@When("multiple numbers are passed to the add method")
	public void multipleNumbersArePassedToTheAddMethod() throws Exception{
		sc.addInt(numbers);
	}

	@Then("the methods should return the sum of the numbers")
	public void theMethodsShouldReturnTheSumOfTheNumbers() throws Exception{
		assertEquals(15, sc.addInt(numbers));
	}

	@Given("input with newlines in between numbers")
	public void inputWithNewlinesInBetweenNumbers() throws Exception{
		numbers = "1\n2,3";
		numbers = numbers.replace("\\n","\n");
	}

	@When("input is passed with newlines between numbers")
	public void inputIsPassedWithNewlinesBetweenNumbers() throws Exception{
		sc.addInt(numbers);
	}

	@Then("the add method should handle newlines")
	public void theAddMethodShouldHandleNewlines() throws Exception{
		assertEquals(6,sc.addInt(numbers));
	}

	@Given("input is with delimiters")
	public void inputIsWithDelimiters() throws Exception{
		numbers = "//;\n;2";
		numbers = numbers.replace("\\n","\n");
	}


	@When("input is passed")
	public void inputIsPassed() throws Exception {
		sc.addInt(numbers);

	}

	@Then("sum should be returned")
	public void sumShouldBeReturned() throws Exception {
		assertEquals(3, sc.addInt(numbers));
	}
}

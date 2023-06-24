package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import io.cucumber.java.en.*;

@Test
public class LoginFunctionality {
	WebDriver driver;

	@Given("user navigate to the login page")
	public void user_navigate_to_the_login_page() {

		driver = new ChromeDriver();
		Configuration.screenshots = true;
		driver.get("https://practicetestautomation.com/practice-test-login/");

	}

	@When("user enter the valid gmail id <studentName>")
	public void user_enter_the_valid_gmail_id_student_name(String studentName) throws InterruptedException {
		Configuration.screenshots = true;
		driver.findElement(By.id("username")).sendKeys(studentName);
		Thread.sleep(2000);

	}

	@When("user enter the valid password <Password>")
	public void user_enter_the_valid_password_password(String Password) {
		driver.findElement(By.id("password")).sendKeys(Password);
	}

	@And("user  click to login")
	public void user_click_to_login() {

		driver.findElement(By.id("submit")).click();

	}

	@Then("user should be login successfully")
	public void user_should_be_login_successfully() {

		System.out.println("we can see the login page successfully");
	}

}
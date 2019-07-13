package tests.practice.cucumber.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddOne {
	static WebDriver driver;

	@Given("should be in telecom homepage and click on add customer")
	public void should_be_in_telecom_homepage_and_click_on_add_customer() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arka\\Documents\\Eclipse Workspace Oxygen\\cucumber.practice\\src\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a")).click();
	}

	@When("The user should provide valid details <fName>, <lName>, <email> , <address>, <phone>")
	public void the_user_should_provide_valid_details_fName_lName_email_address_phone() {
		driver.findElement(By.xpath("//label[text()=\"Done\"]")).click();
		driver.findElement(By.id("fname")).sendKeys("arka");
		driver.findElement(By.id("lname")).sendKeys("sen");
		driver.findElement(By.id("email")).sendKeys("arka.sen@gmail.com");
		driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys("Chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("9981487573");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
	}

	@Then("validate customer id")
	public void validate_customer_id() {
		Assert.assertTrue(
				driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[1]/td[1]")).isDisplayed());
		driver.quit();
	}

}

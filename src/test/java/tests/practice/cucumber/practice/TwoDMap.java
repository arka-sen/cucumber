package tests.practice.cucumber.practice;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TwoDMap {
	static WebDriver driver;

	@Given("The user clicks on add customer from telecom homepage")
	public void the_user_clicks_on_add_customer_from_telecom_homepage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arka\\Documents\\Eclipse Workspace Oxygen\\cucumber.practice\\src\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a")).click();

	}

	@When("The user inputs data")
	public void the_user_inputs_data(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
		driver.findElement(By.xpath("//label[text()=\"Done\"]")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get(0).get("fName"));
		driver.findElement(By.id("lname")).sendKeys(data.get(0).get("lName"));
		driver.findElement(By.id("email")).sendKeys(data.get(0).get("email"));
		driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys(data.get(0).get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(0).get("phone"));
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
	}

	@Then("validate the customer")
	public void validate_the_customer() {
		Assert.assertTrue(
				driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[1]/td[1]")).isDisplayed());
		driver.quit();
	}

}

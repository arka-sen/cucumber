package tests.practice.cucumber.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TwoDList {
	static WebDriver driver;

	@Given("The user is on homepage of telecom and clicks on add customer")
	public void the_user_is_on_homepage_of_telecom_and_clicks_on_add_customer() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arka\\Documents\\Eclipse Workspace Oxygen\\cucumber.practice\\src\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a")).click();
	}

	@When("The user enters data")
	public void the_user_enters_data(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		driver.findElement(By.xpath("//label[text()=\"Done\"]")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("lname")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("email")).sendKeys(data.get(0).get(2));
		driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys(data.get(0).get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(0).get(4));
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
	}

	@Then("Validate data")
	public void validate_data() {
		Assert.assertTrue(
				driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[1]/td[1]")).isDisplayed());
		driver.quit();
	}

}

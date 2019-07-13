package tests.practice.cucumber.practice;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OneDMap {
	static WebDriver driver;
	@Given("Go to telecom home and click on new customer")
	public void go_to_telecom_home_and_click_on_new_customer() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arka\\Documents\\Eclipse Workspace Oxygen\\cucumber.practice\\src\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a")).click();
	}

	@When("the user provides valid details")
	public void the_user_provides_valid_details(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		driver.findElement(By.xpath("//label[text()=\"Done\"]")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(data.get("lname"));
		driver.findElement(By.id("email")).sendKeys(data.get("email"));
		driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys(data.get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get("phone"));
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
	}

	@Then("Validate user")
	public void validate_user() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[1]/td[1]")).isDisplayed());
		driver.quit();
	}

}

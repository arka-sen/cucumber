package tests.practice.cucumber.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Add {
	static WebDriver driver;

	@Given("The user should be in telecom homepage and click on add customer")
	public void the_user_should_be_in_telecom_homepage_and_click_on_add_customer() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arka\\Documents\\Eclipse Workspace Oxygen\\cucumber.practice\\src\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a")).click();
	}

	@When("The user should provide valid details {string}, {string}, {string} , {string}, {string}")
	public void the_user_should_provide_valid_details(String fName, String lName, String email, String address,
			String phone)  {
		driver.findElement(By.xpath("//label[text()=\"Done\"]")).click();
		driver.findElement(By.id("fname")).sendKeys(fName);
		driver.findElement(By.id("lname")).sendKeys(lName);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys(address);
		driver.findElement(By.id("telephoneno")).sendKeys(phone);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[9]/ul/li[1]/input")).click();

	}

	@Then("the user validates the customer id")
	public void the_user_validates_the_customer_id() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[2]/td")).isDisplayed());
		driver.quit();
	}

}

package StepDefinition;

import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;
import io.cucumber.java.en.*;


public class StepDefinition {
	
	

	WebDriver driver=null;
	WebElement element;
		@Given("browser is open")
		public void browser_is_open() {
			System.out.println("Inside Step - browse is open");
			String projectPath = System.getProperty("user.dir");
			System.out.println("Project Path is : +projectPath");	
			System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
			
			driver = new ChromeDriver();
			
			
		}

	@Given("user in on login page")
	public void user_in_on_login_page() {
		System.out.println("Inside Step - user is on login page");
		driver.navigate().to("https://www.saucedemo.com/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
	   driver.findElement(By.id("user-name")).sendKeys(username);
	   driver.findElement(By.id("password")).sendKeys(password);
	   System.out.println("Inside Step - user enter username and password");
	}
	@Then("^user input (.*) and (.*)and (.*)$")
	public void user_enters_username_and_password(String Firstname, String Lastname, String ZIP) {
	   driver.findElement(By.id("first-name")).sendKeys(Firstname);
	   driver.findElement(By.id("last-name")).sendKeys(Lastname);
	   driver.findElement(By.id("postal-code")).sendKeys(ZIP);
	   System.out.println("Inside Step - user enter firstname,lastname and zip");
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
	    driver.findElement(By.id("login-button")).click();
	    System.out.println("Inside Step - user click login");
	}

	@Then("user are navigated to the homepage")
	public void user_are_navigated_to_the_homepage() throws InterruptedException {
	   driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).isDisplayed();
	   Thread.sleep(3000);
	   System.out.println("user are navigated to the homepage");
	   }
	

	@Then("user click image product")
	public void user_click_image_product() {
		driver.findElement(By.id("item_4_img_link")).click();							
		System.out.println("Inside Step - user click image product");
	}

	@Then("user navigated to detail product")
	public void user_navigated_to_detail_product() throws InterruptedException {
		driver.findElement(By.id("back-to-products")).isDisplayed();
		   Thread.sleep(3000);
		   System.out.println("Inside Step - user navigated to detail product");
	}

	@Then("user click button Add To Cart")
	public void user_click_button_add_to_cart() throws InterruptedException {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();	
		Thread.sleep(3000);
		System.out.println("Inside Step - user click button Add To Cart");
	}



	@Then("user click cart")
	public void user_click_cart() throws InterruptedException {
		driver.findElement(By.id("shopping_cart_container")).click();
		Thread.sleep(2000);
		System.out.println("Inside Step - user click cart");
	}

	@Given("user on cart page")
	public void user_on_cart_page() throws InterruptedException {
		driver.navigate().to("https://www.saucedemo.com/cart.html");
		Thread.sleep(2000);
		System.out.println("Inside Step - user on cart page");
	}
	

	@Given("user click button remove")
	public void user_click_button_remove() throws InterruptedException {
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();	

		System.out.println("Inside Step - user click remove button");
		Thread.sleep(2000);
		
	}

	@Then("user click button Continue Shopping")
	public void user_click_button_continue_shopping() throws InterruptedException {
		driver.findElement(By.id("continue-shopping")).click();
		Thread.sleep(2000);
		System.out.println("Inside Step - user click button Continue Shopping");
		
	}

	@Then("user click button Checkout")
	public void user_click_button_checkout() {
		driver.findElement(By.id("checkout")).click();

		System.out.println("Inside Step - user click checkout button");
	}

	@Then("user click button Continue")
	public void user_click_button_continue() throws InterruptedException {
		driver.findElement(By.id("continue")).click();

		System.out.println("Inside Step - user click checkout button");
		
		Thread.sleep(2000);
	}

	@Then("user click button finish")
	public void user_click_button_finish() throws InterruptedException {
		driver.findElement(By.id("finish")).click();

		System.out.println("Inside Step - user click finish button");
		
		Thread.sleep(1000);
	}

	@Then("user navigated to checkout complete page")
	public void user_navigated_to_checkout_complete_page() throws InterruptedException {
		driver.findElement(By.id("back-to-products")).isDisplayed();

		System.out.println("Inside Step - user can see Checkout: Complete! page");
		
		Thread.sleep(2000);
	}

	@Then("user click button Back To Home")
	public void user_click_button_back_to_home() throws InterruptedException {
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(1000);
		System.out.println("Inside Step - user click button Back To Home");
	}
	@Then("user click sorting")
	public void user_click_sorting() throws InterruptedException {
		driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
		Thread.sleep(1000);
		System.out.println("Inside Step - user click sorting");
	}

	@Then("user select sorting price\\(Low to high)")
	public void user_select_sorting_price_low_to_high() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[3]")).click();
		Thread.sleep(5000);
		System.out.println("Inside Step - user select sorting price (Low to high)");
	}

	@Then("system show sorted product")
	public void system_show_sorted_product() throws InterruptedException {
		driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Onesie']")).isDisplayed();
		Thread.sleep(2000);
	}

	@Then("user click side navigation menu")
	public void user_click_side_navigation_menu() throws InterruptedException {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		System.out.println("Inside Step - user click logout");
	}

	@Then("user click logout")
	public void user_click_logout() throws InterruptedException {
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(1000);
		System.out.println("Inside Step - user click logout");
	}

	
	@Then(".*?close browser$")
	public void closeBrowser() {
		driver.close();
	}
	
}

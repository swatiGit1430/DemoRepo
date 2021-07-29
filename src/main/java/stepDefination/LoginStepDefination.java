package stepDefination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import extentReport.ExtentReportsBasicDemo;



public class LoginStepDefination extends ExtentReportsBasicDemo  {
	
	WebDriver driver;

		
	@Given("^: User is on Login Page$")
	public void user_is_on_Login_Page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\MyProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com");
		
		
	}

	@When("^: Title of page is Free CRM$")
	public void title_of_page_is_Free_CRM()  {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		System.out.println(title);
		//#1 Free CRM customer relationship management software cloud
		Assert.assertEquals(title, "#1 Free CRM customer relationship management software cloud");
		
	}
	
	/*
	 * @Then("^: User enter \"(.*)\" & \"(.*)\"$") public void
	 * user_enter_Username_Password(String Username, String Password) { // Write
	 * code here that turns the phrase above into concrete actions
	 * driver.findElement(By.xpath("//a/span[text()=\"Log In\"]")).click();
	 * driver.findElement(By.name("email")).sendKeys(Username);
	 * driver.findElement(By.name("password")).sendKeys(Password); }
	 */
	
	@Then("^: User enter Username & Password$")
	public void user_enter_Username_Password(DataTable table)  {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<List<String>> data = table.raw();
		driver.findElement(By.xpath("//a/span[text()=\"Log In\"]")).click();
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}
	
	@Then("^: User click Login Button$")
	public void user_click_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//form//div[text()=\"Login\"]")).click();
	}
	
	@Then("^: User is on Home Page$")
	public void user_is_on_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Assert.assertEquals(driver.getTitle(),"Cogmento CRM");
	}

	@Then("^: User moves to contact page$")
	public void user_moves_to_contact_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
	    Thread.sleep(5000);
	    Actions action = new Actions(driver);
	    
	    WebElement menuOption = driver.findElement(By.xpath("//div[@id=\"main-nav\"]/descendant::span[contains(text(),'Contacts')]"));
	    
	    action.moveToElement(menuOption).build().perform();
	    
	    Thread.sleep(5);
	    driver.findElement(By.xpath("//div[@id=\"main-nav\"]/descendant ::span[text()=\"Contacts\"]")).click();
	    //i[contains(@class, 'users icon')]
	    
	    Thread.sleep(5);
	    //User clicks on New
	    driver.findElement(By.xpath("//a/button[contains(text(),'New')]")).click();
	    
	    
	}
	
	
	@Then("^: User moves to new deals page$")
	public void user_moves_to_new_deals_page() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(5000);
	    Actions action = new Actions(driver);
	    
	    WebElement menuOption = driver.findElement(By.xpath("//div[@id=\"main-nav\"]/descendant::span[contains(text(),'Deals')]"));
	    
	    action.moveToElement(menuOption).build().perform();
	    
	    Thread.sleep(5);
	    driver.findElement(By.xpath("//div[@id=\"main-nav\"]/descendant::span[text()=\"Deals\"]")).click();
	   
	    
	    Thread.sleep(5);
	    //User clicks on New
	    driver.findElement(By.xpath("//a/button[contains(text(),'New')]")).click();
	    
	}

	@Then("^: User enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_and(String firstname, String lastname, String position) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
	   driver.findElement(By.name("first_name")).sendKeys(firstname);
	   driver.findElement(By.name("last_name")).sendKeys(lastname);
	   driver.findElement(By.name("position")).sendKeys(position);
	   
	   driver.findElement(By.xpath("//div[@id=\"dashboard-toolbar\"]/descendant::button[text()=\"Save\"]")).click();
	}
	
	@Then("^: User enters deal details$")
	public void user_enters_deal_details(DataTable table2) {
		
		for (Map<String, String> data : table2.asMaps(String.class, String.class)){
		
		driver.findElement(By.name("title")).sendKeys(data.get("Title"));
		driver.findElement(By.name("amount")).sendKeys(data.get("Amount"));
		driver.findElement(By.name("commission")).sendKeys(data.get("Commission"));
		
		driver.findElement(By.xpath("//div[@id=\"dashboard-toolbar\"]/descendant::button[text()=\"Save\"]")).click();
	    
	}
	}
	
	
	

	@Then("^: Close the browser$")
	public void close_the_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
	    driver.quit();
	}

	
	
}

package StepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class Jamtangan {
	WebDriver driver=null;
	@Given("user open website JAMTANGAN")
	public void user_open_website_JAMTANGAN() throws InterruptedException {
		System.out.println("Inside Step -Browser Is Open website JAMTANGAN");
		System.setProperty("webdriver.chrome.driver","C:/Users/user/eclipse-workspace/CucumberJava/src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.navigate().to("https://www.jamtangan.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Nanti Saja')]")).click();
		driver.manage().window().maximize(); 
	}
	@When("user login account")
	public void user_login_account() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='login-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='modal-root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/input[1]"))
		.sendKeys("prastinyo29@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='modal-root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/input[1]"))
		.sendKeys("Khalwa29*");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='modal-root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]")).click();
		System.out.println("Inside Step - Login Account ");
		Thread.sleep(3000);

		;
	}

	@Then("user see dashboard")
	public void user_see_dashboard() throws InterruptedException {
		System.out.println("Inside Step - User see dashboard");
		Thread.sleep(5000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1050)", "");
		Thread.sleep(1000);
	}

	@Given("user see some watches on dashboard")
	public void user_see_some_watches_on_dashboard() {
		System.out.println("Inside Step - User see jam tangan");

	}

	@When("user choose one of the watch below 10 million")
	public void When_user_choose_one_of_the_watch_below_10_million() throws InterruptedException {
		System.out.println("Inside Step -user choose one of the watches under 10 million");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//iframe[@id='moe-onsite-campaign-6587da5efbd0a640ffb6c179']")).click();
		Thread.sleep(5000);
		WebElement e =driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(e).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Seiko')]")).click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0,530)");
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/input[1]"))
		.sendKeys("2.000.000");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[2]/div[1]/div[2]/input[1]"))
		.sendKeys("10.000.000");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Tampilkan')]")).click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(500,200)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/picture[1]/img[1]")).click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(1200,0)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[2]/section[1]/div[1]/div[2]/div[3]/div[1]/div[2]/button[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Ubah Alamat')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'ubah')]")).click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0,700)");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[contains(text(),'Simpan')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[@id='modal-root']/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]")).click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(500,0)");
		Thread.sleep(5000); 

		driver.findElement(By.xpath("//div[contains(text(),'Pilih Pengiriman')]")).click();
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/main[1]/section[1]/div[2]/div[3]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/p[2]")).click();
		WebElement drppengirimanjam=driver.findElement(By.xpath("//div[contains(text(),'Pilih Pengiriman')]"));
		Select drppengiriman=new Select(drppengirimanjam);
		drppengiriman.selectByVisibleText("JNE YES");

	}

	@Then("User Pay")
	public void Then_User_Pay() throws InterruptedException {
		System.out.println("Inside Step - User pay");
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//button[contains(text(),'Pilih Pembayaran')]")).click();
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//p[contains(text(),'Virtual Account')]")).click();
		Thread.sleep(5000); 
		driver.close(); 

	}


}

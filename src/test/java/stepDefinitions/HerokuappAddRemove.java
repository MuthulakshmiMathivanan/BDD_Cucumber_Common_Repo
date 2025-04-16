package stepDefinitions;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HerokuappAddRemove {

	WebDriver driver = new ChromeDriver();

	@Given("user lauch the herokuapp automation page")
	public void user_lauch_the_herokuapp_automation_page() {

		driver.get("https://the-internet.herokuapp.com/");

	}


	@When("User click the add remove elements")
	public void user_click_the_add_remove_elements() {

		String defaultwindow= driver.getWindowHandle();

		WebElement addremoveelement= driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a"));

		String openInNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		addremoveelement.sendKeys(openInNewTab);

		Set<String> allwindows= driver.getWindowHandles();

		driver.switchTo().window(allwindows.iterator().next());

		for (String handel : allwindows) {

			if (!handel.equals(defaultwindow)) {

				driver.switchTo().window(handel);

				System.out.println("Get Tittle" + " " + driver.getTitle());
				break;
			}

		}


	}


	@Then("verify stale element execption")
	public void verify_stale_element_execption() {

		WebElement addelement= driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));

		addelement.click();

		addelement.click();

		addelement.click();

		List<WebElement> title= driver.findElements(By.xpath("//button[@class='added-manually' and @onclick='deleteElement()']"));

		WebElement deletebutton = title.get(0);

		deletebutton.click();

		for (WebElement link : title) {

			try {
				System.out.println(link.getText());
			} catch (StaleElementReferenceException e) {
				List<WebElement> title1= driver.findElements(By.xpath("//button[@class='added-manually' and @onclick='deleteElement()']"));
				System.out.println("Output: " + " " + title1);
			}  

		}

		driver.quit();


	}


}

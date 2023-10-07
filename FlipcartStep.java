package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartSteps {
    WebDriver driver;
    @Given("I navigate to flipkart.com")
    public void i_navigate_to_flipkart_com() {
        System.setProperty("webdriver.chrome.driver","C://Users//omprakash//Desktop//automationCourse//AgainSeleniumRahul//ccc//chromedriver-win32/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
    }
    @When("I select round trip, choose dates, and locations")
    public void i_select_round_trip_choose_dates_and_locations() {
        WebElement travelSection = driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open"));
        travelSection.click();

        // Round trip
        WebElement roundTripRadio = driver.findElement(By.className("tabsCircle appendRight5"));
        roundTripRadio.click();

        // Select dates (replace with actual date selection code)
        WebElement fromDate = driver.findElement(By.className("widgetSprite icCalendar appendRight10"));
        fromDate.sendKeys("2023-11-01");
        WebElement toDate = driver.findElement(By.id("lbl_input appendBottom10"));
        toDate.sendKeys("2023-11-10");

        // Select locations (replace with actual location selection code)
        WebElement fromLocation = driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open"));
        fromLocation.sendKeys("New York");

        WebElement toLocation = driver.findElement(By.className("flt_fsw_inputBox searchToCity inactiveWidget activeWidget"));
        toLocation.sendKeys("Los Angeles");
    }
    @When("I click on search")
    public void i_click_on_search() {
        WebElement searchButton = driver.findElement(By.className("primaryBtn font24 latoBold widgetSearchBtn"));
        searchButton.click();
    }
    @Then("I validate the total price for flights")
    public void i_validate_the_total_price_for_flights() {
        WebElement totalPriceElement = driver.findElement(By.className("whiteText fontSize22 boldFont"));
        String totalPriceText = totalPriceElement.getText();
        double totalPrice = Double.parseDouble(totalPriceText.replace("₹", "").replaceAll(",", "").trim());
        driver.quit();

    }

}

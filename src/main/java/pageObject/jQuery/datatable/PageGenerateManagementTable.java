package pageObject.jQuery.datatable;

import org.openqa.selenium.WebDriver;

public class PageGenerateManagementTable {
	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}

}

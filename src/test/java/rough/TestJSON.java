package rough;

import java.io.IOException;

import utilities.JSONReader;

public class TestJSON {

	public static void main(String[] args) throws IOException {

		JSONReader json = new JSONReader(System.getProperty("user.dir")
				+ "\\src\\test\\resources\\locators\\locators.json");

		System.out.println(json.getLocator("locators.homepage.username.xpath"));

	}

}

package rough;

import utilities.XMLReader;

public class TestXML {

	public static void main(String[] args) {

		XMLReader xml = new XMLReader(System.getProperty("user.dir")
				+ "\\src\\test\\resources\\locators\\locators.xml");

		String loc = xml.getLocator("userName.xpath");

		System.out.println(loc);

	}

}

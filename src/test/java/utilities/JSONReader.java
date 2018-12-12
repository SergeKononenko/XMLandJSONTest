package utilities;

import java.io.File;
import java.io.IOException;

import com.jayway.jsonpath.JsonPath;

public class JSONReader {

	private File jsonFile;
	private String fileName;

	public JSONReader(String fileName) {
		super();
		this.fileName = fileName;
		this.jsonFile = new File(fileName);
	}

	public String getLocator(String locator) throws IOException {

		return JsonPath.read(jsonFile, "$." + locator);

	}

}

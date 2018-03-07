package util;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class PrintEvidencia {

	public void tiraPrint(WebDriver driver, String nomePrint) {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Public\\Documents\\Evidencias", nomePrint + ".png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

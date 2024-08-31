package com.subbu.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.subbu.setup.DriverManager;

import io.cucumber.core.gherkin.Step;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {

	/*@AfterStep
	public void before_or_after(Scenario scenario, Step step) {
		try {
			byte[] screenShot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShot, "image/png", scenario.getName());
			System.out.println("*********** Step Name ************ " + step.getText());

		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}*/

	@After
	public void before_or_after() {
		DriverManager.getDriver().quit();
	}
}

package StepDefinitions;

import Utilities.BasicDriver;
import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {

    @Before // This method runs before every scenario
    public void beforeScenario(){
        System.out.println("Scenario has started");
    }

    @After // This method runs after every scenario
    public void afterScenario(Scenario scenario){
        System.out.println("Scenario has ended");
        if(scenario.isFailed()){

            final byte[] byteImage = ((TakesScreenshot)BasicDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage,"image/png","screenShot name");

//            Save the screenshot to our computer
//            TakesScreenshot takesScreenshot =(TakesScreenshot)  BasicDriver.getDriver();
//            File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
//            LocalDateTime timeOfError = LocalDateTime.now();
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyyHHmmss");
//
//            try {
//                FileUtils.copyFile(file,new File("src/test/java/Screenshots/screenshot"+timeOfError.format(formatter)+".png"));
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }

        }


        BasicDriver.quitDriver();

    }

    @BeforeStep
    public void BeforeStep(){
        System.out.println("Step has started");
    }

    @AfterStep
    public void AfterStep(){
        System.out.println("Step has finished");
    }
}

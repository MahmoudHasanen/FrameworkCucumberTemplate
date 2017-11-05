package java.test.steps.loginsteps;

import java.main.mh.framework.base.DriverContext;
import java.main.mh.framework.base.FrameworkInitilialize;
import java.main.mh.framework.config.ConfigReader;
import java.main.mh.framework.config.Settings;
import java.main.mh.framework.utilities.ExcelUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginClassOne extends FrameworkInitilialize {


    @Given("^i Love you$")
    public void ihaveates() throws Throwable {

        ConfigReader.PopulateSettings();
        try {
            ExcelUtil util = new ExcelUtil(Settings.ExcelSheetPath);
        } catch (Exception e) {
        }


    }

    @Then("^I marry you$")
    public void irunthetest()throws Throwable {

        InitializeBrowser(Settings.BrowserType);
        DriverContext.Driver.get(Settings.AUT);

    }
}

package starter;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(
            glue = "src/test/java/starter/stepdefinitions",
            features = "src/test/resources/features/"
    )

    public class RunnerTravelsLogin {

    }

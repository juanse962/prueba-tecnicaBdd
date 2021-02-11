package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.mockito.internal.matchers.Contains;
import org.mockito.internal.matchers.Equals;
import org.openqa.selenium.WebDriver;
import questions.AreYouLogin;
import tasks.Authentication;
import tasks.CreatePost;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.hasItem;

public class LoginStepDefinition
{
    private Actor jorge = Actor.named("jorge");
    @Managed(driver = "chrome")
    WebDriver herBrowser;
    @Before
    public void setUp(){
        jorge.can(BrowseTheWeb.with(herBrowser));
    }

    @Given("Jorge has a webpage")
    public void sergey_has_an_activate_account(){
        jorge.attemptsTo(Open.url("https://www.phptravels.net/admin"));
    }
    @When("he sends their credentials")
    public void he_sends_their_credentials(){
        jorge.attemptsTo(Authentication.WithCredentials("admin@phptravels.com", "demoadmin"));
        jorge.attemptsTo(CreatePost.clickBlog());
    }
    @Then("he should have to manage his account")
    public void he_should_have_to_manage_his_account(){
        jorge.should(String.valueOf(seeThat(AreYouLogin.displayed()).equals("Log Out")));
    }
}

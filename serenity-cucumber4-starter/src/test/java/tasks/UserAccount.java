package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class UserAccount implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://www.phptravels.net/admin"));
    }

    public static UserAccount openTheBrowser() {
        return Instrumented.instanceOf(UserAccount.class).withProperties();
    }
}
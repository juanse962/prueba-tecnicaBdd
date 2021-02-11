package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import static ui.LoginInterface.*;

public class Authentication implements Task {

    private String user;
    private String password;

    public Authentication(String user, String pass) {
        this.user = user;
        this.password = pass;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(txtEmail),
                Enter.keyValues(user).into(txtEmail));
        actor.attemptsTo(Click.on(txtPass),
                Enter.keyValues(password).into(txtPass));
        actor.attemptsTo(Click.on(txtButton));

    }
    public static Authentication WithCredentials(String user, String pass){
        return Instrumented.instanceOf(Authentication.class).withProperties(user, pass);
    }

}

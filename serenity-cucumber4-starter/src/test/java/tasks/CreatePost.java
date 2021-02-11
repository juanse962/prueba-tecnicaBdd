package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static ui.LoginInterface.*;

public class CreatePost implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(btn));
        actor.attemptsTo(Click.on(btnCategories));
        actor.attemptsTo(Click.on(btnAdd));
        actor.attemptsTo(Click.on(select));
    }

    public static CreatePost clickBlog() {
        return Instrumented.instanceOf(CreatePost.class).withProperties();
    }
}
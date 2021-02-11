package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static ui.LoginInterface.btnLogout;

public class AreYouLogin implements Question<String> {

    public static Question<String> displayed() {
        return new AreYouLogin();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text
                .of(btnLogout)
                .viewedBy(actor)
                .asString();
    }
}

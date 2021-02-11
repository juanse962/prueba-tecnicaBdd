package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginInterface {
    public static final Target txtEmail =  Target.the("Submit button")
            .located(By.xpath("//input[@type='text' and @name='email']"));

    public static final Target txtPass =  Target.the("Submit button")
            .located(By.xpath("//input[@type='password' and @name='password']"));

    public static final Target txtButton =  Target.the("Submit button")
            .located(By.xpath("//button[@type='submit']"));

    public static final Target btnLogout =  Target.the("Submit button")
            .located(By.xpath("//*[contains(text(),'Logout')]"));

    public static final Target btn =  Target.the("Submit button")
            .located(By.xpath("//*[contains(text(),'Blog')]"));

    public static final Target btnCategories =  Target.the("Submit button")
            .located(By.xpath("//*[contains(text(),'Blog Categories')]"));

    public static final Target btnAdd =  Target.the("Add bnutton")
            .located(By.xpath("//*[contains(@type, 'button') and contains(@data-toggle,'modal')]"));

    public static final Target select =  Target.the("Select button")
            .located(By.xpath("//*[contains(@name,'status')]"));


}

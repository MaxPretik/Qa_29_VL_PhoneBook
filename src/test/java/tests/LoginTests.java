package tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginSuccess() {
        app.getHelperUser().openLodinRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm(email:"mara@gmail.com", password:"Mmar123456$");
        app.getHelperUser().submitLogin();

    }
}


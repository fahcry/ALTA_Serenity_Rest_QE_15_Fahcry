package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class LoginUserSteps {
    @Steps
    ReqresAPI reqresAPI;
    @Given("Create new login user with file json {string}")
    public void createNewLoginUserWithFileJson(String fileName) {
       File fileJson = new File(Constants.REQ_BODY + fileName);
       reqresAPI.postLoginUser(fileJson);
    }

    @When("Send request post create user login")
    public void sendRequestPostCreateUserLogin() {
        SerenityRest.when().post(ReqresAPI.LOGIN_USER);
    }
}

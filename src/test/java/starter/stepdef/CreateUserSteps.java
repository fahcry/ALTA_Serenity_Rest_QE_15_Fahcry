package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;

public class CreateUserSteps {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Create new user with file json {string}")
    public void createNewUserWithFileJson(String filename) {
        File fileJson = new File(Constants.REQ_BODY + filename);
        reqresAPI.postCreateNewUser(fileJson);
    }

    @When("Send request post create user")
    public void sendRequestPostCreateUser() {

        SerenityRest.when().post(ReqresAPI.CREATE_USER);
    }

}

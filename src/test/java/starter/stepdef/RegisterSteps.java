package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class RegisterSteps {

    @Steps
    ReqresAPI reqresAPI;
    @Given("Create register user with file json {string}")
    public void createRegisterUserWithFileJson(String filename) {
        File fileJson = new File(Constants.REQ_BODY + filename);
        reqresAPI.postRegisterUser(fileJson);
    }

    @When("Send request post register user")
    public void sendRequestPostRegisterUser() {
        SerenityRest.when().post(ReqresAPI.REGISTER_USER);
//      SerenityRest.and().log().everything(true).header("Content-Type", "application/json");
    }

}

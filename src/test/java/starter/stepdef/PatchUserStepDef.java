package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class PatchUserStepDef {

    @Steps
    ReqresAPI reqresAPI;
    @When("Send request patch update user")
    public void sendRequestPatchUpdateUser() {
        SerenityRest.when().put(ReqresAPI.PATCH_WITH_ID);

    }

    @Given("Update user with patch and parameter id {int} and valid json {string}")
    public void updateUserWithPatchAndParameterIdAndValidJson(int id1, String jsonFileName) {
        File fileJson = new File(Constants.REQ_BODY +jsonFileName);
        reqresAPI.patchUser(id1, fileJson);
    }

    @Given("Update user with parameter id {string} and valid json {string}")
    public void updateUserWithParameterIdAndValidJson(String id2, String job) {
        File fileJson = new File(Constants.REQ_BODY +job);
        reqresAPI.patchUser(id2, fileJson);
    }
}

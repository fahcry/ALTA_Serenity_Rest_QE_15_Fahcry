package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;


import java.io.File;

import static java.lang.Math.log;
import static org.hamcrest.CoreMatchers.equalTo;


public class ResponsesSteps {
    @Steps
    ReqresAPI reqresAPI;
    @Then("Status code should be {int}")
    public void statusCodeShouldBe(int statusCode) {
        SerenityRest.then().statusCode(statusCode)
                .log().everything(true).statusCode(statusCode);
    }

    @And("Respons body name should be {string} and job should be {string}")
    public void responsBodyNameShouldBeAndJobShouldBe(String name, String job) {
        SerenityRest.and()
                .body(ReqresResponses.NAME, equalTo(name))
                .body(ReqresResponses.JOB, equalTo(job));
    }

    @And("Validate json schema {string}")
    public void validateJsonSchema(String fileName) {
        File jsonFile = new File(Constants.JSON_SCHEMA+fileName);
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(jsonFile));

    }

    @And("Respons body name should be {string}")
    public void responsBodyNameShouldBe(String token) {
        SerenityRest.and().body(ReqresResponses.TOKEN, equalTo(token));
    }

    @And("Respons body error name should be {string}")
    public void responsBodyErrorNameShouldBe(String error) {
        SerenityRest.and().body(ReqresResponses.ERROR, equalTo(error));
    }

    @And("Respons body id should be {int} and token {string}")
    public void responsBodyIdShouldBeAndToken(int id,String token) {
        SerenityRest.and()
                .body(ReqresResponses.ID, equalTo(id))
                .body(ReqresResponses.TOKEN, equalTo(token));
    }
}

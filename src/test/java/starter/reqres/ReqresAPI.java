package starter.reqres;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

import java.io.File;

public class ReqresAPI {

    public static String LIST_USERS = Constants.BASE_URL + "/api/users?page={page}";
    public static String CREATE_USER = Constants.BASE_URL + "/api/users";

    public static String PUT_WITH_ID = Constants.BASE_URL + "/api/users/{idUser}";

    public static String LOGIN_USER = Constants.BASE_URL + "/api/login";
    public static String REGISTER_USER = Constants.BASE_URL + "/api/register";

    public static String PATCH_WITH_ID = Constants.BASE_URL + "/api/users/{idUser1}";


    @Step("Get list users")
    public void getListUsers(int page){
        SerenityRest.given()
                .pathParam("page",page);

    }
    @Step("Get list users")
    public void getListUsers1(String simbol){
        SerenityRest.given()
                .pathParam("page",simbol);

    }

    @Step("Create new user")
    public void postCreateNewUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);

    }
    @Step("Update user")
    public void putUpdateUser(int id, File json){
        SerenityRest.given()
                .pathParam("idUser", id)
                .contentType(ContentType.JSON)
                .body(json);

    }
    @Step("Delete a user")
    public void deleteUser(int id){
        SerenityRest.given().pathParam("idUser", id);
    }

    @Step("register user")
    public void postRegisterUser(File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("login user")
    public void postLoginUser (File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("patch user")
    public void patchUser (int id1, File json) {
        SerenityRest.given()
                .pathParam("idUser1", id1)
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("patch user invalid")
    public void patchUser (String id2, File json) {
        SerenityRest.given()
                .pathParam("idUser1", id2)
                .contentType(ContentType.JSON)
                .body(json);
    }
}

import Model.UserRecrestModel;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class ApiUser {
    public void createUser(UserRecrestModel model) {
        given()
                .baseUri("https://reqres.in/")
                .contentType(ContentType.JSON)
                .body(model)
                .post("/api/users")
                .then()
                .statusCode(201)
                .log().all();


    }

}

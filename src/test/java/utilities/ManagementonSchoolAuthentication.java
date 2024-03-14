package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ManagementonSchoolAuthentication {

    public static void main(String[] args) {
        System.out.println("Token = " + generateToken());
    }
    public static String generateToken(){

        String credentials = "{\"password\": \"Mark.123\",\"rememberMe\": true,\"username\": \"mark_twain\"}";

        Response response = given().when().contentType(ContentType.JSON).body(credentials).post("https://medunna.com/api/authenticate");

        return response.jsonPath().getString("id_token");
    }
}

// {"password": "Mark.123","rememberMe": true,"username": "mark_twain"}
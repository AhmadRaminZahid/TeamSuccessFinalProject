package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Authentication {
    public static void main(String[] args) {
        System.out.println(generateToken());
    }
    public static String generateToken() {
        String url = "https://managementonschools.com/app/auth/login";
        String payload = "{\n" +
                " \"pasword\":\"Batch197+\",\n" +
                    " \"usurname\":\"AdminBatch197\"\n" +
                " }";

        Response response = given().body(payload).contentType(ContentType.JSON).when().post(url);
        return response.jsonPath().getString("token");
    }
}
//{
// "pasword":"DeanBatch197",
// "usurname":"DeanBatch197"
// }
// {
//  "pasword":"ViceDeanBatch197",
//  "usurname":"ViceDeanBatch197"
//  }
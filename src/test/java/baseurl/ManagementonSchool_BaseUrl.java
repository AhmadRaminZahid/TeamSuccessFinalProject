package baseurl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;


public class ManagementonSchool_BaseUrl {

    public static RequestSpecification spec;

    public static void setUp(){
        String baseUrl = "https://medunna.com";

        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "Bearer "+ generateToken())
                .setBaseUri(baseUrl)
                .build();
    }

}





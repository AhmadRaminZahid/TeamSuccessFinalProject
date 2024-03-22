package baseurl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.ManagementonSchoolAuthentication.generateToken;


public class ManagementonSchool_BaseUrl {

    public static RequestSpecification spec;


    public static void setUp(){
        String baseUrl = "https://managementonschools.com/";

        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", generateToken())
                .setBaseUri(baseUrl)
                .build();
    }

}





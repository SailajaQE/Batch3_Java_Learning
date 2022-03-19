package day19_RestAssure;




import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

    public class PutCall
    {
        public static void main(String[] args) {

            //First step - to add base URI
            RestAssured.baseURI = "https://reqres.in/";

            //Second step - get Response Body
            Response response = given().when().
                    header("Content-Type","application/json").
                    body("{\n" +
                            "    \"name\": \"morpheus1\",\n" +
                            "    \"job\": \"zion resident\"\n" +
                            "}").
                    put("/api/users/2").andReturn();

            System.out.println("Status Code: "+response.getStatusCode());

            String responseBody = response.getBody().asString();

            System.out.println(responseBody);

            String name = JsonPath.read(responseBody,"$.name");

            System.out.println(name);
        }
}

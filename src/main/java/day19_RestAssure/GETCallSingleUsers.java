package day19_RestAssure;

import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.function.BiFunction;

import static io.restassured.RestAssured.given;

public class GETCallSingleUsers {
    static BiFunction<String,String,String> readJson = (a, b) -> JsonPath.read(a,b);

    public static void main(String[] args)
    {

        //First step - to add base URI


        RestAssured.baseURI = "https://reqres.in/";

        //Second step - get Response Body
        Response response = given().when().header("Content-Type","application/json").
                get("/api/users/2").
                andReturn();

        int statusCode = response.getStatusCode();

        System.out.println(statusCode);

        if(statusCode == 200) {

            //Third Step - Converting Response to string
            String responseBody = response.getBody().asString();

            String emailData = readJson.apply(responseBody, "$.data[1].email");

            System.out.println("Email is: " + emailData);

            System.out.println("Support URL: " + readJson.apply(responseBody, "$.support.url"));
        }

        else
        {
            System.out.println("Application is down");
        }


    }
}

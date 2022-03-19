package day19_RestAssure;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DeleteCall
    {
        public static void main(String[] args) {

        //First step - to add base URI
        RestAssured.baseURI = "https://reqres.in/";

        //Second step - get Response Body
        Response response = given().when().
                header("Content-Type","application/json").
                delete("/api/users/2").andReturn();

        int statusCode = response.getStatusCode();

        System.out.println(statusCode);


    }
}

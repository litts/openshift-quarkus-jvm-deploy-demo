package com.fordsworth.life.business.party;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PartyResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/party")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}
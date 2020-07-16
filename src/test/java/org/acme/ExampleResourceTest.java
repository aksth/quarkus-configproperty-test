package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ExampleResourceTest {

    @Inject
    OIDCProperties oidcProperties;

    private final TestProperty test = new TestProperty(oidcProperties);

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("master"));
    }

    @Test
    public void testConfig() {
        Assertions.assertEquals("master", test.getAdminRealm());
    }

}
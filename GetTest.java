import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetTest extends BaseTest {
    @Test
    @DisplayName("Тест метода GET")
    void getTest(){
                        given()
                        .queryParam("foo1", "bar1")
                        .queryParam("foo2", "bar2")

                        .when()
                        .get("/get")

                        .then()
                        .statusCode(200)
                        .body("args.foo1", equalTo("bar1"))
                        .body("args.foo2", equalTo("bar2"))

                        .body("headers.host", equalTo("postman-echo.com"))
                        .body("headers.accept-encoding", equalTo("gzip, br"))
                        .body("headers.x-forwarded-proto", equalTo("https"))
                        .body("headers.accept", notNullValue())
                        .body("headers.user-agent", notNullValue())

                        .body("url", equalTo(baseURI + "/get?foo1=bar1&foo2=bar2"))

                        .log().all();
    }
}

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.*;
public class PostFormDataTest extends BaseTest {
    @Test
    @DisplayName("Тест Post Form Data")
    void postFormData_shouldReturnCorrectResponse() {

        given()
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("args",  anEmptyMap())
                .body("files",  anEmptyMap())
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))

                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.accept-encoding", equalTo("gzip, br"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.accept", notNullValue())
                .body("headers.user-agent", notNullValue())
                .body("headers['content-length']", notNullValue())

                .body("json.foo1", equalTo("bar1"))
                .body("json.foo2", equalTo("bar2"))
                .body("url", equalTo(baseURI + "/post"))
        .log().all();

    }

}





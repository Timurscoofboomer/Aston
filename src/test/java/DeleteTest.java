import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

public class DeleteTest extends BaseTest {

    @Test
    @DisplayName("Тест метода DELETE")

    void deleteTest() {
            String requestBody = "This is expected to be sent back as part of response body.";
            given()
                    .body(requestBody)
                    .when()
                    .delete("/delete")

                    .then()
                    .statusCode(200)

                    .body("args", anEmptyMap())
                    .body("data", equalTo("This is expected to be sent back as part of response body."))
                    .body("files", anEmptyMap())
                    .body("form", anEmptyMap())

                    .body("headers.host", equalTo("postman-echo.com"))
                    .body("headers.accept-encoding", equalTo("gzip, br"))
                    .body("headers.x-forwarded-proto", equalTo("https"))
                   .body("headers.accept", notNullValue())
                   .body("headers.user-agent", notNullValue())
                   .body("headers['content-type']", containsString("text/plain"))
                   .body("headers['content-length']", notNullValue())

                    .body("json", nullValue())
                    .body("url", equalTo(baseURI + "/delete"))

                    .log().all();

        }
}

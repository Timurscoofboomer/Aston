import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    static void getBaseUri(){
        RestAssured.baseURI = "https://postman-echo.com";
    }
}

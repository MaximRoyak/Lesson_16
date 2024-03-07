import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostmanTests {
    @Test
    public void testPostRaw(){
        given()
                .when()
                .contentType(ContentType.JSON)
                .post("https://postman-echo.com/post")
                .then().assertThat()
                .statusCode(200)
                .log().all()
                .body("headers.x-forwarded-proto", Matchers.equalTo("https"))
                .body("headers.x-forwarded-port", Matchers.equalTo("443"))
                .body("headers.host", Matchers.equalTo("postman-echo.com"))
                .body("headers.content-length", Matchers.equalTo("0"))
                .body("headers.content-type", Matchers.equalTo("application/json"))
                .body("headers.accept", Matchers.equalTo("*/*"))
                .body("headers.user-agent", Matchers.equalTo("Apache-HttpClient/4.5.13 (Java/11.0.21)"))
                .body("headers.accept-encoding", Matchers.equalTo("gzip,deflate"))
                .body("url", Matchers.equalTo("https://postman-echo.com/post"));

    }

    @Test
    public void testGet() {
       given()
               .baseUri("https://postman-echo.com")
               .when()
               .log().all()
               .get("/get?foo1=bar1&foo2=bar2")
               .then().assertThat()
               .statusCode(200)
               .body("args.foo1", Matchers.equalTo("bar1"))
               .body("args.foo2", Matchers.equalTo("bar2"))
               .body("headers.x-forwarded-proto", Matchers.equalTo("https"))
               .body("headers.x-forwarded-port", Matchers.equalTo("443"))
               .body("headers.host", Matchers.equalTo("postman-echo.com"))
               .body("headers.accept", Matchers.equalTo("*/*"))
               .body("url", Matchers.equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
    }

    @Test
    public void testPostForm(){
        given()
                .when()
                .contentType(ContentType.JSON)
                .post("https://postman-echo.com/post")
                .then().assertThat()
                .statusCode(200)
                .log().all()
                .body("headers.x-forwarded-proto", Matchers.equalTo("https"))
                .body("headers.x-forwarded-port", Matchers.equalTo("443"))
                .body("headers.host", Matchers.equalTo("postman-echo.com"))
                .body("headers.content-length", Matchers.equalTo("0"))
                .body("headers.content-type", Matchers.equalTo("application/json"))
                .body("headers.accept", Matchers.equalTo("*/*"))
                .body("headers.user-agent", Matchers.equalTo("Apache-HttpClient/4.5.13 (Java/11.0.21)"))
                .body("headers.accept-encoding", Matchers.equalTo("gzip,deflate"))
                .body("url", Matchers.equalTo("https://postman-echo.com/post"));

    }
    @Test
    public void putTest(){
        given()
                .when()
                .contentType(ContentType.JSON)
                .put("https://postman-echo.com/put")
                .then().assertThat()
                .statusCode(200)
                .log().all()
                .body("headers.x-forwarded-proto", Matchers.equalTo("https"))
                .body("headers.x-forwarded-port", Matchers.equalTo("443"))
                .body("headers.host", Matchers.equalTo("postman-echo.com"))
                .body("headers.content-length", Matchers.equalTo("0"))
                .body("headers.content-type", Matchers.equalTo("application/json"))
                .body("headers.accept", Matchers.equalTo("*/*"))
                .body("headers.user-agent", Matchers.equalTo("Apache-HttpClient/4.5.13 (Java/11.0.21)"))
                .body("headers.accept-encoding", Matchers.equalTo("gzip,deflate"))
                .body("url", Matchers.equalTo("https://postman-echo.com/put"));
    }
    @Test
    public void patchTest(){
        given()
                .when()
                .contentType(ContentType.JSON)
                .patch("https://postman-echo.com/patch")
                .then().assertThat()
                .statusCode(200)
                .log().all()
                .body("headers.x-forwarded-proto", Matchers.equalTo("https"))
                .body("headers.x-forwarded-port", Matchers.equalTo("443"))
                .body("headers.host", Matchers.equalTo("postman-echo.com"))
                .body("headers.content-length", Matchers.equalTo("0"))
                .body("headers.content-type", Matchers.equalTo("application/json"))
                .body("headers.accept", Matchers.equalTo("*/*"))
                .body("headers.user-agent", Matchers.equalTo("Apache-HttpClient/4.5.13 (Java/11.0.21)"))
                .body("headers.accept-encoding", Matchers.equalTo("gzip,deflate"))
                .body("url", Matchers.equalTo("https://postman-echo.com/patch"));
    }
    @Test
    public void delTest(){
        given()
                .when()
                .contentType(ContentType.JSON)
                .delete("https://postman-echo.com/delete")
                .then().assertThat()
                .statusCode(200)
                .log().all()
                .body("headers.x-forwarded-proto", Matchers.equalTo("https"))
                .body("headers.x-forwarded-port", Matchers.equalTo("443"))
                .body("headers.host", Matchers.equalTo("postman-echo.com"))
                .body("headers.content-type", Matchers.equalTo("application/json"))
                .body("headers.accept", Matchers.equalTo("*/*"))
                .body("headers.user-agent", Matchers.equalTo("Apache-HttpClient/4.5.13 (Java/11.0.21)"))
                .body("headers.accept-encoding", Matchers.equalTo("gzip,deflate"))
                .body("url", Matchers.equalTo("https://postman-echo.com/delete"));

    }
}

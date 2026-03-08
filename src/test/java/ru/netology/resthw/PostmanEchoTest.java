package ru.netology.resthw;

import io.restassured.internal.path.json.mapping.JsonPathGsonObjectDeserializer;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoTest {

    @Test
    public void shouldReturnSendData() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("Good") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo("Good"));
    }
}

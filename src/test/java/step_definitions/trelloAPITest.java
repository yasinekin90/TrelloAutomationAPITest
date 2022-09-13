package step_definitions;

import POJO.Board;
import POJO.Cards;
import POJO.Lists;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import java.util.Random;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;
import static org.hamcrest.Matchers.*;

public class trelloAPITest {

    @Before
    public static void before(){
        baseURI = ConfigurationReader.get("baseURI");
        basePath = ConfigurationReader.get("basePath");
    }

    public String boardId;
    public String listId;
    public String[] cardsId;

    @Given("Trello üzerinde bir board oluşturunuz.")
    public void trello_üzerinde_bir_board_oluşturunuz() {

        Response response = given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .when()
                .queryParam("key", ConfigurationReader.get("key"))
                .queryParam("token", ConfigurationReader.get("token"))
                .queryParam("name", "BoardTest")
                .and().post("/boards");

        assertEquals(response.statusCode(),200);
        assertEquals(response.contentType(),"application/json; charset=utf-8");

        Board board = response.body().as(Board.class);

        assertEquals(board.getName(),"BoardTest");

        boardId = board.getId();
        System.out.println("boardId = " + boardId);
    }

    @When("Oluşturduğunuz board üzerinde bir list oluşturunuz.")
    public void oluşturduğunuz_board_üzerinde_bir_list_oluşturunuz() {

        Response response = given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .when()
                .queryParam("key", ConfigurationReader.get("key"))
                .queryParam("token", ConfigurationReader.get("token"))
                .queryParam("name","ListTest")
                .queryParam("idBoard",boardId)
                .and().post("/lists");

        assertEquals(response.statusCode(),200);
        assertEquals(response.contentType(),"application/json; charset=utf-8");

        Lists lists = response.body().as(Lists.class);

        assertEquals(lists.getName(),"ListTest");

        listId = lists.getId();
        System.out.println("listId = " + listId);
    }

    @When("Oluşturduğunuz board’ a {int} tane kart oluşturunuz.")
    public void oluşturduğunuz_board_a_tane_kart_oluşturunuz(int card) {

        cardsId=new String[card];

        // create 2 cards
        for (int i = 0; i < card; i++) {
            Response response = given().accept(ContentType.JSON)
                    .and().contentType(ContentType.JSON)
                    .when()
                    .queryParam("key", ConfigurationReader.get("key"))
                    .queryParam("token", ConfigurationReader.get("token"))
                    .queryParam("name", "TestiniumCard" + i)
                    .queryParam("idList", listId)
                    .queryParam("desc","initial Testinium")
                    .and().post("/cards");

            assertEquals(response.statusCode(),200);
            assertEquals(response.contentType(),"application/json; charset=utf-8");

            Cards cards = response.body().as(Cards.class);

            assertEquals(cards.getName(),("TestiniumCard" + i));

            cardsId[i] = cards.getId();
            System.out.println("cardsId"+i+" = " + cardsId[i]);

        }

    }

    @When("Oluştrduğunuz bu iki karttan random olacak sekilde bir tanesini güncelleyiniz.")
    public void oluştrduğunuz_bu_iki_karttan_random_olacak_sekilde_bir_tanesini_güncelleyiniz() {

        // select random card number
        Random rd = new Random();
        int random = rd.nextInt(cardsId.length);

        //edite one of the cards
        given()
                .contentType(ContentType.JSON).
                when()
                .queryParam("key", ConfigurationReader.get("key"))
                .queryParam("token", ConfigurationReader.get("token"))
                .queryParam("name","TestiniumCard"+random)
                .queryParam("desc","Edited Testinium")
                .put("/cards/"+cardsId[random]).
                then()
                .statusCode(200)
                .contentType(ContentType.JSON).
                assertThat()
                .body("desc", equalTo("Edited Testinium"));

        System.out.println("Card edited");
    }

    @Then("Oluşturduğunuz kartları siliniz.")
    public void oluşturduğunuz_kartları_siliniz() {

        //Delete cards
        for (int i = 0; i < cardsId.length; i++) {
            given()
                    .contentType("application/json").
                    when()
                    .queryParam("key", ConfigurationReader.get("key"))
                    .queryParam("token", ConfigurationReader.get("token"))
                    .delete("/cards/" + cardsId[i]).
                    then()
                    .statusCode(200);
        }
        System.out.println("Cards deleted");
    }

    @Then("Oluşturduğunuz board’ u siliniz.")
    public void oluşturduğunuz_board_u_siliniz() {

        //Delete board
        given()
                .contentType("application/json").
                when()
                .queryParam("key", ConfigurationReader.get("key"))
                .queryParam("token", ConfigurationReader.get("token"))
                .delete("/boards/"+boardId).
                then()
                .statusCode(200);

        System.out.println("Board deleted");
    }
}



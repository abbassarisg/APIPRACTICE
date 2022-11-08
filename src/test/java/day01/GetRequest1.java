package day01;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

public class GetRequest1 {
    @Test
    public void test01() {
        String url="https://restful-booker.herokuapp.com/booking";
        Response response=given().when().get(url);

        //given().when()get(url) -> end point'e gondermek icin reequest olusturmus olduk.
        // respondse response -> api tarfindan bana donen response(cevap)

        //Response response=given().auth().basic("username","password").when.get(url)
        //basic auth ile request gondermek icin

        //response.prettyPrint(); //response deki body yazdirir

        //response.prettyPeek(); //  response taki herseyi yazdirir

        // response.print(); // sadce bodyi string olarak yazdırır
        // response.peek(); // tüm veriyi string olarak verir


        //response.print(); //[{"bookingid":1215},{"bookingid":844},{"bookingid":87},....]

        System.out.println("Status Code= "+response.statusCode());
        System.out.println("Status Line= "+response.statusLine());
        System.out.println("Status ContenType= "+response.contentType());

        // 1 - JUnit Assert  leri ile API testi yapabiliriz.
        assertEquals("Status Kod Hatali", 200, response.getStatusCode());
        Assert.assertEquals("HTTP/1.1 200 OK",response.statusLine());
        assertEquals("application/json; charset=utf-8",response.contentType());

        // 2- assertthat ile
        response.then().assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .statusLine("HTTP/1.1 200 OK");
    }
}

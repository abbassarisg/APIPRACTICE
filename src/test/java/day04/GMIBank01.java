package day04;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.Customer;
import utilities.GMIBankBaseURL;
import utilities.WriteToText;

import static io.restassured.RestAssured.given;

public class GMIBank01 extends GMIBankBaseURL {
    @Test
    public void test10() throws JsonProcessingException {

        Customer[] customers;
        spec01.pathParam("bir","tp-customers");

        Response response=given().spec(spec01).headers("Authorization","Bearer "+generateToken())
                .when()
                .get("/{bir}");
        response.prettyPrint();

        ObjectMapper obj=new ObjectMapper();
        customers=obj.readValue(response.asString(),Customer[].class);

        // 1- Tum Customer bilgilerini ekrana yazdirin.

        for (int i =0; i<customers.length; i++)
            System.out.println(customers[i]);

        // 2- Tum Customer SSN lerini ekrana yazdirin

        for (int i =0; i<customers.length; i++)
            System.out.println(customers[i].getSsn());


        // 3- Tum Customer SSN lerini text dosyasi olarak kaydedin

        String fileName="src/test/java/day04/SSNNumbers.txt";
        WriteToText.saveCustomersData(fileName,customers);


        // 4-


    }
}

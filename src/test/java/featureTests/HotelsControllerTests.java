package featureTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class HotelsControllerTests {
    private final static String ENDPOINT = "http://localhost:2221/v1";

    @Test
    public void getAllHotels() {
        Response resp = RestAssured.get(ENDPOINT + "/hotels");
        Assert.assertTrue(resp.asString().contains("Hotel1"));
        Assert.assertFalse(resp.asString().isEmpty());
    }

    @Test
    public void getHotelsForALocation() {
        Response resp = RestAssured.get(ENDPOINT + "/hotels/Budapest");
        Assert.assertTrue(resp.asString().contains("Hotel1"));
        Assert.assertFalse(resp.asString().isEmpty());
    }

    @Test
    public void getHotelByName() {
        Response resp = RestAssured.get(ENDPOINT + "/hotels/hotel?name=Hotel1");
        Assert.assertTrue(resp.asString().contains("Hotel1"));
        Assert.assertFalse(resp.asString().isEmpty());
    }

    @Test
    public void getHotelByID() {
        Response resp = RestAssured.get(ENDPOINT + "/hotels/hotel?id=1");
        Assert.assertTrue(resp.asString().contains("Hotel1"));
        Assert.assertFalse(resp.asString().isEmpty());
    }
}

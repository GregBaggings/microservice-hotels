package unittests;

import app.hotels.HotelsController;
import app.models.HotelsDAO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
public class HotelControllerUnitTests {
    @InjectMocks
    private HotelsController hotelsController;
    private MockMvc mvc;

    @Mock
    HotelsDAO dao;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        this.mvc = MockMvcBuilders.standaloneSetup(hotelsController).build();
    }

    @Test
    public void getHotelsTest() throws Exception {
        this.mvc.perform(get("/v1/hotels")).andExpect(status().isOk());
    }

    @Test
    public void getHotelByIdTest() throws Exception {
        this.mvc.perform(get("/v1/hotels?id=1")).andExpect(status().isOk());
    }

    @Test
    public void getHotelByNameTest() throws Exception {
        this.mvc.perform(get("/v1/hotels?name=Hotel1")).andExpect(status().isOk());
    }

    @Test
    public void getHotelsForLocationTest() throws Exception {
        //Mock is empty so 404 is the expected
        this.mvc.perform(get("/v1/hotels/Budapest")).andExpect(status().is4xxClientError());
    }
}

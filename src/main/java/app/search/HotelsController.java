package app.search;

import app.models.Hotel;
import app.models.HotelsDAO;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gergely_Agnecz on 7/27/2017.
 */
@RestController
public class HotelsController {

    @Autowired
    HotelsDAO dao;

    @RequestMapping(value = "/v1/hotels")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ResponseEntity<?> hotels() {
        List<Hotel> hotels = dao.findAll();

        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }
}

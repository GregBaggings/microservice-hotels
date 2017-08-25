package app.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Gergely_Agnecz on 7/27/2017.
 */
public interface HotelsRepository extends JpaRepository<Hotel, Integer> {

    List<Hotel> findAll();

}



package unittests;

import app.models.HotelsDAO;
import app.models.HotelsRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class HotelsDAOUnitTests {

    @Mock
    HotelsRepository mock;
    HotelsDAO dao;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        dao = new HotelsDAO(mock);
    }

    @Test
    public void findAll() {
        // GIVEN
        // WHEN
        dao.findAll();
        // THEN
        Mockito.verify(mock).findAll();
    }
}

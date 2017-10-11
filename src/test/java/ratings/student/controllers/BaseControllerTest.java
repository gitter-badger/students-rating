package ratings.student.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.mvc.Controller;
import ratings.student.RandomizeData;

/**
 * Base test for {@link Controller}s.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(WelcomeController.class)
public class BaseControllerTest extends RandomizeData {

    @Autowired
    protected MockMvc mockMvc;

    /**
     * This test needs to be for making it as Base Test.
     */
    @Test
    public void testBaseController() {}
}

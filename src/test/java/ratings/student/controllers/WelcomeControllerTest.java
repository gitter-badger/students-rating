package ratings.student.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;

/**
 * Integration-level testing for a {@link WelcomeController} object.
 */
public class WelcomeControllerTest extends BaseControllerTest {

    @Test
    public void testWelcomePage() throws Exception {
        mockMvc.perform( get("/welcomePage") )
                .andExpect( status().isOk() )
                .andExpect( view().name( "welcome" ) );
    }
}

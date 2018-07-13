package org.javalongislandmeetup.july2018;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.test.web.servlet.*;
import org.springframework.beans.factory.annotation.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.http.*;

/*
@RunWith(SpringRunner.class)
@WebMvcTest(Controller.class)
public class ControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetS3Files()
      throws Exception {

        mvc.perform(get("/getfiles")
          .contentType(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk());
    }



}
*/

package cn.edu.nchu.grimsys.UnitTest.controllerLayerTest;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import cn.edu.nchu.grimsys.presentation.controller.admin.AdminLoginController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

public class HomeControllerTest {

  @Test
  public void testHomePage() throws Exception {
    AdminLoginController controller = new AdminLoginController();
    MockMvc mockMvc = standaloneSetup(controller).build();
    mockMvc.perform(get("/login"))
           .andExpect(view().name("login"));
    mockMvc.perform(get("/index"))
            .andExpect(view().name("index"));
  }

}

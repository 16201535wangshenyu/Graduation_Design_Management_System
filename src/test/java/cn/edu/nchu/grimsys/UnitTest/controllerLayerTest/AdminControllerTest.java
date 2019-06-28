package cn.edu.nchu.grimsys.UnitTest.controllerLayerTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import cn.edu.nchu.grimsys.presentation.controller.admin.AdminLoginController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

public class AdminControllerTest {
    @Test
    public void testHomePage() throws Exception {
        AdminLoginController controller = new AdminLoginController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/adminIndex"))
                .andExpect(view().name("adminIndex"));
        mockMvc.perform(get("/admin-search-teache"))
                .andExpect(view().name("admin-search-teache"));
        mockMvc.perform(get("/admin-search-student"))
                .andExpect(view().name("admin-search-student"));
        mockMvc.perform(get("/admin-search-notice"))
                .andExpect(view().name("admin-search-notice"));
        mockMvc.perform(get("/admin-info-view"))
                .andExpect(view().name("admin-info-view"));
        mockMvc.perform(get("/admin-info-update"))
                .andExpect(view().name("admin-info-update"));
    }
}

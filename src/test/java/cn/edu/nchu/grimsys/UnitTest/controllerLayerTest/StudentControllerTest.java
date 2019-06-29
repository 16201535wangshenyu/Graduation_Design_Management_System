package cn.edu.nchu.grimsys.UnitTest.controllerLayerTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import cn.edu.nchu.grimsys.presentation.controller.admin.AdminLoginController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

public class StudentControllerTest {
    @Test
    public void testHomePage() throws Exception {
        AdminLoginController controller = new AdminLoginController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/studentIndex"))
                .andExpect(view().name("studentIndex"));
        mockMvc.perform(get("/ViewCourse"))
                .andExpect(view().name("ViewCourse"));
        mockMvc.perform(get("/UpdateTask"))
                .andExpect(view().name("UpdateTask"));
        mockMvc.perform(get("/SubmitTask"))
                .andExpect(view().name("SubmitTask"));
        mockMvc.perform(get("/SearchAnnouncement"))
                .andExpect(view().name("SearchAnnouncement"));
        mockMvc.perform(get("/LoadAllTask"))
                .andExpect(view().name("LoadAllTask"));
        mockMvc.perform(get("/ChooseTeacher"))
                .andExpect(view().name("ChooseTeacher"));
    }
}

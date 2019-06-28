package cn.edu.nchu.grimsys.UnitTest.mapperLayerTest;

import cn.edu.nchu.grimsys.dao.datasource.FileMapper;
import cn.edu.nchu.grimsys.domain.AbstrFile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileMapperTest {
    @Autowired
    private FileMapper fileMapper;

    @Autowired
    private AbstrFile file;

    @Test
    public void  addFileRecordTest() {
        file.setFile_num("1");
        file.setFile_name("中期报告");
        file.setFile_type("word文档");
        file.setTask_no("1000");
        file.setPath("d:\\中期文档.word");
        file.setOwn_per_no("3");

        fileMapper.addFileRecord(file);
    }
    @Test
    public void  updateFileRecordTest() {
        file.setFile_num("1");
        file.setFile_name("中期报告");
        file.setFile_type("word文档");
        file.setTask_no("1000");
        file.setPath("d:\\中期文档.word");
        file.setOwn_per_no("4");

        fileMapper.updateFileRecord(file);
    }
    @Test
    public void  deleteFileRecordTest() {
        fileMapper.deleteFileRecord("2");
    }
    @Test
    public void  loadFileByFileIdTest() {

        fileMapper.loadFileByFileId("2");
    }
}

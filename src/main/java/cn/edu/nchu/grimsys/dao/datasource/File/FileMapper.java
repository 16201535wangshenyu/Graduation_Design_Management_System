package cn.edu.nchu.grimsys.dao.datasource.File;

import cn.edu.nchu.grimsys.domain.AbstrFile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FileMapper {



    /**
     * 添加文件
     * @param file
     * @return
     */
    boolean addFileRecord(@Param("file") AbstrFile file);


    /**
     * 修改文件
     * @param file
     * @return
     */
    boolean updateFileRecord(@Param("grade") AbstrFile file);


    /**
     * 根据文件ID删除文件
     * @param file_num
     * @return
     */
    boolean deleteFileRecord(@Param("file_num") String file_num);


    /**
     * 根据文件ID查询文件
     * @param file_num
     * @return
     */
    AbstrFile loadFileByFileId(@Param("file_num") String file_num);
}

package cn.edu.nchu.grimsys.presentation.aop;


import cn.edu.nchu.grimsys.domain.AbstrUser;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.BindingResult;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * 162015班  第11组
 * 毕设信息管理系统--模块
 * @author：
 * date：2019-6-
 * 主要功能说明：
 */
@Aspect
@Configuration
public class LoginLog {
	 private Logger logger = LoggerFactory.getLogger(LoginLog.class);
	   
	    //@Pointcut("execution(public * webadv.example.controller.HomeController.check(..))")
	    //public void webLog(){}
	    //@Before("webLog()")
	    @Before("execution(public * cn.edu.nchu.grimsys.presentation..UserController.logincheck(..)) && args(user,result,..)")
	    public void doBefore(AbstrUser user, BindingResult result) throws Throwable {
	    	logger.info(String.format("Account:%s, login %s.", user.getId(),result.hasErrors()?"failed":"succeeded"));
	    	writeToFile("Account:"+user.getId()+","+"login:"+(result.hasErrors()?"failed":"succeeded"));
	    }

	/**
	 * 写入日志文件
	 * @param content
	 * @return
	 */

	private boolean writeToFile(String content) {
	    	try {
		    	File file =new  File("log.txt");
		    	if(!file.exists()) {
		    		file.createNewFile();
		    	}
		        BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));
		        bw.append(content+"\n");
		        bw.flush();
		        bw.close();
		        return true;
		    	
	    	}catch (Exception e) {
				System.out.print("日志写入文件失败");
				e.printStackTrace();
				return false;
			}
	    	
	    }

}

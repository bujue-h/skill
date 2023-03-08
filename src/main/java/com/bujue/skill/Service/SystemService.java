package com.bujue.skill.Service;

import com.bujue.skill.Exception.ServiceException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * @Author HeZhe
 * @Date 2023/3/8 17:50
 * @Version 1.0
 */
@Service
public class SystemService {
    private final static Log logger = LogFactory.getLog(SystemService.class);
    public String queryDiskspace(){
        File file = new File("/home");
        long usableSpace = file.getUsableSpace()/1024/1024/1024; //GB
        String s = null;
        logger.info("Disk remaining storage space："+usableSpace+"(GB)");
        if(usableSpace >= 300 && usableSpace < 500){
            s = "存储低于500GB，建议联系生产企业备份后清理空间再分析，以免影响正常分析！";
        }else if( usableSpace < 300) {
            throw new ServiceException("存储低于300GB，不能分析，请联系生产企业备份后清理空间！");
        }
        return s;
    }
}

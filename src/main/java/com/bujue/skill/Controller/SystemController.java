package com.bujue.skill.Controller;

import com.bujue.skill.Service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author HeZhe
 * @Date 2023/3/8 17:53
 * @Version 1.0
 */
@Controller
public class SystemController {
    @Autowired
    private SystemService systemService;
    
}

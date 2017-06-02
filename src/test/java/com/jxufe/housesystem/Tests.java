package com.jxufe.housesystem;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//import indi.group.his.services.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class Tests {
    private static Logger logger = LoggerFactory.getLogger(Tests.class);
    @Resource
    //private IUserService userService = null;
    @Test
    public void test(){
//        User user = userService.getUserByName("xc");
//        User ss = new User();
//        ss.setId(1);
//        ss.setUsername("xc");
//        ss.setPassword("1234567");
//        assertEquals(ss.getUsername(), user.getUsername());
//        assertEquals(ss.getPassword(), user.getPassword());
    }
}

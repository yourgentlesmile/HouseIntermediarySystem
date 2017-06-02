package indi.group.his.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import indi.group.his.model.WorkInfoUnionUser;
import indi.group.his.model.WorkInformation;
import indi.group.his.services.IWorkInformationService;

@Controller
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    
    @Autowired
    private IWorkInformationService workInfoService;
    public TestController() {
        // TODO Auto-generated constructor stub
    }
    @GetMapping("/achivement")
    public String testAjax(){
        
        return "achivement";
    }
    @GetMapping("/notice")
    public String testNotice(){
        return "notice";
    }
    
    
    @GetMapping("/housesource")
    public String testHouseSource(){
    	return "housesource";
    }
    
    @ResponseBody
    @PostMapping("/getUser")
    public WorkInformation getAllUserInformation(@RequestBody WorkInformation value) {
    	workInfoService.addWorkInformation(value);
        return value;
    }
    @ResponseBody
    @GetMapping("/getAchivement/{order}")
    public WorkInfoUnionUser[] addUser(@PathVariable(value = "order")int order){
        return workInfoService.getAllUserAchivement(order);
        
    }
    
}

package indi.group.his.controller;


import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import indi.group.his.model.HouseInformation;
import indi.group.his.model.WorkInfoUnionUser;
import indi.group.his.model.WorkInformation;
import indi.group.his.services.IHouseInformationService;
import indi.group.his.services.IWorkInformationService;
import indi.group.his.services.impl.HouseInformationServiceImpl;

@Controller
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    
    @Autowired
    private IWorkInformationService workInfoService;
    @Autowired
    private IHouseInformationService houseInfoService;
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
    
    @GetMapping("/window")
    public String testWindow(){
        return "window";
    }
    @ResponseBody
    @GetMapping("/getUser")
    public WorkInformation[] getAllUserInformation() {
        return workInfoService.getAllUserInformation();
    }
    @ResponseBody
    @GetMapping("/getAchivement/{order}")
    public WorkInfoUnionUser[] addUser(@PathVariable(value = "order")int order){
        return workInfoService.getAllUserAchivement(order);
        
    }
    @ResponseBody
    @GetMapping("/getHouseInfo")
    public HouseInformation[] gethouseInfo(){
        return houseInfoService.getHouseInformation(null, null, HouseInformationServiceImpl.FETCH_ALL);
    }
    @ResponseBody
    @GetMapping("/queryHouseInfo/{type}/{min}/{max}/{housename}")
    public HouseInformation[] queryHouseInfo(@PathVariable(value = "min",required = false)float min,
                                             @PathVariable(value = "max",required = false)float max,
                                             @PathVariable(value = "type")int queryBy,
                                             @PathVariable(value = "housename",required = false)String housename){
        Map<String, String> queryArgs = new HashMap<>();
        if(queryBy == HouseInformationServiceImpl.QUERY_BY_AREA){
            queryArgs.put("area_min", Float.toString(min));
            queryArgs.put("area_max", Float.toString(max));
        }else if(queryBy == HouseInformationServiceImpl.QUERY_BY_PRICE) {
            queryArgs.put("price_min", Float.toString(min));
            queryArgs.put("price_max", Float.toString(max));
        }
        return houseInfoService.getHouseInformation(housename, queryArgs, queryBy);
    }
    
}

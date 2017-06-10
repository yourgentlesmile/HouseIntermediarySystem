package indi.group.his.controller;


import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import indi.group.his.model.Contract;
import indi.group.his.model.HouseInformation;
import indi.group.his.model.WorkInfoUnionUser;
import indi.group.his.model.WorkInformation;
import indi.group.his.services.IContractNoneCompleteService;
import indi.group.his.services.IHouseInformationService;
import indi.group.his.services.IUserInformationService;
import indi.group.his.services.IUserServices;
import indi.group.his.services.IWorkInformationService;
import indi.group.his.services.impl.ContractNoneCompleteServiceImpl;
import indi.group.his.services.impl.HouseInformationServiceImpl;
import junit.framework.Test;

@Controller
@RequestMapping("/Achivement")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    
    @Autowired
    private IWorkInformationService workInfoService;
    @Autowired
    private IHouseInformationService houseInfoService;
    @Autowired
    private IContractNoneCompleteService ContractNoneCompleteService;
    @Autowired
    private IUserInformationService userInformationService;
    public TestController() {
        // TODO Auto-generated constructor stub
    }
    @GetMapping("")
    public String achivementPage(){
        return "achivement";
    }
    @GetMapping("/notice")
    public String noticePage(){
        return "notice";
    }
    
    @GetMapping("/housesource")
    public String HouseSourcePage(){
        return "housesource";
    }
   
    @ResponseBody
    @GetMapping("/getWorkInfo/{type}/{userid}")
    public WorkInformation[] getAllUserInformation(@PathVariable(value = "type")Integer findType,
                                                   @PathVariable(value = "userid",required = false)Integer userid) {
        if(findType == 1){
          WorkInformation[] result = new WorkInformation[1];
          result[0] = workInfoService.getWorkInformation(userid);
          return result;
        }else{
            return workInfoService.getAllUserInformation();
        }
    }
    @ResponseBody
    @GetMapping("/getAchivement/{order}")
    public WorkInfoUnionUser[] getAllUser(@PathVariable(value = "order")int order){
        return workInfoService.getAllUserAchivement(order);
        
    }
    @ResponseBody
    @GetMapping("/getHouseInfo")
    public HouseInformation[] gethouseInfo(){
        return houseInfoService.getHouseInformation(null, null, HouseInformationServiceImpl.FETCH_ALL);
    }
    @ResponseBody
    @PostMapping("/queryHouseInfo")
    public HouseInformation[] queryHouseInfo(@RequestParam(name = "min",required = false)Float min,
                                             @RequestParam(value = "max",required = false)Float max,
                                             @RequestParam(value = "type",required = false)Integer queryBy,
                                             @RequestParam(value = "housename",required = false)String housename){
        if(queryBy.intValue() == 0) queryBy = HouseInformationServiceImpl.FETCH_ALL;
        Map<String, String> queryArgs = new HashMap<>();
        if(queryBy.intValue() == HouseInformationServiceImpl.QUERY_BY_AREA){
            queryArgs.put("area_min", Float.toString(min.floatValue()));
            queryArgs.put("area_max", Float.toString(max.floatValue()));
        }else if(queryBy.intValue() == HouseInformationServiceImpl.QUERY_BY_PRICE) {
            queryArgs.put("price_min", Float.toString(min.floatValue()));
            queryArgs.put("price_max", Float.toString(max.floatValue()));
        }
        return houseInfoService.getHouseInformation(housename, queryArgs, queryBy);
    }

    @ResponseBody
    @PostMapping("/deleteHouseInfo")
    public String deleteHouseInfo(@RequestBody HouseInformation houseInformation,
    							  @RequestParam("type") int type){
    	
    	return houseInfoService.deleteHouseInformation(houseInformation, type) + "";
    }
    
    @ResponseBody
    @PostMapping("/addHouseInfo")
    public String addHouseInfo(@RequestBody HouseInformation houseInformation){
    	
    	return houseInfoService.addHouseInformation(houseInformation) + "";
    }
    
    @PostMapping("/updateContract")
    @ResponseBody
    public String updateContract(@RequestBody String data){
        JSONObject jsonObject = JSONObject.parseObject(data);
        String contractId = jsonObject.getString("contractId");
        String employeeName = jsonObject.getString("employeeName");
        logger.debug("[contractid]" + contractId + "[employee]" + employeeName);
        Contract contract = ContractNoneCompleteService.getContract(contractId, ContractNoneCompleteServiceImpl.QUERY_BY_CONTRACTID)[0];
        int userId = userInformationService.getUserId(employeeName);
        logger.debug("[userid]" + userId);
        WorkInformation workInformation = workInfoService.getWorkInformation(userId);
        float gold = contract.getDealGold().floatValue() * (float)0.012;
        float goldNow = Float.parseFloat(workInformation.getPerformanceNow());
        float goldTotal = Float.parseFloat(workInformation.getPerformanceTotal());
        logger.debug("[gold]:" + gold + "[goldNow]" + goldNow + "[goldTotal]" + goldTotal);
        workInformation.setPerformanceNow((gold+goldNow)+"");
        workInformation.setPerformanceTotal((gold+goldTotal)+"");
        workInfoService.modifyWorkInformation(workInformation);
        ContractNoneCompleteService.deleteContract(contract);
        return "1";
    }
    
    
}

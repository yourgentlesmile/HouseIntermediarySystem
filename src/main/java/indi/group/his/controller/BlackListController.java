package indi.group.his.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import indi.group.his.model.Blacklist;
import indi.group.his.services.IBlackListService;
import indi.group.his.services.impl.BlackListServiceImpl;

@Controller
@RequestMapping("/BlackList")
public class BlackListController {
    
    @Autowired
    private IBlackListService blackListService = null;
    public BlackListController() {
        // TODO Auto-generated constructor stub
    }
    @GetMapping("")
    public String BlackListPage(){
        return "blacklist";
    }
    @GetMapping("/query/{type}/{value}")
    @ResponseBody
    public Blacklist[] queryBlackList(@PathVariable("type") int type,
                                      @PathVariable("value")String value) {
        if(type == BlackListServiceImpl.QUERY_BY_ID){
            return blackListService.getRecord(value, null, type);
        }else if (type == BlackListServiceImpl.QUERY_BY_CLIENTNAME) {
            return blackListService.getRecord(null, value, type);
        }else {
            return blackListService.getRecord(null, null, type);
        }
        
    }
    @PostMapping("/add")
    @ResponseBody
    public String addBlackList(@RequestBody Blacklist blacklist){
        return blackListService.addRecord(blacklist) + "";
    }
    @PostMapping("/modify")
    @ResponseBody
    public String modifyBlackList(@RequestBody Blacklist blacklist){
        return blackListService.modifyRecord(blacklist) + "";
    }
    
    @PostMapping("/delete")
    @ResponseBody
    public String deleteBlackList(@RequestBody Blacklist blacklist){
        return blackListService.deleteRecord(blacklist) + "";
    }
}

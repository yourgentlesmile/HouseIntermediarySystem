package indi.group.his.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import indi.group.his.model.CompleteContract;
import indi.group.his.model.Contract;
import indi.group.his.services.IContractCompleteService;
import indi.group.his.services.IContractNoneCompleteService;

@Controller
@RequestMapping("/Contract")
public class ContractController {

    @Autowired
    private IContractCompleteService completeContractSrv = null;
    @Autowired
    private IContractNoneCompleteService noneCompleteContractSrv = null;
    @GetMapping("/complete/list/{type}/{queryValue}")
    @ResponseBody
    public CompleteContract[] getContract(@PathVariable(value = "type",      required = false)int findby,
                                          @PathVariable(value = "queryValue",required = false)String value) {
        return completeContractSrv.getContract(value, findby);
        
    }
    @GetMapping("")
    public String testContract(){
    	return "contract";
    }
    @PostMapping("/complete/add")
    @ResponseBody
    public String addContract(@RequestBody CompleteContract completeContract) {
        return completeContractSrv.addContract(completeContract)+"";
    }
    @PostMapping("/complete/delete")
    @ResponseBody
    public String deleteContract(@RequestBody CompleteContract completeContract){
        return completeContractSrv.deleteContract(completeContract)+"";
    }
    @PostMapping("/complete/update")
    @ResponseBody
    public String modifyContract(@RequestBody CompleteContract completeContract){
        return completeContractSrv.modifyContract(completeContract)+"";
    }
    
    @GetMapping("/none/list/{type}/{queryValue}")
    @ResponseBody
    public Contract[] getNoneContract(@PathVariable(value = "type",      required = false)int findby,
                                      @PathVariable(value = "queryValue",required = false)String value) {
        return noneCompleteContractSrv.getContract(value, findby);
}
    @PostMapping("/none/add")
    @ResponseBody
    public String addNoneContract(@RequestBody Contract noneContract) {
        return noneCompleteContractSrv.addContract(noneContract)+"";
    }
    @PostMapping("/none/delete")
    @ResponseBody
    public String deleteNoneContract(@RequestBody Contract noneContract){
        return noneCompleteContractSrv.deleteContract(noneContract)+"";
    }
    @PostMapping("/none/update")
    @ResponseBody
    public String modifyNoneContract(@RequestBody Contract completeContract){
        return noneCompleteContractSrv.modifyContract(completeContract)+"";
    }
}

package indi.group.his.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import indi.group.his.model.Admin;
import indi.group.his.model.ClientInformation;
import indi.group.his.model.User;
import indi.group.his.model.UserInformation;
import indi.group.his.services.IAdminService;
import indi.group.his.services.IClientInformationService;
import indi.group.his.services.IUserInformationService;
import indi.group.his.services.IUserServices;

@Controller
@RequestMapping("/Account")
public class AccountController {
    
    @Autowired
    private IAdminService adminService = null;
    @Autowired
    private IUserServices userServices = null;
    @Autowired
    private IUserInformationService userInformationService = null;
    @Autowired
    private IClientInformationService clientInformationService = null;
    @GetMapping("/Admin/List/{type}/{value}")
    @ResponseBody
    public Admin[] adminList(@PathVariable(value = "type", required = false) int type,
                             @PathVariable(value = "value",required = false) String value) {
        Admin admin = new Admin();
        admin.setAdminId(Integer.parseInt(value));
        return adminService.getAdmin(admin, type);
    }
    @PostMapping("/Admin/Add")
    @ResponseBody
    public int addAdmin(@RequestBody Admin admin) {
        return adminService.addAdmin(admin);
    }
    @PostMapping("/Admin/Delete")
    @ResponseBody
    public int deleteAdmin(@RequestBody Admin admin) {
        return adminService.deleteAdmin(admin);
    }
    @PostMapping("/Admin/update")
    @ResponseBody
    public int modifyAdmin(@RequestBody Admin admin) {
        return adminService.modifyAdmin(admin);
    }
    
    @GetMapping("/ClientInfo/List")
    @ResponseBody
    public ClientInformation[] clientList(@RequestParam(value = "type", required = false) Integer type,
                              @RequestParam(value = "username",required = false) String username,
                              @RequestParam(value = "clientid",required = false) String clientid) {
        return clientInformationService.getClientInformation(username, Integer.parseInt(clientid==null?"1":clientid), type.intValue());
    }
    @PostMapping("/ClientInfo/Add")
    @ResponseBody
    public boolean addClientInfo(@RequestBody ClientInformation clientInformation) {
        return clientInformationService.addClient(clientInformation);
    }
    @PostMapping("/ClientInfo/Delete")
    @ResponseBody
    public boolean deleteClientInfo(@RequestBody ClientInformation clientInformation) {
        return clientInformationService.deleteClient(clientInformation);
    }
    @PostMapping("/ClientInfo/update")
    @ResponseBody
    public boolean modifyClientInfo(@RequestBody ClientInformation clientInformation) {
        return clientInformationService.modifyClientInformation(clientInformation);
    }
    
    @GetMapping("/User/List/{id}")
    @ResponseBody
    public User userList(@PathVariable("id")int id) {
        return userServices.getUser(id);
    }
    @PostMapping("/User/query")
    @ResponseBody
    public boolean queryUser(@RequestBody String username) {
        return userServices.queryUserExist(username);
    }
    @PostMapping("/User/add")
    @ResponseBody
    public boolean registerUser(@RequestBody User user) {
        boolean result = userServices.registerUser(user);
        if(result){
            UserInformation userInformation = new UserInformation();
            userInformation.setUserId(userServices.getUserId(user.getUserName()));
            userInformationService.addUserInformation(userInformation);
        }
        return result;
    }
    
    @PostMapping("/userInfo/update")
    @ResponseBody
    public int modifyUserInformation(@RequestBody UserInformation userInformation){
        return userInformationService.modifyUserInformation(userInformation);
    }
}

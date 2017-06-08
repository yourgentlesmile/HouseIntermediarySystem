package indi.group.his.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import indi.group.his.services.IUserServices;

@Controller
@RequestMapping("")
public class CheckLoginController {
    private static final Logger logger = LoggerFactory.getLogger(CheckLoginController.class);
    @Autowired
    private IUserServices userServices = null;
    @GetMapping("")
    public String home(HttpServletRequest request,HttpServletResponse response,@CookieValue(value = "Histoken",required = false) String cookies) {
        logger.debug((cookies == null) + "");
        if(cookies == null) return "redirect:Index";
        else {
            String[] data = cookies.split("/");
            if(userServices.getUserId(data[0]) == Integer.parseInt(data[1])){
                return "redirect:loginsuccess";
            }else{
                Cookie ck = new Cookie("Histoken", null);
                ck.setMaxAge(0);
                response.addCookie(ck);
                return "redirect:Index";
            }
        }
    }
    @RequestMapping("/loginsuccess")
    public String lo(HttpServletRequest request ,HttpServletResponse response){
        request.setAttribute("usedspace", "100MB");
        request.setAttribute("totalspace", "50GB");
        request.setAttribute("percent", "70%");
        request.setAttribute("username", "熊诚");
        return "loginsuccess";
    }
}